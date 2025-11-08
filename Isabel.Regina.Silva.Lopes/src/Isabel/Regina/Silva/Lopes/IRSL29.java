package Isabel.Regina.Silva.Lopes;

import java.util.Scanner;

public class IRSL29 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("* Aluna: Isabel Regina Silva Lopes - RA: 0024188          *");
		System.out.println("* Classe: IRSL29 - Contar dígitos de um número            *");
		System.out.println("************************************************************");
		System.out.println();

    Scanner captura = new Scanner(System.in);

    System.out.print("Digite um número positivo: ");
    int num1 = captura.nextInt();
    int digitos = 0;

    while(num1 > 0){
        num1 /= 10;
        digitos++;
    }

    System.out.println("Quantidade de dígitos: " + digitos);

}
}