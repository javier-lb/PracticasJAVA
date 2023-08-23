import java.util.Scanner;

public class MenuConSwitch {
		public static void main(String [] args){
			Scanner a =new Scanner(System.in);
			
			System.out.println("CÁLCULO DE ÁREAS");
			System.out.println("-----------------");
			System.out.println("1. Cuadrado");
			System.out.println("2. Rectángulo");
			System.out.println("3. Triángulo");
			System.out.println("\n Elijo una opción (1-3): ");
			
			int opcion = a.nextInt();
			
			double lado;
			double base;
			double altura;
			double resultado;
			
			switch(opcion){
				
				case 1:
				
				System.out.print("\nIntroduzca el lado del cuadrado en cm: ");
				
				lado= a.nextDouble();
				resultado= lado * lado;
				
				System.out.print("\nEl área del cuadrado es "+resultado+" cm2");
				break;
				
				case 2:
				System.out.print("\nIntroduzca el base del rectángulo en cm: ");
				base= a.nextDouble();
				
				System.out.print("\nIntroduzca la altura del rectángulo en cm: ");
				altura=a.nextDouble();
				
				resultado= base * altura;
				
				System.out.print("\nEl área del rectángulo es "+resultado+" cm2");
				break;
				
				case 3:
				System.out.print("\nIntroduzca el base del triángulo en cm: ");
				base= a.nextDouble();
				
				System.out.print("\nIntroduzca la altura del triángulo en cm: ");
				altura=a.nextDouble();
				
				resultado= (base * altura)/2;
				
				System.out.print("\nEl área del triángulo es "+resultado+" cm2");
				break;
				
				default:
				System.out.print("\nLo siento, la opción elegida no es correcta");
			}	
	
	}
	//Un menu con switch para calcular un area de cuadrado,rectángulo o triángulo
}