package Clientela;

import java.util.HashMap;

public class ControlClientes{
    private static HashMap<String, Cliente> clientes = new HashMap<>();

    public void agregarCliente(String nombre, Cliente cliente) {
        clientes.put(nombre, cliente);
    }

    public Cliente buscarCliente(String nombre) {
        return clientes.get(nombre);
    }

}