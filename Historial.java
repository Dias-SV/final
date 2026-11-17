import java.time.LocalDate;
import java.util.ArrayList;

public class Historial {
    private ArrayList<Compra> compras;

    public Historial() {
        this.compras = new ArrayList<>();
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public Compra buscarCompra(LocalDate fecha) {
        int i = 0;
        while (!compras.get(i).getFecha().isEqual(fecha) && i < (compras.size() - 1)) {
            i++;
        }
        if (i == compras.size() - 1 || !compras.get(i).getFecha().isEqual(fecha)) {
            System.out.println("No se encontro ninguna compra con esta fecha");
            return null;
        } else {
            return compras.get(i);
        }
    }
}