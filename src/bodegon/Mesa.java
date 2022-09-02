package bodegon;

import java.util.ArrayList;

public class Mesa {
    private static int cantMesas;
    private int numMesa;
    private  int cantPersonas;
    private double abonoPrevio;
    private ArrayList<Comida> comidas = new ArrayList();
    private ArrayList<Bebida> bebidas = new ArrayList();

    public Mesa(int cantP, double aP) {
        Mesa.cantMesas++;
        this.numMesa = Mesa.cantMesas;
        this.cantPersonas = cantP;
        this.abonoPrevio = aP;
    }
    
    

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
