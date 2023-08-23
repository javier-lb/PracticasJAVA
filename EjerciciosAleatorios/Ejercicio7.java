import java.util.Scanner;

public class Ejercicio7{
	public static void main (String args[]){
		char entrada;
		System.out.println("Dime un caracter: ");
		Scanner teclado = new Scanner(System.in);
		entrada = teclado.next().charAt(0);
		/*
		Cojemos un String hasta el primer espacio y covertimos en char solo el primer carácter
		Podemos escribir muchos carácteres sin espacio pero solo coge el primero
		*/
		int codigo = (int)entrada;
		//Convertimos el caracter en int
		System.out.println("Este es su codigo ASCII: "+codigo);
	}
	/*
	Pedir un carácter y mostrar su código ASCII
	*/
}