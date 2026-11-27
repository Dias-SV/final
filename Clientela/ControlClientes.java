package Clientela;  

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class ControlClientes{
    private static HashMap<String, Cliente> clientes;

    static {
        try {
            File archivo = archivo();
            clientes = EscrituraCSVClientes.cargar(archivo.getPath());
        } catch (IOException e) {
            System.out.println("No se pudo cargar clientes: " + e.getMessage());
            clientes = new HashMap<>();
        }
    }
    
    private static File archivo() throws IOException{
        File archivo = new File("clientes.csv");
        if (!archivo.exists()) {
            archivo.createNewFile();
        }
        return archivo;
    }

    public static void agregarCliente(String nombre, Cliente cliente) {
        clientes.put(nombre, cliente);
    }

    public static Cliente buscarCliente(String nombre) {
        return clientes.get(nombre);
    }

    private static void guardarCambios() {
        try {
            EscrituraCSVClientes.guardar(clientes, "clientes.csv");
        } catch (IOException e) {
            System.out.println("No se pudo guardar clientes: " + e.getMessage());
        }
    }

}