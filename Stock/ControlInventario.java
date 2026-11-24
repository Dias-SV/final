package Stock;

import Medicina.Medicamento;

public class ControlInventario{

    public static void verMedicinas(){
        if (Inventario.medicinas == null || Inventario.medicinas.isEmpty()) {
            System.out.println("No hay medicinas en el inventario.");
            return;
        }

        for (Medicamento m : Inventario.medicinas.values()) {
            System.out.println(m.getNombre()
                + " | $" + m.getPrecio()
                + " | stock: " + m.getStock()
                + " | " + m.getFicha().getMarcaLab()
                + " | " + m.getFicha().getPresentacion()
                + " " + m.getFicha().getConcentracion());
        }
    }
}