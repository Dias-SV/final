package Stock;

import java.util.HashMap;
import java.io.*;
import java.nio.file.NoSuchFileException;

import Medicina.EscrituraCSV;
import Medicina.Medicamento;

public class Inventario {
    public static HashMap<String, Medicamento> medicinas = null;

    static{
        try {
            medicinas = EscrituraCSV.cargar("archivo.csv");
            System.out.println("Se cargaron las medicinas correctamente");
        } catch (NoSuchFileException e) {
            System.out.println("El archivo no existe todavía, se empieza con inventario vacío.");
        } catch (NumberFormatException e) {
            System.out.println("El CSV tiene un número mal escrito: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hay una fila con columnas faltantes.");
        } catch (IOException e) {
            System.out.println("Hubo un problema con el archivo");
        }
    }
    
}
