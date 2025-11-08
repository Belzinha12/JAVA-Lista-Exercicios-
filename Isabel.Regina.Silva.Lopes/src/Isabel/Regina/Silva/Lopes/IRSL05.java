package Isabel.Regina.Silva.Lopes;

import java.util.Scanner;

public class IRSL05 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("* Aluna: Isabel Regina Silva Lopes - RA: 0024188          *");
		System.out.println("* Classe: IRSL05 - Notas e aprovação                       *");
		System.out.println("************************************************************");
		System.out.println();

	    Scanner captura = new Scanner(System.in);

	    System.out.print("Digite a nota da primeira avaliação: ");
	    double num1 = captura.nextDouble();

	    System.out.print("Digite a nota da segunda avaliação: ");
	    double num2 = captura.nextDouble();

	    double media = (num1 + num2) / 2;

	    System.out.println("Média final: " + media);

	    if (media >= 7) {
	        System.out.println("Aprovado");
	    } else {
	        System.out.println("Reprovado");
	}
	}
	}