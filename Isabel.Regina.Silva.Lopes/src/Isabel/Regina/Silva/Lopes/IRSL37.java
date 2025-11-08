package Isabel.Regina.Silva.Lopes;

import java.util.Scanner;

public class IRSL37 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("* Aluna: Isabel Regina Silva Lopes - RA: 0024188          *");
		System.out.println("* Classe: IRSL37 - Soma até o número ser múltiplo de 10   *");
		System.out.println("************************************************************");
		System.out.println();

		Scanner captura = new Scanner(System.in);

	    int num1, soma = 0;
	    do {
	        System.out.print("Digite um número (para parar escreva um múltiplo de 10!):  ");
	        num1 = captura.nextInt();
	        soma += num1;
	    } while(num1 % 10 != 0);

	    System.out.println("Soma total: " + soma);
	}
	}