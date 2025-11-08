package Isabel.Regina.Silva.Lopes;

import java.util.Scanner;

public class IRSL03 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("* Aluna: Isabel Regina Silva Lopes - RA: 0024188          *");
		System.out.println("* Classe: IRSL03 - Maior de dois números                   *");
		System.out.println("************************************************************");
		System.out.println();
		
		 Scanner captura = new Scanner(System.in);

	        System.out.print("Digite o primeiro número: ");
	        int num1 = captura.nextInt();

	        System.out.print("Digite o segundo número: ");
	        int num2 = captura.nextInt();

	        if (num1 > num2) {
	            System.out.println("O maior é " + num1);
	        } else if (num2 > num1) {
	            System.out.println("O maior é " + num2);
	        } else {
	            System.out.println("Os dois números são iguais");
	        }

	    }
	}