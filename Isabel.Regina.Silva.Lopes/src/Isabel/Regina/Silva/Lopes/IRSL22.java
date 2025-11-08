package Isabel.Regina.Silva.Lopes;

import java.util.Scanner;

public class IRSL22 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("* Aluna: Isabel Regina Silva Lopes - RA: 0024188          *");
		System.out.println("* Classe: IRSL22 - Soma de números até digitar zero       *");
		System.out.println("************************************************************");
		System.out.println();

    Scanner captura = new Scanner(System.in);
    
    int num1, soma = 0;
    
    System.out.print("Digite um número (0 para parar a soma): ");
    num1 = captura.nextInt();

    while(num1 != 0){
    	
        soma += num1;
        
    System.out.print("Digite um número (0 para parar a soma): ");
    num1 = captura.nextInt();
    }

    System.out.println("Soma total = " + soma);
}
}
