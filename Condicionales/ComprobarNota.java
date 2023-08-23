import java.util.Scanner;

public class ComprobarNota{
		public static void main(String[] args){
		
		System.out.print("Dime tu nota ");
		Scanner a = new Scanner(System.in);
		
		int b = a.nextInt();
		
		if (b >=5){
			System.out.println("Enhorabuena!! Aprobado");
		}else{
			System.out.println("Lo siento tienes que recuperar");
		}
	}
	/*
	Comprobar nota mayor o igual a 5 con if
	*/
}