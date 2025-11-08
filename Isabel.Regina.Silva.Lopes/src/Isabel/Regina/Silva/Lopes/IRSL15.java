package Isabel.Regina.Silva.Lopes;

import java.util.Scanner;

public class IRSL15 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("* Aluna: Isabel Regina Silva Lopes - RA: 0024188          *");
		System.out.println("* Classe: IRSL15 - Fatorial de um número                  *");
		System.out.println("************************************************************");
		System.out.println();
		
		Scanner captura = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        
        int num1 = captura.nextInt(), fatori = 1;
        
        for(int i=1;i<=num1;i++) fatori*=i;
        System.out.println(fatori);	        
    }
}