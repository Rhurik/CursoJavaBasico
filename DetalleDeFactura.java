import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre para su factura");
        String nombreFactura = scanner.nextLine();

        System.out.println("Ingrese el precio del producto:");
        double precio1 = scanner.nextDouble();

        System.out.println("Ingrese el precio del segundo producto:");
        double precio2 = scanner.nextDouble();

        double bruto = precio1 + precio2;
        double impuesto = bruto * 0.19;
        double neto = bruto + impuesto;

        String mensaje = "La factura " + nombreFactura + " tiene un total bruto de " + bruto + ", " +
                "con un impuesto de " + impuesto + " y el precio neto sumando el impuesto es de " + neto;

        System.out.println(mensaje);

        }
    }
