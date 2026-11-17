import java.time.LocalDate;

public class Compra {
    private LocalDate fecha;
    private Medicamento medicamento;
    private short cantidadCajas;

    public Compra(LocalDate fecha, Medicamento medicamento, short cantidadCajas) {
        this.fecha = fecha;
        this.medicamento = medicamento;
        this.cantidadCajas = cantidadCajas;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }
    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public short getCantidadCajas() {
        return cantidadCajas;
    }
    public void setCantidadCajas(short cantidadCajas) {
        this.cantidadCajas = cantidadCajas;
    }
    
    public void mostrarCompra() {
        System.out.println("Fecha: " + fecha);
        System.out.println("Medicamento: " + medicamento);
        System.out.println("Concentracion: " + medicamento.getConcentracion());
        System.out.println("Cantidad de cajas: " + cantidadCajas);
    }
}
