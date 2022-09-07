package bodegon;

public class Bodegon {
    public static void main(String[] args) {
        Comida c = new Comida("Comida de Tres Pasos", 2500);
        Bebida b1 = new Bebida("Agua Saborizada de Pomelo", 300, "500 ml.");
        Bebida b2 = new Bebida("Agua Saborizada de Manzana", 300, "500 ml.");
        Bebida b3 = new Bebida("Agua Mineral sin gas", 250, "500 ml.");
        Bebida b4 = new Bebida("Lata Pepsi", 300, "450 ml.");
        Bebida b5 = new Bebida("Lata Seven Up", 300, "450 ml.");
        Bebida b6 = new Bebida("Cerveza Ipa Andina", 400, "500 ml");
        Bebida b7 = new Bebida("Cerveza Andes Rubia", 400, "500 ml");
        Bebida b8 = new Bebida("Fuzion Alta Sweet", 700, "750 ml.");
        Bebida b9 = new Bebida("Portillo Sauvignon Blanc", 700, "750 ml.");
        Bebida b10 = new Bebida("Trumpeter Reserve Chardonnay", 2500, "750 ml.");
        Bebida b11 = new Bebida("Novecento Malbec", 600, "750 ml.");
        Bebida b12 = new Bebida("Valentín Lacrado Malbec", 700, "750 ml.");
        Bebida b13 = new Bebida("Circus Roble Cabernet Sauvignon", 800, "750 ml.");
        Bebida b14 = new Bebida("Circus Roble Malbec", 800, "750 ml.");
        Bebida b15 = new Bebida("Latitud 33 Cabernet Suavignon", 900, "750 ml.");
        Bebida b16 = new Bebida("Lola Montes Red Blend", 900, "750 ml.");
        Bebida b17 = new Bebida("La Vuelta Cabernet Sauvignon", 1000, "750 ml.");
        Bebida b18 = new Bebida("La Vuelta Malbec", 1000, "750 ml.");
        Bebida b19 = new Bebida("San Felipe Roble Cabernet Sauvignon", 1400, "750 ml.");
        Bebida b20 = new Bebida("San Felipe Roble Malbec", 1400, "750 ml.");
        Bebida b21 = new Bebida("Cruz Alta Cabernet Sauvignon", 1600, "750 ml.");
        Bebida b22 = new Bebida("Cruz Alta Malbec", 1600, "750 ml.");
        Bebida b23 = new Bebida("Cara Sucia Sangiovesse", 1700, "750 ml.");
        Bebida b24 = new Bebida("Cara Sucia Nebiollo", 1700, "750 ml.");
        Bebida b25 = new Bebida("Trumpeter Malbec", 2200, "750 ml.");
        Bebida b26 = new Bebida("Novecento Extra Dulce", 800, "750 ml.");
        Bebida b27 = new Bebida("Federico de Alvear Extra Brut", 1000, "750 ml.");
        Bebida b28 = new Bebida("San Felipe Torrontés Extra Dulce", 1500, "750 ml.");
        Bebida b29 = new Bebida("San Felipe Rosé de Malbec Extra Dulce", 1500, "750 ml.");
        Bebida b30 = new Bebida("San Felipe Extra Brut", 1500, "750 ml.");
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