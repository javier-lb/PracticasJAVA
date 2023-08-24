import java.util.Scanner;

public class Ejercicio14{
	public static void main(String args[]){
		
		String password = "Abc";
		final int INTENTOS = 3;
		boolean condicion = false;
		String passwordTeclado;
		int contador =1;
		Scanner teclado= new Scanner(System.in);
		
		for (int i = 0; i < INTENTOS && !condicion;i++){
			System.out.println("Dime la contraseña :");
			passwordTeclado = teclado.nextLine();
			if (password.equals(passwordTeclado)){
				System.out.println("Enhorabuena!!! Acertaste");
				condicion = true;
			}
			else{
				contador = (INTENTOS-i-1);
				System.out.println("No esa no es la contraseña");
				System.out.println("Solo te quedan "+contador+" intentos");
			}
		}
	}
	/*
	Escribe una aplicación con un String que contenga una contraseña cualquiera.
	Después se te pedirá que introduzcas la contraseña, con 3 intentos.
	Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo «Enhorabuena».
	*/
}