public class Ropa extends Producto implements Vendible {

    public Ropa(String nombre, double precio, String codigo) {
        super(nombre, precio, codigo);
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public void vender() {
        System.out.println("Prenda vendida.");
    }

}