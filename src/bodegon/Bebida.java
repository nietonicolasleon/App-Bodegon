package bodegon;

public class Bebida {
    private String nombre;
    private double precio;
    private String contenido;

    public Bebida(String n, double p, String c) {
        this.nombre = n;
        this.precio = p;
        this.contenido = c;
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

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
