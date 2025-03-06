public class EJERCICIO1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el nombre del cliente: ");
            String nombreCliente = scanner.nextLine();

            System.out.print("Ingrese el nombre del producto: ");
            String nombreProducto = scanner.nextLine();

            System.out.print("Ingrese el valor unitario del producto: ");
            double valorUnitario = scanner.nextDouble();

            if (valorUnitario <= 0) {
                System.out.println("Error en la entrada de datos");
                return;
            }

            System.out.print("Ingrese la cantidad a comprar: ");
            int cantidad = scanner.nextInt();

            if (cantidad <= 0) {
                System.out.println("Error en la entrada de datos");
                return;
            }

            double valorBruto = valorUnitario * cantidad;
            double descuento = 0;

            if (cantidad >= 10 && cantidad < 20) {
                descuento = valorBruto * 0.05;
            } else if (cantidad >= 20) {
                descuento = valorBruto * 0.07;
            }

            double valorNeto = valorBruto - descuento;

            System.out.println("\nResumen de la compra:");
            System.out.println("Nombre del Cliente: " + nombreCliente);
            System.out.println("Nombre del Producto: " + nombreProducto);
            System.out.println("Valor Unitario: " + valorUnitario);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Valor Bruto: " + valorBruto);
            System.out.println("Descuento: " + descuento);
            System.out.println("Valor Neto: " + valorNeto);
        } catch (Exception e) {
            System.out.println("Error en la entrada de datos");
        } finally {
            scanner.close();
        }
    }
}
}
