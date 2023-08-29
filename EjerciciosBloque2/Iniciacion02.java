import java.util.Scanner;

public class Iniciacion02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num; 
        int digitos=1;
        
        System.out.println(" Dime un número ");
        num = teclado.nextInt();
        while (num > 9){
            num /= 10;
            digitos++;
        }
        System.out.println("El número introducido tiene "+digitos+" "+(digitos == 1 ? "digito":"digitos"));
        teclado.close();
    }
    /*
     A partir de un numero saber cuantos digitos tiene
     */
}
