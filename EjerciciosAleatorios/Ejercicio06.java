import java.util.Scanner;

public class Ejercicio6{
	public static void main (String args[]){
		
		int num;
		System.out.println("Dime un número entero: ");
		Scanner teclado = new Scanner (System.in);
		num = teclado.nextInt();
		char tabla = (char) num;
		System.out.println("En tabla ASCII es: "+tabla);
		teclado.close();
	
	}
	/*
	Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII.
	Por ejemplo: si introduzco un 97, me muestre una a.
	*/
}
