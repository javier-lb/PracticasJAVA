import java.util.Scanner;

public class MediaNotas {
		public static void main(String [] args){
			System.out.println("Dime la nota del primer examen ");
			Scanner a = new Scanner(System.in);
			double nota1= a.nextDouble();
			System.out.println("Dime la nota del segundo examen ");
			double nota2= a.nextDouble();
			System.out.println("Dime la nota del tercer examen ");
			double nota3= a.nextDouble();
			
			double media = (nota1+nota2+nota3)/3;
			
			System.out.println("Dando estas tres notas ("+nota1+") ("+nota2+") ("+nota3+") te corresponde una media en el curso de "+media); 
			
			if ((media >= 5)||(media <6)){
					System.out.println("Tienes en el boletín de notas Suficiente");
			}else{
				if ((media >= 6)||(media < 7)){
					System.out.println("Tienes en el boletín de notas Bien");
			}else {
				if ((media >=7)||(media <9)){
					System.out.println("Tienes en el boletín de notas Notable");
			}else {
				if (media >=9){
					System.out.println("Tienes en el boletín de notas Sobresaliente");
			}else{
					System.out.println("Tienes en el boletín de notas Insuficiente");
			}
				}
					}
						}
	}
}