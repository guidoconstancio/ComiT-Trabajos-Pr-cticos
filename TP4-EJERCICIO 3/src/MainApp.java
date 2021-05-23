import java.util.Scanner;



public class MainApp {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	
	int opcion = 0;
	while (opcion!=6) {
		System.out.println("\n\nIngrese una opción del menú");
		System.out.println("1) Imprimir área de círculo ");
		System.out.println("2) Imprimir área de cuadrado ");
		System.out.println("3) Imprimir área de rectángulo ");
		System.out.println("4) Imprimir área de triángulo ");
		System.out.println("5) Imprimir área de trapecio");
		System.out.println("6) Salir");
		 opcion = scan.nextInt();
	switch (opcion) {
	case 1:	System.out.println("Ingrese radio: ");
			double radio = leerValor(scan);
			double areaCirculo = areaCirculo(radio);
			System.out.println(String.format("El área del círculo es: %.2f", areaCirculo));
		break;
	case 2:
			System.out.println("Ingresar lado: ");
			double lado = scan.nextDouble();
			double areaCuadrado = areaCuadrado(lado);
			System.out.println(String.format("El área del cuadrado es: %.2f", areaCuadrado));
		break;
	case 3:
			System.out.println("Ingresar base: ");
			double base = scan.nextDouble();
			System.out.println("Ingresar altura: ");
			double altura = scan.nextDouble();
			double areaRectangulo = areaRectangulo(base, altura);
			System.out.println(String.format("El área del rectángulo es: %.2f", areaRectangulo));
	break;
	case 4:
			System.out.println("Ingresar base: ");
			double baset = scan.nextDouble();
			System.out.println("Ingresar altura: ");
			double alturat = scan.nextDouble();
			double areaTriangulo = (areaRectangulo(baset, alturat))/2;
			System.out.println(String.format("El área del triángulo es: %.2f",areaTriangulo ));
	break;
	case 5:
			System.out.println("Ingrese altura: ");
			double alturap=scan.nextDouble();
			System.out.println("Ingrese base menor: ");
			double baseMenor = scan.nextDouble();
			System.out.println("Ingrese base mayor: ");
			double baseMayor=scan.nextDouble();
			double areaTrapecio = areaTrapecio(alturap, baseMenor, baseMayor);
			System.out.println(String.format("El área del trapecio es:  %.2f", areaTrapecio));
	break;

	}
	}
	System.out.println("Programa finalizado");
	
	
	
	
	}

	private static double leerValor(Scanner scan)	{
		double valor = scan.nextDouble();
		return valor;
	}
		
	
private static double areaCirculo(double radio) {
	double area;
	area = Math.PI * Math.pow(radio, 2);
	return area;	
}
	
	
private static double areaCuadrado(double lado) {
	double area;
	area = Math.pow(lado, 2);
	return area;
}

private static double areaRectangulo(double base, double altura) {
	double area = base * altura;
	return area;
}
	
private static double areaTrapecio(double altura, double baseMenor,double baseMayor) {
	double area = ((baseMenor+baseMayor)/2)*altura;
	return area;	
}





}

