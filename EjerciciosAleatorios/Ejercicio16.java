import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Vamos a hacer números aleatorios entre dos números");
        System.out.println("Cuantos numeros quieres generar: ");
        int generador = teclado.nextInt();
        System.out.println("Dime un primer número: ");
        double num1= teclado.nextDouble();
        System.out.println();
        System.out.println("Dime un segundo número: ");
        double num2= teclado.nextDouble();
        System.out.println("\n");

        for (int i = 1; i <= generador; i++) {
                int aleatorio = (int)(Math.random()*(num2-num1+1)+num1);
                System.out.println(aleatorio);
        }
        teclado.close();
    }
    /*
    Generador de numeros aleatorios poniendo la cantidad de números a generar y dando un rango.
    */
}
