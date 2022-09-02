package bodegon;

public class Comida {
    private String nombre;
    private double precio;
    
    public Comida(String n, double p){
        this.nombre = n;
        this.precio = p;
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
}
