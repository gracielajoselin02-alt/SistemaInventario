// Clase abstracta que representa cualquier producto del inventario.
public abstract class Producto {

    protected String nombre;
    protected double precio;
    protected String codigo;

    public Producto(String nombre, double precio, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
    }

    public void mostrarInfo() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
    }

    // Método abstracto que será implementado por las clases hijas.
    public abstract double calcularPrecio();
}