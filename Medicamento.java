public class Medicamento{
    private Ficha ficha;
    private String nombre;
    private double precio;
    private int stock;
    public medicamento(String nombre, Ficha ficha, Double precio){
        this.nombre=nombre;
        this.ficha=ficha;
        this.precio=precio;
    }
}