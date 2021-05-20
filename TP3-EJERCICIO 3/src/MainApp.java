


public class MainApp {

	public static void main(String[] args) {
		
		double cuota=0;
		
		int numPatentes=500;
		
		int valor=0;
		
		int patente=0;
		
		int i=1;
		
		int monto=0;
		
		int altaGama=0;
		
		while (i<=numPatentes) {
			 patente =(int) (500000 + (Math.random() * 5000000));
			 valor =(int) (100000 + (Math.random() * 3000000));
			 
			 if (valor <1300000) {
				 altaGama++;
			 }
			 if (patente<1000000) {
				 cuota = (int)valor * 0.5;
				 System.out.println( i +"\t||\tPatente nro: "+ patente + "\t||\tValor del modelo: $"+valor+"\t||\tDEBE ABONAR EL 5% ($"+(int)cuota+")");
				 i++;
				 monto+=cuota;
			 }
			 if (patente >=1000000 && patente <=2000000 ) {
				 cuota = (int)valor * 0.10;
				 System.out.println( i +"\t||\tPatente nro: "+ patente + "\t||\tValor del modelo: $"+valor+"\t||\tDEBE ABONAR EL 10% ($"+(int)cuota+")");
				 i++;
				 monto+=cuota;
			 }
			 
			 else {
				 cuota = (int)valor * 0.15;
				 System.out.println( i +"\t||\tPatente nro: "+ patente + "\t||\tValor del modelo: $"+valor+"\t||\tDEBE ABONAR EL 15% ($"+(int)cuota+")");
				 i++;
				 monto+=cuota;
			}
		}
		System.out.println("---------------------------------------------------------------------------------------------------------------------------");
		System.out.println("RECAUDADO: $"+ monto);
		System.out.println("---------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Auto que superaron $ 1.300.000: "+altaGama);
	}

	}


