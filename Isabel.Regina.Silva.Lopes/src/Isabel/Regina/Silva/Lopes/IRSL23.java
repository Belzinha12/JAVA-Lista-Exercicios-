package Isabel.Regina.Silva.Lopes;

import java.util.Scanner;

public class IRSL23 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("* Aluna: Isabel Regina Silva Lopes - RA: 0024188          *");
		System.out.println("* Classe: IRSL23 - Senha correta                          *");
		System.out.println("************************************************************");
		System.out.println();

    Scanner captura = new Scanner(System.in);
    
    int senha = 24188, tentativa = 0;
    while(tentativa != senha){
        System.out.print("Digite a senha: ");
        tentativa = captura.nextInt();
}
    System.out.println("Acesso liberado!");

}
}
