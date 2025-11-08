package Isabel.Regina.Silva.Lopes;

import java.util.Scanner;

public class IRSL10 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("* Aluna: Isabel Regina Silva Lopes - RA: 0024188          *");
		System.out.println("* Classe: IRSL10 - Ano bissexto                           *");
		System.out.println("************************************************************");
		System.out.println();

        Scanner captura = new Scanner(System.in);
        
        System.out.print("Digite o ano: ");      
        int num1 = captura.nextInt();       
        if  ((num1%4==0 && num1%100!=0) || num1%400==0) 
        	System.out.println("Bissexto");
        else 
        	System.out.println("Nao bissexto");
        
    }
}
