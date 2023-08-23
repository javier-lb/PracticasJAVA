import java.util.Scanner;

public class AdivinarNumero {
		public static void main(String [] args ){
			
			Scanner a = new Scanner(System.in);
			
			System.out.println("Adivina el número que pienso");
			System.out.print("Dime un número del 1 al 10 ");
			
			int b = a.nextInt();
			
			if ((b<1)||(b>10)){
				System.out.println("Ese número no esta dentro del rango");
				System.out.println("Vuelve a escribir el número solo tienes otra oportunidad ");
				a = new Scanner(System.in);
				b = a.nextInt();
			}
			
			if (b == 7){
				System.out.print("Enhorabuena lo conseguiste");
			}else{
				System.out.print("Este no es el número que estoy pensando");
			}
	}
	/*
	Adivinar números con if
	*/
}