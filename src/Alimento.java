public class Alimento extends Producto implements Vendible {

    public Alimento(String nombre, double precio, String codigo) {
        super(nombre, precio, codigo);
    }

    @Override
    public double calcularPrecio() {
        return precio * 1.08;
    }

    @Override
    public void vender() {
        System.out.println("Alimento vendido.");
    }

}