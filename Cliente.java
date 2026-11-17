public class Cliente{
    private String nombre;
    private String apellido;
    private String correo;
    private long telefono;
    private int id;
    private Direccion direccion;
 
    public Cliente(String nombre, String apellido, String correo, long telefono, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.nombre = apellido;
    }

    public String getNombreCompleto() {
        return nombre + apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombreCompleto());
        System.out.println("Correo: " + correo);
        System.out.println("Teléfono: " + telefono);
        if (direccion != null) {
            System.out.println("Direccion: ");
            direccion.mostrarDomicilio();
        }
        System.out.println("ID: " + id);
    }

}