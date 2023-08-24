import java.util.Scanner;

public class Ejercicio13{
	public static void main (String args[]){
		int num;
		do{
		System.out.println("Dime un número: ");
		Scanner teclado = new Scanner(System.in);
		num = teclado.nextInt();
		}while(num<0);
		System.out.println("Enhorabuena el número "+num+" es mayor o igual 0");
	}
	/*
	Lee un número por teclado y comprueba que este numero es mayor o igual que cero, 
	si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
	*/
}