public class NoPerecedero extends Producto {
    private static final double AUMENTO_TIPO_A = 0.03;
    private static final double AUMENTO_TIPO_B = 0.02;
    private static final double AUMENTO_TIPO_C = 0.015;
    
    private char tipo;

    public NoPerecedero(int codigo, String descripcion, double precio, char tipo) {
        super(codigo, descripcion, precio);
        this.tipo = validarTipo(tipo);
    }

    private char validarTipo(char tipo) {
        tipo = Character.toUpperCase(tipo);
        if (tipo == 'A' || tipo == 'B' || tipo == 'C') {
            return tipo;
        }
        return 'B'; // Tipo por defecto
    }

    @Override
    public double calcularPrecioVenta() {
        double porcentaje = 0;
        if (tipo == 'A') porcentaje = AUMENTO_TIPO_A;
        else if (tipo == 'B') porcentaje = AUMENTO_TIPO_B;
        else if (tipo == 'C') porcentaje = AUMENTO_TIPO_C;
        
        return precio * (1 + porcentaje);
    }

    @Override
    public String toString() {
        return "Tipo: No Perecedero, " + super.toString() + 
               ", Categoría: " + tipo + 
               ", Precio Final: " + calcularPrecioVenta();
    }
}