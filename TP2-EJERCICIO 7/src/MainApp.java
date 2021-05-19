
public class MainApp {

	

	public static void main(String[] args) {
		int edad,exp;
		double rem;
		edad=34;
		exp=3;
		rem=10000;
		System.out.println("-------------");
        System.out.println("Datos del postulante:\nedad: "+edad+" años");
        System.out.println("experiencia: "+exp+" años");
        System.out.println("remuneración pretendida: $"+rem);
        System.out.println("-------------");
		
		if (edad >=18 && edad <=35) 
		{
			
			if (exp<=3 && rem<50000)
		{
			System.out.println("Aceptado");
			} 
			else if (edad>32 && exp>6) {
			
			System.out.println("Aceptado");
			}
			else if (exp>3 && exp<6 && edad!=32) {
			System.out.println("Condicional");
			}
		else {
				System.out.println("Rechazado");
			}
		
		
					
	
		}
				
	}
	
			
}
		
		
		
	
