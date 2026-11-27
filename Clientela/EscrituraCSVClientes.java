package Clientela;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class EscrituraCSVClientes {

    public static void guardar(HashMap<String, Cliente> tabla, String ruta) throws IOException {
        try (BufferedWriter bw = Files.newBufferedWriter(Paths.get(ruta))) {
            for (Cliente cliente : tabla.values()) {
                Direccion direccion = cliente.getDireccion();
                if (direccion != null) {
                    bw.write(String.join(",",
                    escapar(cliente.getNombre()),
                    escapar(cliente.getApellido()),
                    escapar(cliente.getCorreo()),
                    String.valueOf(cliente.getTelefono()),
                    escapar(direccion.getCalle()),
                    String.valueOf(direccion.getNumero()), 
                    escapar(direccion.getColonia()),
                    escapar(direccion.getAlcaldia()),
                    escapar(direccion.getEstado()),
                    String.valueOf(direccion.getCodigoPostal())
                    ));
                    
                } else {
                    bw.write(String.join(",",
                    escapar(cliente.getNombre()),
                    escapar(cliente.getApellido()),
                    escapar(cliente.getCorreo()),
                    String.valueOf(cliente.getTelefono()),
                    "", "", "", "", "", "")); //Deja espacios en blanco para no tener dos casos en la carga
                }
                
                bw.newLine();
            }
        }
    }

    public static HashMap<String, Cliente> cargar(String ruta) throws IOException {
        HashMap<String, Cliente> tabla = new HashMap<>();
        List<String> lineas = Files.readAllLines(Paths.get(ruta));

        for (int i = 1; i < lineas.size(); i++) {
            if (lineas.get(i).isBlank()) continue;
            String[] dato = separar(lineas.get(i));

            if (dato.length < 10) continue; 
            Cliente cliente;
            if (!dato[4].isBlank()) {
                Direccion direccion = new Direccion(dato[4], Short.parseShort(dato[5]), dato[6], dato[7], dato[8], Integer.parseInt(dato[9]));
                cliente = new Cliente(dato[0], dato[1], dato[2], Long.parseLong(dato[3]), direccion);
            } else {
                cliente = new Cliente(dato[0], dato[1], dato[2], Long.parseLong(dato[3]));
            }
            
            tabla.put(cliente.getNombre(), cliente);   // la clave es el nombre
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