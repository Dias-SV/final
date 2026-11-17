package Medicina;

public class Ficha{
    private String denominacion;
    private String marcaLab;
    private String presentacion;
    private double concentracion;

    public Ficha(String denominacion, String marcaLab, String presentacion, double concentracion){
        this.denominacion=denominacion;
        this.marcaLab=marcaLab;
        this.presentacion=presentacion;
        this.concentracion=concentracion;
    }

    public String getDenominacion(){
        return denominacion;
    }
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getMarcaLab(){
        return marcaLab; 
    }
    public void setMarcaLab(String marcaLab) {
        this.marcaLab = marcaLab;
    }

    public String getPresentacion(){
        return presentacion;
    }
    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public double getConcentracion(){
        return concentracion;
    }
    public void setConcentracion(double concentracion) {
        this.concentracion = concentracion;
    }

}