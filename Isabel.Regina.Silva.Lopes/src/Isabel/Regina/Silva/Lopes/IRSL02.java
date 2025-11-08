package Isabel.Regina.Silva.Lopes;

import java.util.Scanner;

public class IRSL02 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("* Aluna: Isabel Regina Silva Lopes - RA: 0024188          *");
		System.out.println("* Classe: IRSL02 - Par ou ímpar                            *");
		System.out.println("************************************************************");
		System.out.println();
		
		Scanner captura = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = captura.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }

    }
}