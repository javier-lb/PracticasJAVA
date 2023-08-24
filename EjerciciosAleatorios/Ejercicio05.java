import java.util.Scanner;

public class Ejercicio5{
	public static void main (String args[]){
		int num;
		System.out.println("Dime un número entero: ");
		Scanner teclado = new Scanner(System.in);
		num = teclado.nextInt();
		int resultado = num%2;
		if (resultado == 0 )
			System.out.println("Este numero es divisible entre dos");
		else
			System.out.println("Este número no es divisble entre dos");
	}
	/*
	Lee un número por teclado e indica si es divisible entre 2 (resto = 0). 
	Si no lo es, también debemos indicarlo.
	*/
}
