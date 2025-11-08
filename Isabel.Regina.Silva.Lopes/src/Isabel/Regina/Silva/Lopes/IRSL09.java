package Isabel.Regina.Silva.Lopes;

import java.util.Scanner;

public class IRSL09 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("* Aluna: Isabel Regina Silva Lopes - RA: 0024188          *");
		System.out.println("* Classe: IRSL9 - Ordem crescente (três números)          *");
		System.out.println("************************************************************");
		System.out.println();

		 Scanner captura = new Scanner(System.in);
	        
	        System.out.print("Digite o 1º numero: ");
	        int num1 = captura.nextInt();
	        
	        System.out.print("Digite o 2º numero: ");
	        int num2 = captura.nextInt();
	        
	        System.out.print("Digite o 3º numero: ");
	        int num3 = captura.nextInt();
	        
	        int ordem;
	        
	        if(num1>num2){ordem=num1;num1=num2;num2=ordem;}
	        if(num2>num3){ordem=num2;num2=num3;num3=ordem;}
	        if(num1>num2){ordem=num1;num1=num2;num2=ordem;}
	        
	        System.out.println(num1+" "+num2+" "+num3);  
	    }
	}
