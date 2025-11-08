package Isabel.Regina.Silva.Lopes;

import java.util.Scanner;

public class IRSL24 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("* Aluna: Isabel Regina Silva Lopes - RA: 0024188          *");
		System.out.println("* Classe: IRSL24 - Verificar se um número é positivo      *");
		System.out.println("************************************************************");
		System.out.println();

    Scanner captura = new Scanner(System.in);
    
    int num1;
    
    do {
        System.out.print("Digite um número positivo: ");
        num1 = captura.nextInt();
        
    } while(num1 <= 0);

    System.out.println("Número aceito: " + num1);
}
}