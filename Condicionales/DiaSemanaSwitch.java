import java.util.Scanner;

public class DiaSemanaSwitch{
		public static void main(String [] args){
				System.out.println("Dime un número entre el 1 al 7 y te dire que día de la semana es ");
				Scanner a = new Scanner(System.in);
				byte dia = a.nextByte();
				
			switch (dia){
				case 1:
				System.out.println("Lunes");
				break;
				case 2:
				System.out.println("Martes");
				break;
				case 3:
				System.out.println("Miércoles");
				break;
				case 4:
				System.out.println("Jueves");
				break;
				case 5:
				System.out.println("Viernes");
				break;
				case 6:
				System.out.println("Sábado");
				break;
				case 7:
				System.out.println("Domingo");
				break;
				default:
				System.out.println("No es un número dentro del rango");
			}
	}
	/*
	Número por teclado responde al día de la semana que corresponde con switch
	*/
}