
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);     
		
		String descripcionProducto = "",fraseNueva = "";
		
		int cantidadProducto = 0;
		
		double valorUnitario = 0,total = 0,iva = 0,totalItem = 0;
	
		System.out.println("Ingrese su nombre, por favor: ");
		String nombre = leerEntradaCadena(scan);	
		
		System.out.println("Ingrese domicilio, por favor: ");
		String domicilio = leerEntradaCadena(scan);
		
		
		
		System.out.println("  MENU\n1 Ingresar producto\n2 Generar ticket ");
		int opcion = (int)leerEntradaValor(scan);
		while (opcion != 2) {

			if (opcion == 1) {
				System.out.println("Descripción: ");
				descripcionProducto = leerEntradaCadena(scan);
				System.out.println("Cantidad: ");
				cantidadProducto =(int) leerEntradaValor(scan);
				System.out.println("Valor unitario: ");
				valorUnitario = leerEntradaValor(scan);
				totalItem = calcularSubtotalItem(cantidadProducto, valorUnitario);
				total += calcularTotal(totalItem);
				iva = calcularIva(total);								
				fraseNueva += fraseN(cantidadProducto, descripcionProducto, valorUnitario, totalItem);
			}
			else if (opcion != 1 && opcion != 2) {
				System.out.println(
						"Número de opción incorrecta, por favor intentelo de nuevo\n"); 
			}
			System.out.println("\n MENU\n1 Ingresar producto\n2 Generar ticket \n\n");
			System.out.println("------------------------------------------------------");
			opcion = scan.nextInt();
		}

		imprimir(nombre, domicilio, fraseNueva, cantidadProducto, descripcionProducto, valorUnitario, totalItem, iva,
				total);
		System.out.println("---TICKET---");

	}


	


	

	private static String leerEntradaCadena(Scanner scan) {
	
		String entradaUsuario = scan.next();
		return entradaUsuario;
	}

	private static double leerEntradaValor(Scanner scan) {

		double valor = scan.nextDouble();
		return valor;
	}

	private static String imprimir(String nombre, String domicilio, String fraseNueva, int cantidadProducto,
			String descripcionProducto,
			double valorUnitario, double totalItem, double iva, double total) {

		System.out.println("*************************************************************************************\n");
		System.out.println("Fecha  24/4/1879\n");
		System.out.println("*************************************************************************************\n");
		System.out.println("Nombre: " + nombre );
		System.out.println("Domicilio: " + domicilio);
		System.out.println("*************************************************************************************");
		System.out.println("Cantidad |\t Descripción\t |\t P.unit.\t |\t P.total\t|");
		System.out.println(fraseNueva);
		System.out.println("IVA: " + iva);
		System.out.println("Subtotal (sin IVA): " + total);
		System.out.printf("Total:" + (total + iva));
		System.out.println("*************************************************************************************");
		return null;
	}
	
	private static double calcularSubtotalItem(int cantidad, double valorUnitario) {
		double total = cantidad * valorUnitario;
		return total;

	}

	private static double calcularTotal(double subtotalItem) {
		double total = 0;
		total += subtotalItem;
		return total;

	}

	private static double calcularIva(double total) {
		double iva = total * 0.21;
		return iva;
	}

	private static String fraseN(int cantidadProducto, String descripcionProducto, double valorUnitario,
			double totalItem) {
		String frase = "-------------------------------------------------------------------------------------\n"
				+ "  " + cantidadProducto + "      |\t" + descripcionProducto + " \t\t|\t " + valorUnitario
				+ "\t\t|\t " + totalItem
				+ "\n-------------------------------------------------------------------------------------\n";
		return frase;
	}
	
		
	
}
