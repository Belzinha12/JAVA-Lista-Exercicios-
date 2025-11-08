package Isabel.Regina.Silva.Lopes;

import java.util.Scanner;

public class IRSL04 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("* Aluna: Isabel Regina Silva Lopes - RA: 0024188          *");
		System.out.println("* Classe: IRSL04 - Pode votar?                             *");
		System.out.println("************************************************************");
		System.out.println();
	
        Scanner captura = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = captura.nextInt();

        if (idade >= 16) {
            System.out.println("Pode votar");
        } else {
            System.out.println("Não pode votar");
}
}
}	