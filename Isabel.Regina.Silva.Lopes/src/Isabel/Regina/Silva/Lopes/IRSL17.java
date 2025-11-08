package Isabel.Regina.Silva.Lopes;

import java.util.Scanner;

public class IRSL17 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("* Aluna: Isabel Regina Silva Lopes - RA: 0024188          *");
		System.out.println("* Classe: IRSL17 - Quadrado dos números de 1 a 10         *");
		System.out.println("************************************************************");
		System.out.println();

		 Scanner captura = new Scanner(System.in);
	        
	        int num1;

	        System.out.print("Digite um número : ");
	        num1 = captura.nextInt();

	        for(int i=1; i<=num1; i++){
	            System.out.println(i + " ao quadrado = " + (i*i));
	        }
	    }
	}