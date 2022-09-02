package bodegon;

public class Comida {
    /*Esta clase hace referencia a la comida vendida en el bodegón*/
    //Atributos
    private String nombre;
    private double precio;
    
    /*Método constructor*/
    public Comida(String n, double p){
        this.nombre = n;
        this.precio = p;
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
}
