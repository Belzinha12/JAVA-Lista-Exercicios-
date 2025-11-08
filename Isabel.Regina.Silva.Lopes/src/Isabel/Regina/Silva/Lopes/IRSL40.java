package Isabel.Regina.Silva.Lopes;

import java.util.Scanner;

public class IRSL40 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("* Aluna: Isabel Regina Silva Lopes - RA: 0024188          *");
		System.out.println("* Classe: IRSL40 - Ler números e mostrar o maior          *");
		System.out.println("************************************************************");
		System.out.println();

        Scanner captura = new Scanner(System.in);

        int num1, maior = 0;
        do {
            System.out.print("Digite um número (negativo para sair): ");
            num1 = captura.nextInt();
            if(num1 > maior && num1 >= 0){
                maior = num1;
            }
        } while(num1 >= 0);

        System.out.println("Maior número digitado: " + maior);
}
}