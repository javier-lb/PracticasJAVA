public class Ejercicio11{
	public static void main (String args[]){
		for ( int i = 1; i <= 100; i++){
			int div2 = i%2, div3 = i%3;
			if (div2 == 0 || div3 == 0)
				System.out.println(i);
		}
	}
	/*
	 Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3.
	*/
}