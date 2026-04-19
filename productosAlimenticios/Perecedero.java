public class Perecedero extends Producto {
    private int diasACaducar;

    public Perecedero(int codigo, String descripcion, double precio, int diasACaducar) {
        super(codigo, descripcion, precio);
        this.diasACaducar = diasACaducar;
    }

    private int obtenerFactorDivision() {
        switch (diasACaducar) {
            case 1: return 4;
            case 2: return 3;
            case 3: return 2;
            default: return 1;
        }
    }

    @Override
    public double calcularPrecioVenta() {
        return precio / obtenerFactorDivision();
    }

    @Override
    public String toString() {
        return "Tipo: Perecedero, " + super.toString() + 
               ", Días a caducar: " + diasACaducar + 
               ", Precio Final: " + calcularPrecioVenta();
    }
}