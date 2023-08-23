import java.util.Scanner;

public class Ejercicio8{
	public static void main (String args[]){
	
		float IVA = 0.21f;
		float num;
		System.out.println("Dime un precio: ");
		Scanner teclado = new Scanner(System.in);
		num = teclado.nextFloat();
		float resultado = (num*IVA)+num;
		System.out.println(" Su precio con el 21% de Iva incluido es de: "+resultado); 
	}
	/*
	Lee un número por teclado que pida el precio de un producto (puede tener decimales
	y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
	*/
}