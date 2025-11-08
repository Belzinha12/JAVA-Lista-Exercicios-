package Isabel.Regina.Silva.Lopes;

import java.util.Scanner;

public class IRSL07 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("* Aluna: Isabel Regina Silva Lopes - RA: 0024188          *");
		System.out.println("* Classe: IRSL07 - Triângulo válido                        *");
		System.out.println("************************************************************");
		System.out.println();

        Scanner captura = new Scanner(System.in);
        
        System.out.print("Digite o 1º lado : ");
        int num1 = captura.nextInt();
       
        System.out.print("Digite o 2º lado : ");
        int num2 = captura.nextInt();
        
        System.out.print("Digite o 3º lado : ");
        int num3 = captura.nextInt();
        
        
        if (num1 < num2 + num3 && num2 < num1 + num3 && num3 < num1 + num2) { 
        System.out.println("Triangulo valido");
        }
        else {
        System.out.println("Nao e triangulo");       
   }
}
}
