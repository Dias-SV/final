package Medicina;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class EscrituraCSV {

    public static void guardar(HashMap<String, Medicamento> tabla, String ruta) throws IOException {
        try (BufferedWriter bw = Files.newBufferedWriter(Paths.get(ruta))) {
            for (Medicamento m : tabla.values()) {
                Ficha f = m.getFicha();
                bw.write(String.join(",",
                    escapar(m.getNombre()), //nombre
                    String.valueOf(m.getPrecio()), //precio
                    String.valueOf(m.getStock()), //stock
                    escapar(f.getDenominacion()), //denominacion
                    escapar(f.getMarcaLab()), 
                    escapar(f.getPresentacion()),
                    String.valueOf(f.getConcentracion())
                ));
                bw.newLine();
            }
        }
    }

    // ---------- CARGAR ----------
    public static HashMap<String, Medicamento> cargar(String ruta) throws IOException {
        HashMap<String, Medicamento> tabla = new HashMap<>();
        List<String> lineas = Files.readAllLines(Paths.get(ruta));

        for (int i = 1; i < lineas.size(); i++) {
            if (lineas.get(i).isBlank()) continue;
            String[] c = separar(lineas.get(i));
            Ficha ficha = new Ficha(c[3], c[4], c[5], Double.parseDouble(c[6]));
            Medicamento med = new Medicamento(c[0], ficha, Double.parseDouble(c[1]));
            med.setStock(Integer.parseInt(c[2]));

            tabla.put(med.getNombre(), med);   // la clave es el nombre
        }
        return tabla;
    }

    private static String escapar(String s) {
        if (s == null) return "";
        if (s.contains(",") || s.contains("\"") || s.contains("\n")) {
            return "\"" + s.replace("\"", "\"\"") + "\"";
        }
        return s;
    }

    private static String[] separar(String linea) {
        List<String> campos = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        boolean enComillas = false;

        for (int i = 0; i < linea.length(); i++) {
            char ch = linea.charAt(i);
            if (ch == '"') {
                if (enComillas && i + 1 < linea.length() && linea.charAt(i + 1) == '"') {
                    sb.append('"');
                    i++;
                } else {
                    enComillas = !enComillas;
                }
            } else if (ch == ',' && !enComillas) {
                campos.add(sb.toString());
                sb.setLength(0);
            } else {
                sb.append(ch);
            }
        }
        campos.add(sb.toString());
        return campos.toArray(new String[0]);
    }
}