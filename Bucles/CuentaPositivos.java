import java.util.Scanner;

public class CuentaPositivos{
	
		public static void main (String [] args){
		
			System.out.println("Por favor, vaya introduciendo números y pulsando INTRO");
			System.out.println("Para terminar, introduzca un número negativo.");
				
			int numeroIntroducido = 0;
			int cuentaNumeros = 0;
			int suma = 0;
			
			while (numeroIntroducido >=0 ) {
				Scanner a = new Scanner (System.in);
				numeroIntroducido = a.nextInt();
				cuentaNumeros++;
				suma += numeroIntroducido;
			}
			
			System.out.println ("Has introducido "+(cuentaNumeros -1)+" números positivos.");
			System.out.println ("La suma total de ellos es "+(suma - numeroIntroducido));
			
			//Vamos contando los numeros enteros positivos hasta que el usuario introduce un numero negativo para salir del bucle
		}
}