import java.util.Scanner;
import Clientela.*;
import Stock.*;
import Medicina.*;

public class Principal {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;

        
        do {
            System.out.println();
            System.out.println("-----Farmacia-----\n");
            System.out.println("1. Consulta medicamento");
            System.out.println("2. Consulta de clientes");
            System.out.println("3. Inventario");
            System.out.println("4. Rsumen y control financiero");
            System.out.println("0. Salir");
            opcion = entrada.nextInt(); //Meterle una excepcion
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    menuMedicamento();
                    break;

                case 2:
                    menuClientes();
                    break;

                case 3:
                    menuInventario();
                    break;

                case 4:
                    menuFinanzas();
                    break;

                case 0 :
                    System.out.println("Cerrando programa...");
                    break;

                default:
                    break;
            }
            
        } while (opcion != 0); 
    }
    
    public static void menuMedicamento() {
        int opcion;

        do {
            System.out.println("---Busqueda y venta de medicamentos---");
            System.out.println("1. Buscar medicamento");
            System.out.println("2. Vender medicamento");
            System.out.println("0. Salir del submenu");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    
                    break;

                case 2:

                    break;

                case 0:
                    System.out.println("Cerrando submenu...");
                    break;
            
                default:
                    System.out.println();
                    break;
            }
        } while (opcion != 0);
    }

    public static void menuClientes() {
        int opcion;

        do {
            System.out.println("---Control de clientes---");
            System.out.println("1. Buscar cliente");
            System.out.println("2. Registrar cliente");
            System.out.println("3. Consultar historial");
            System.out.println("0. Salir del submenu");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    //Pedir datos y crear objeto

                    break;

                case 2:
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombre = entrada.nextLine();
                    ControlClientes.buscarCliente(nombre);
                    break;

                case 3:
                    
                    break;
            
                case 0:
                    System.out.println("Cerrando submenu...");
                    break;

                default:
                    break;
            }
        } while (opcion != 0);
    }

    public static void menuInventario() {
        int opcion;

        do {
            System.out.println("---Control del inventario---");
            System.out.println("1. Registro de factura");
            System.out.println("2. Actualizacion de inventario");
            System.out.println("3. Gestion de lotes");
            System.out.println("0. Salir del submenu");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    
                    break;

                case 2:
                    
                    break;

                case 3:
                    
                    break;
            
                case 0:
                    System.out.println("Cerrando submenu...");
                    break;

                default:
                    break;
            }
        } while (opcion != 0);
    }

    public static void menuFinanzas() {
        int opcion;

        do {
            System.out.println("---Control finaciero---");
            System.out.println("1. Consultar ingresos");
            System.out.println("2. Margen de utilidad");
            System.out.println("0. Salir del submenu");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    
                    break;

                case 2:
                    
                    break;
            
                case 0:
                    System.out.println("Cerrando submenu...");
                    break;

                default:
                    break;
            }
        } while (opcion != 0);
    }
}
