package Isabel.Regina.Silva.Lopes;

import java.util.Scanner;

public class IRSL39 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("* Aluna: Isabel Regina Silva Lopes - RA: 0024188          *");
		System.out.println("* Classe: IRSL39 - Validar número entre 1 e 5             *");
		System.out.println("************************************************************");
		System.out.println();

		Scanner captura = new Scanner(System.in);

	    int num1;
	    do {
	        System.out.print("Digite um número entre 1 e 5: ");
	        num1 = captura.nextInt();
	    } while(num1 < 1 || num1 > 5);

	    System.out.println("Número aceito: " + num1);
	}
	}