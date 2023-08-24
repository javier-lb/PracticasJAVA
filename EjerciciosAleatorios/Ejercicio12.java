import java.util.Scanner;

public class Ejercicio12{
	public static void main (String args[]){
		double precio;
		double sumaPrecios = 0;
		System.out.println("Dime el número de artículos vendidos: ");
		Scanner teclado = new Scanner(System.in);
		int ventas = teclado.nextInt();
		for (int i = 0;i < ventas;i++){
			System.out.println("Dime los precios de los artículos: ");
			precio = teclado.nextDouble();
			sumaPrecios += precio;
		}
		System.out.println("El total de la compra sería de :"+sumaPrecios);
		teclado.close();
	}
	/*
	Realiza una aplicación que nos pida un número de ventas a introducir,
	después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado. 
	Al final mostrara la suma de todas las ventas.
	*/
}