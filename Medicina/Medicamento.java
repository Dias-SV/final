package Medicina;

public class Medicamento{
    private Ficha ficha;
    private String nombre;
    private double precio;
    private int stock;

    public Medicamento(String nombre, Ficha ficha, Double precio){
        this.nombre = nombre;
        this.ficha = ficha;
        this.precio = precio;
    }

    public Ficha getFicha(){
        return ficha;
    }
    public void setFicha(Ficha ficha){
        this.ficha = ficha;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public void reabastecer(int cantidad){
        this.stock += cantidad;
    }

    public void venderCantidad(int cantidad){
        if(cantidad > this.stock){
            System.out.println("No hay suficiente producto para esa venta");
        }else{
            stock-=cantidad;
            System.out.println("Se restaron "+cantidad+" unidades de ");
        }
    }

    public void venderUno(){
        if(this.stock > 1){
            System.out.println("No hay suficiente producto para esa venta");
        } else{
            stock--;
            System.out.println("Se vendio un " + nombre);
        }
    }
}