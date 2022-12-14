package bodegon;

//Importamos las ArrayList para la clase
import java.util.ArrayList;

public class Mesa {
    //Atributos
    private static int cantMesas;
    private int numMesa;
    private  int cantPersonas;
    private double abonoPrevio;
    private ArrayList<Comida> comidas = new ArrayList();
    private ArrayList<Bebida> bebidas = new ArrayList();

    /*Método Constructor*/
    public Mesa(int cantP, double aP) {
        Mesa.cantMesas++;
        this.numMesa = Mesa.cantMesas;
        this.cantPersonas = cantP;
        this.abonoPrevio = aP;
    }
    
    /*Métodos*/
    public double CalcularPrecioBebidas(){
        /*Este método calcula el precio de todas las bebidas*/
        double total = 0;
        for (int i = 0; i < this.bebidas.size(); i++) {
            total += this.bebidas.get(i).getPrecio();
        }
        return total;
    }
    
    public double CalcularPrecioXPersona(){
        /*Este método calcula el precio que deberá pagar cada persona por separado*/
        double total = 0;
        for (int i = 0; i < this.comidas.size(); i++) {
            total += this.comidas.get(i).getPrecio();
        }
        total -= this.abonoPrevio;
        total += CalcularPrecioBebidas();
        total = total / this.cantPersonas;
        return total;
    }
    
    public double CalcularPrecioTotal(){
        /*Este método calcula el precio total*/
        double total = 0;
        total += (CalcularPrecioXPersona() * this.cantPersonas);
        return total;
    }
    
    public void DetalleCuenta(){
        /*Este método imprime la información que se le será otorgada al cliente*/
        System.out.println("***** Mesa: " + this.numMesa + " *****");
        System.out.println("Comensales: " + this.cantPersonas);
        System.out.println("Detalle de los pedidos: ");
        MostrarComidas();
        System.out.println("--------------------------------------------------");
        MostrarBebidas();
        System.out.println("--------------------------------------------------");
        System.out.println("El precio por persona es de: $" + CalcularPrecioXPersona());
        System.out.println("Y el precio total de: $" + CalcularPrecioTotal());
    }
    
    /*Los siguientes métodos permiten agregar, eliminar y mostrar contenido de las listas*/
    public void AgregarComida(Comida c){
        this.comidas.add(c);
    }
    
    public void AgregarBebida(Bebida b){
        this.bebidas.add(b);
    }
    
    public void EliminarBebida(int b){
        this.bebidas.remove(b);
    }
    
    public void MostrarComidas(){
        for (int i = 0; i < this.comidas.size(); i++) {
            System.out.println("La comida: " + this.comidas.get(i).getNombre() + " cuesta: " + this.comidas.get(i).getPrecio() + ".");
        }
    }
    
    public void MostrarBebidas(){
        for (int i = 0; i < this.bebidas.size(); i++) {
            System.out.println("La bebida: " + this.bebidas.get(i).getNombre() + " cuesta: " + this.bebidas.get(i).getPrecio() + ". Tiene un contenido de: " + this.bebidas.get(i).getContenido() + ".");
        }
    }

    /*Getters y Setters*/
    public static int getCantMesas() {
        return cantMesas;
    }

    public static void setCantMesas(int cantMesas) {
        Mesa.cantMesas = cantMesas;
    }

    public int getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public double getAbonoPrevio() {
        return abonoPrevio;
    }

    public void setAbonoPrevio(double abonoPrevio) {
        this.abonoPrevio = abonoPrevio;
    }

    public ArrayList<Comida> getComidas() {
        return comidas;
    }

    public void setComidas(ArrayList<Comida> comidas) {
        this.comidas = comidas;
    }

    public ArrayList<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(ArrayList<Bebida> bebidas) {
        this.bebidas = bebidas;
    }
}
