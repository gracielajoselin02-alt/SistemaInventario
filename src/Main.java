public class Main {

    public static void main(String[] args) {

        Producto[] inventario = {

                new Electronico("Laptop",15000,"E001"),
                new Alimento("Leche",28,"A001"),
                new Ropa("Playera",350,"R001")

        };

        for (Producto p : inventario){

            p.mostrarInfo();

            System.out.println("Precio final: $" + p.calcularPrecio());

            ((Vendible)p).vender();

            System.out.println("---------------------");

        }

    }

}