import java.util.ArrayList;

public class Empresa {
    private ArrayList<Producto> listaProductos;

    public Empresa() {
        this.listaProductos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    public void mostrarProductos() {
        System.out.println("--- LISTADO DE PRODUCTOS ---");
        for (Producto p : listaProductos) {
            System.out.println(p.toString());
        }
    }

    public void run() {
        // Ejemplo de productos perecederos
        agregarProducto(new Perecedero(101, "Leche", 3200, 1));
        agregarProducto(new Perecedero(102, "Yogurt", 2500, 3));
        
        // Ejemplo de productos no perecederos
        agregarProducto(new NoPerecedero(201, "Arroz", 4000, 'A'));
        agregarProducto(new NoPerecedero(202, "Lentejas", 3500, 'C'));

        mostrarProductos();
    }

    public static void main(String[] args) {
        new Empresa().run();
    }
}