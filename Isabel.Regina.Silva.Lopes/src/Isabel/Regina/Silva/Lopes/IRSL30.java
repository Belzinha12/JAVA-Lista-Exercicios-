package Isabel.Regina.Silva.Lopes;

import java.util.Scanner;

public class IRSL30 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("* Aluna: Isabel Regina Silva Lopes - RA: 0024188          *");
		System.out.println("* Classe: IRSL30 - Menu até escolher sair                 *");
		System.out.println("************************************************************");
		System.out.println();

    Scanner captura = new Scanner(System.in);

    int opcao = 0;
    while(opcao != 2){
        System.out.println("1 - Mensagem");
        
        System.out.println("2 - Sair");
        
        System.out.print("Escolha: ");
        opcao = captura.nextInt();

        if(opcao == 1){
            System.out.println("Você escolheu a mensagem!");
        }
    }
       System.out.println("Encerrando...");
}
}