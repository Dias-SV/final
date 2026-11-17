public class Factura{
    double precio;
    private Medicamento medicamento;
    String nombrem;
    
    public factura(String nombrem, Medicamento medicamento, double precio){
        this nombrem=nombrem;
        this medicamento=medicamento;
        this precio=precio;
    }
    public String getnombrem(){
        return nombrem;
    }
    public void setnombrem(){
        this nombrem=nombrem;
    }
    public Medicamento getmedicamento(){
        return medicamento;
    }
    public double getprecio(){
        return precio;
    }
    public void setprecio(){
        this precio=precio;
    }
    public void impfactura(){
        System.out.println("Nombre del medicamento: " + getnombrem());
        System.out.println("Precio del medicamento: " + getprecio());
    }
}