package bodegon;

public class Bodegon {
    public static void main(String[] args) {
        Comida c = new Comida("Comida de Tres Pasos", 2500);
        Bebida b1 = new Bebida("Vino San Felipe Malbec Roble", 1000, "750 ml.");
        Mesa mesa1 = new Mesa(5, 7500);
        mesa1.AgregarComida(c);
        mesa1.AgregarComida(c);
        mesa1.AgregarComida(c);
        mesa1.AgregarComida(c);
        mesa1.AgregarComida(c);
        mesa1.AgregarBebida(b1);
        mesa1.AgregarBebida(b1);
        mesa1.AgregarBebida(b1);
        mesa1.DetalleCuenta();
    }
}
