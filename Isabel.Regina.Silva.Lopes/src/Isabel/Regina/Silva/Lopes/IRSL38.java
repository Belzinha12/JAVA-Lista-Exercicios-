package Isabel.Regina.Silva.Lopes;

import java.util.Scanner;

public class IRSL38 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("* Aluna: Isabel Regina Silva Lopes - RA: 0024188          *");
		System.out.println("* Classe: IRSL38 - Confirmar saída com 's'                *");
		System.out.println("************************************************************");
		System.out.println();

	Scanner captura = new Scanner(System.in);

    char resp;
    do {
        System.out.print("Deseja sair? (s/n): ");
        resp = captura.next().toLowerCase().charAt(0);
    } while(resp != 's');

    System.out.println("Programa encerrado.");
}
}