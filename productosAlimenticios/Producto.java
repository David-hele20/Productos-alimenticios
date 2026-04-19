public abstract class Producto {
    protected int codigo;
    protected String descripcion;
    protected double precio;

    public Producto(int codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public abstract double calcularPrecioVenta();

    @Override
    public String toString() {
        return "Código: " + codigo + ", Descripción: " + descripcion + ", Precio Base: " + precio;
    }
}