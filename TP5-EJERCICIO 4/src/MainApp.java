

public class MainApp {


		private static final int CANT_ALUMNOS = 70;

		public static void main(String[] args) {

			String[] Alumnos = new String[CANT_ALUMNOS];
			double [] Notas = new double[CANT_ALUMNOS];
			double notasAcumuladas=0;
			double promedio;
			
			
			
		for (int i=0;i<Alumnos.length;i++) {
			Alumnos[i]="álumno nro: "+(i+1);			
		}
		for (int i=0;i<Alumnos.length;i++) {
			double nota =Math.random()*10;
			Notas[i]=nota;
			notasAcumuladas+=Notas[i];
		}
		promedio = notasAcumuladas / CANT_ALUMNOS;
		
		System.out.println("*******************************************");
		System.out.println("El promedio de notas es: "+(int)promedio);
		System.out.println("*******************************************");
		System.out.println("Estos son los alúmnos que superaron el promedio: ");
			for (int i=0;i<Alumnos.length;i++) {
				if ((int)Notas[i]>promedio) {
					System.out.println( Alumnos[i]+" obtuvo: "+(int)Notas[i]);
                }
            }
	
	
		}
		}
 

