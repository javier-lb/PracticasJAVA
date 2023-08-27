import java.util.Scanner;

public class Ejercicio15{
    public static void main(String[] args) {
        String dia;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un día de la semana: ");
        dia = teclado.nextLine();

        switch (dia.toLowerCase()){
            case "lunes":
                System.out.println("El "+dia+" es laborable");
                break;
            case "martes":
                System.out.println("El "+dia+" es laborable");
                break;
            case "miercoles":
                System.out.println("El "+dia+" es laborable");
                break;
            case "jueves":
                System.out.println("El "+dia+" es laborable");
                break;
            case "viernes":
                System.out.println("El "+dia+" es laborable");
                break;
            case "sabado":
                System.out.println("El "+dia+" no es laborable");
                break;
            case "domingo":
                System.out.println("El "+dia+" no es laborable");
                break;
            default:
                System.out.println("No compredemos lo que escribiste, lo sentimos");
                break;
        }
        teclado.close();
    }
    /*
    Pedir un día de la semana y dar si es laborable o no
    */
}
