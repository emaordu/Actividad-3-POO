import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Supermercado {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Producto> productos = new ArrayList<>();
        String respuesta;

        do{
            System.out.println("Ingrese el nombre del producto");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese el precio del producto");
            double precio = scanner.nextDouble();
            scanner.nextLine();

            productos.add(new Producto(precio, nombre));

            System.out.println("¿Desea escanear otro producto? (si/no): ");
            respuesta = scanner.nextLine();
        }while (respuesta.equalsIgnoreCase("si"));

        double total = 0;
        System.out.println("Los productos en el carrito son: ");
        for(Producto producto: productos){
            System.out.println(producto.nombre + " $ " + producto.precio);
            total += producto.precio;
        }

        System.out.println("El total a pagar es: " + total);
        scanner.close();
    }
}