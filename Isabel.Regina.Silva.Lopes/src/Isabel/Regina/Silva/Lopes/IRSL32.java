package Isabel.Regina.Silva.Lopes;

import java.util.Scanner;

public class IRSL32 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("* Aluna: Isabel Regina Silva Lopes - RA: 0024188          *");
		System.out.println("* Classe: IRSL32 - Tabuada de um número                   *");
		System.out.println("************************************************************");
		System.out.println();

	Scanner captura = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int num1 = captura.nextInt();
    
    int i = 1;

    do {
        System.out.println(num1 + " x " + i + " = " + (num1 * i));
        i++;
    } while(i <= 10);
}
}