import java.util.Scanner;

public class TerminaCuandoEsImpar {
		
		public static void main (String [] args) {
			
			int numero;
			String respuesta;
			/*
				Bucle do while preguntando por número par
				entramos en condicional if mientras sea par
				sino salimos del bucle
			*/
			
			do {
				System.out.print("Dime un número: ");
				Scanner a = new Scanner(System.in);
				numero = a.nextInt();
				
				if (numero % 2 == 0 ){
					System.out.println("Qué bonito el "+numero);

				}else{
					System.out.println("No me gustan los números impares.");
				}
			}while (numero % 2 == 0 );

			/*
			Creamos otro bucle anidado al salir del primero 
			do while en donde preguntamos si queremos jugar
			si es si entramos en un condicional como arriba con el número par
			sino salimos pero el bucle vuelve a preguntar si queremos continuar
			solo salimos del bucle contestando no y mostrara el mensaje de 
			no querer jugar
			*/
			
			do {
			System.out.println("¿Quieres continuar? (s/n) ");
			Scanner b = new Scanner(System.in);
			respuesta = b.nextLine();
				
				if (respuesta.equalsIgnoreCase("s")){
						System.out.print("Dime un número: ");
						Scanner a = new Scanner(System.in);
						numero = a.nextInt();
					if (numero % 2 == 0 ){
						System.out.println("Qué bonito el "+numero);

					}else{
						System.out.println("No me gustan los números impares.");
					}
				}else{
					System.out.println("Siento,que no quieras jugar");
				}
			}while(respuesta.equalsIgnoreCase("s"));
			
	}
}