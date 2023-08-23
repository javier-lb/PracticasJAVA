import java.util.Scanner;

public class CondicionalSwitch {
		public static void main(String[] args) {
		
			Scanner s = new Scanner(System.in);
			
			System.out.print("Dime el día de la semana: ");
			
			String dia = s.nextLine();
			
			switch (dia.toLowerCase()) {
			
			case "lunes":  
				
				System.out.print("Tienes Inglés a primera hora");
			break;
			case "martes":  
				
				System.out.print("Tienes Matemáticas a primera hora");
			break;
			case "miercoles":  
				
				System.out.print("Tienes Física a primera hora");
			break;
			case "jueves":  
				
				System.out.print("Tienes Programación a primera hora");
			break;
			case "viernes":  
				
				System.out.print("Tienes Química a primera hora");
			break;
			
			default:
				System.out.print("No tienes clase este día " + dia);
				
			}
			
		}
		/*
		Calendario de primera hora de clase con switch
		*/
}