// Clase que hereda de Producto e implementa la interfaz Vendible.
public class Electronico extends Producto implements Vendible {

    public Electronico(String nombre, double precio, String codigo) {
        super(nombre, precio, codigo);
    }

    @Override
    public double calcularPrecio() {
        return precio * 1.16;
    }

    @Override
    public void vender() {
        System.out.println("Electrónico vendido.");
    }
}