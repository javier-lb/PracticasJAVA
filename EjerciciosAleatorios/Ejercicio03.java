import java.util.Scanner;

public class Ejercicio3{
	
	public static void main (String args[]){
		String nombre;
		System.out.println("Hola, puedes introducir tu nombre: ");
		Scanner teclado = new Scanner(System.in);
		nombre = teclado.nextLine();
		System.out.println("Bienvenido "+nombre);
		teclado.close();
		
	}
	/*
	Pide un nombre por consola y da respuesta de bienvenido y el nombre
	*/
}
