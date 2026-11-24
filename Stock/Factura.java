package Stock;

public class Factura{
    private String proveedor;
    private int numero;
    private int montoTotal;

    public Factura(String proveedor, int numero, int montoTotal) {
        this.proveedor = proveedor;
        this.numero = numero;
        this.montoTotal = montoTotal;
    }

    public String getProveedor() {
        return proveedor;
    }
    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getMontoTotal() {
        return montoTotal;
    }
    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }
}