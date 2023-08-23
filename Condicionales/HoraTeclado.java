import java.util.Scanner;

public class HoraTeclado{
		public static void main(String [] args){
			
			System.out.println("¿Dime la hora que és?, no los minutos por favor ");
			Scanner a = new Scanner(System.in);
			byte hora = a.nextByte();
			
			switch (hora){
				case 6:
				System.out.println("Buenos días");
				break;
				case 7:
				System.out.println("Buenos días");
				break;
				case 8:
				System.out.println("Buenos días");
				break;
				case 9:
				System.out.println("Buenos días");
				break;
				case 10:
				System.out.println("Buenos días");
				break;
				case 11:
				System.out.println("Buenos días");
				break;
				case 12:
				System.out.println("Buenos días");
				break;
				case 13:
				System.out.println("Buenas tardes");
				break;
				case 14:
				System.out.println("Buenas tardes");
				break;
				case 15:
				System.out.println("Buenas tardes");
				break;
				case 16:
				System.out.println("Buenas tardes");
				break;
				case 17:
				System.out.println("Buenas tardes");
				break;
				case 18:
				System.out.println("Buenas tardes");
				break;
				case 19:
				System.out.println("Buenas tardes");
				break;
				case 20:
				System.out.println("Buenas tardes");
				break;
				default:
				System.out.print("Buenas noches");
			}
			
	}
	/*
	Según la hora contesta con un saludo con switch
	*/
}