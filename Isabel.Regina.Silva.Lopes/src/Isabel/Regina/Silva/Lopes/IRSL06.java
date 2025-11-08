package Isabel.Regina.Silva.Lopes;

import java.util.Scanner;

public class IRSL06 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("* Aluna: Isabel Regina Silva Lopes - RA: 0024188          *");
		System.out.println("* Classe: IRSL06 - Múltiplo de 3 e/ou 5                    *");
		System.out.println("************************************************************");
		System.out.println();

        Scanner captura = new Scanner(System.in);
        
        System.out.println("Digíte um número : ");
        int num1 = captura.nextInt();
        if(num1 % 3 == 0 && num1 % 5 == 0) System.out.println("Multiplo de 3 e 5");
        else if(num1 % 3 == 0) System.out.println("Multiplo de 3");
        else if(num1 % 5 == 0) System.out.println("Multiplo de 5");
        else System.out.println("Nao e multiplo de 3 nem 5");
        
    }
}