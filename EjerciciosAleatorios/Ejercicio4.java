import java.util.Scanner;

public class Ejercicio4{

	public static void main (String args[]){
	
		Double radio;
		Double area;
		System.out.println("Dime el radio de tu círculo: ");
		Scanner teclado = new Scanner(System.in);
		radio = teclado.nextDouble();
		radio = Math.pow(radio,2);
		area=Math.PI*radio;
		System.out.println("Este es el area de tu círculo: "+area);
		teclado.close();
	}
	/*
	Haz una aplicación que calcule el área de un círculo(pi*R2). 
	El radio se pedirá por teclado. Usar la constante PI y el método pow de Math.
	*/
}