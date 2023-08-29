import java.util.Scanner;

public class Iniciacion01 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        int n;
        int num;
        int vecesMayor = 0;
        int mayor = Integer.MIN_VALUE;
        int vecesMenor = 0;
        int menor = Integer.MAX_VALUE;

        System.out.println(" Dime la cantidad de números a introducir: ");
        n = teclado.nextInt();

        for (int  i = 1 ; i <= n ; i++){
            System.out.println(" Dime un número entero: "+i+" de "+n);
            num = teclado.nextInt();
                if (num > mayor){
                    mayor = num;
                    vecesMayor = 1;
                }
                else if ( num == mayor){
                    vecesMayor++;
                }
                if (num < menor){                    
                    menor = num;
                    vecesMenor = 1;
                }
                else if ( num == menor){
                    vecesMenor++;
                }
            }
        System.out.println("EL número mayor es "+mayor+ " y aparece "+vecesMayor+" "+(vecesMayor == 1 ? "vez" : "veces"));
        System.out.println("EL número menor es "+menor+ " y aparece "+vecesMenor+" "+(vecesMenor == 1 ? "vez" : "veces"));
        teclado.close();
    }
      /*
      A partir de una cantidad de numeros, saber cual es el mayor, el menor y cuantas veces se repiten.
      */ 
}
