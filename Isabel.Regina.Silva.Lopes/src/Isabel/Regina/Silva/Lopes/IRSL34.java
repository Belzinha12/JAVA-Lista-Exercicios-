package Isabel.Regina.Silva.Lopes;

import java.util.Scanner;

public class IRSL34 {
	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("* Aluna: Isabel Regina Silva Lopes - RA: 0024188          *");
		System.out.println("* Classe: IRSL34 - Pedir senha até acertar                *");
		System.out.println("************************************************************");
		System.out.println();

	 Scanner captura = new Scanner(System.in);

     int senha = 24188, dig;
     do {
         System.out.print("Digite a senha: ");
         dig = captura.nextInt();
     } while(dig != senha);

     System.out.println("Acesso liberado!");
}
}
