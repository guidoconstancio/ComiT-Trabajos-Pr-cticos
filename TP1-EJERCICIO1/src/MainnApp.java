import java.text.DecimalFormat;
import java.util.Scanner;

public class MainnApp {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#,###.##");
		
		Scanner scan = new Scanner(System.in);
		
		int cantidadUno,cantidadDos;
		
		double subtotalUno,subtotalDos,iva,total,totalConIva,precioUnitarioUno,precioUnitarioDos;
		
		String descripcionUno,descripcionDos,domicilio,nombre;
		
		
	
		System.out.println("Ingrese nombre y apellido del comprador: ");
		nombre = scan.nextLine();
		
		System.out.println("Ingrese domicilio: ");
		domicilio = scan.nextLine();
		
		System.out.println("Ingrese descripcion del producto: ");
		descripcionUno = scan.next();
		
		System.out.println("Ingrese cantidad deseada del producto: ");
		cantidadUno = scan.nextInt();
		
		System.out.println("Ingrese el valor unitario: ");
		precioUnitarioUno = scan.nextDouble();

		System.out.println("Ingrese descripcion del producto: ");
		descripcionDos = scan.next();
		
		System.out.println("Ingrese cantidad deseada del producto: ");
		cantidadDos = scan.nextInt();
		
		System.out.println("Ingrese el valor unitario: ");
		precioUnitarioDos = scan.nextDouble();
		
		subtotalUno = cantidadUno * precioUnitarioUno;
		subtotalDos = cantidadDos * precioUnitarioDos;
		iva = (subtotalUno + subtotalDos) * 0.21;
		total = subtotalUno + subtotalDos;
		totalConIva= (total + iva);
		System.out.println("*************************************************************************************\n");
		System.out.println("Fecha  24/4/1879\n");
		System.out.println("*************************************************************************************\n");
		System.out.println("Nombre: " + nombre );
		System.out.println("Domicilio: " + domicilio);
		System.out.println("*************************************************************************************");
		System.out.println("|\tCantidad\t|\tDescripción\t|\tP.unit.\t|\tP.total\t|");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("|\t"+cantidadUno+"\t\t"+"|\t"+descripcionUno+"\t\t" +"|\t"+precioUnitarioUno+"\t"+"|\t"+subtotalUno+"\t|");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("|\t"+cantidadDos+"\t\t"+ "|\t"+descripcionDos+"\t\t" +"|\t"+precioUnitarioDos+"\t"+"|\t"+subtotalDos+"\t|");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("IVA: $" + iva);
		System.out.println("Subtotal (sin IVA): $" + total);
		System.out.println("Total: $" + totalConIva);
		System.out.println("*************************************************************************************");

	}


}
