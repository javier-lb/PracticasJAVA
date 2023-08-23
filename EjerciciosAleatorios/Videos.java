import java.util.Scanner;

public class Videos {
		public static void main(String[] args){
			Scanner s = new Scanner (System.in);
			
			System.out.print("¿Cuántos vídeos ves al día? ");
			
			double a = s.nextInt();
			
			double total= (196/a)/30;
			int totalb= (int)total;
			
			double dia= (196/a)%30;
			int dia1= (int)dia;
			double horas= a * 30 /60;
			 
			 System.out.println("Número de meses que necesitas para acabar el curso: "+totalb+" meses y "+dia1+" días");
			 System.out.println("Número de horas que dedicas al día para acabar el curso: "+horas);
			
		}
		//Calculos de videos en una lista de 196 videos
}