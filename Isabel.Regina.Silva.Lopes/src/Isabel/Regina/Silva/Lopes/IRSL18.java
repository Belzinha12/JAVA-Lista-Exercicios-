package Isabel.Regina.Silva.Lopes;

import java.util.Scanner;

public class IRSL18 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("* Aluna: Isabel Regina Silva Lopes - RA: 0024188          *");
		System.out.println("* Classe: IRSL18 - Múltiplos de 3 entre 1 e 30            *");
		System.out.println("************************************************************");
		System.out.println();

		 Scanner captura = new Scanner(System.in);
	        
	        int num1, div=0;
	        System.out.print("Digite um número: ");
	        num1 = captura.nextInt();

	        for (int i=1; i<=num1; i++){
	            if(num1%i==0){
	                div++;}
	}

	        if(div==2){
	            System.out.println("É primo");
	        } else {
	            System.out.println("Não é primo");
	        }
	    }
	}