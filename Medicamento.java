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
    public reabastecer(int cantidad){
        this.stock+=cantidad;
    }
    public venderCantidad(int cantidad){
        if(cantidad>this.stock){
            System.out.println("No hay suficiente producto para esa venta");
        }else{
            stock-=cantidad;
            System.out.println("Se restaron "+cantidad+" unidades de ");
        }
    }
    public venderUno(){
        if(this.stock>=1){

        }
    }
}