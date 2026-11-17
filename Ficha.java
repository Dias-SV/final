public class Ficha{
    private String denominacion;
    private String marcaLab;
    private String presentacion;
    private Double concentracion;

    public Ficha(String denominacion, String marcaLab, String presentacion, Double concentracion){
        this.denominacion=denominacion;
        this.marcaLab=marcaLab;
        this.presentacion=presentacion;
        this.concentracion=concentracion;
    }
    public String getDenominacion(){
        return denominacion;
    }
    public String getMarcaLab(){
        return marcaLab; 
    }
    public String getPresentacion(){
        return presentacion;
    }
    public Double getConcentracion(){
        return concentracion;
    }

}