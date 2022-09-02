package bodegon;

public class Bebida {
    /*Esta clase hace referencia a las bebidas vendidas en el bodegón*/
    //Atributos
    private String nombre;
    private double precio;
    private String contenido;

    /*Método constructor*/
    public Bebida(String n, double p, String c) {
        this.nombre = n;
        this.precio = p;
        this.contenido = c;
    }

    /*Métodos Accesorios - Getters y Setters*/
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
