package Isabel.Regina.Silva.Lopes;

import java.util.Scanner;

public class IRSL26 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("* Aluna: Isabel Regina Silva Lopes - RA: 0024188          *");
		System.out.println("* Classe: IRSL26 - Número primo com while                 *");
		System.out.println("************************************************************");
		System.out.println();

    Scanner captura = new Scanner(System.in);
    
    System.out.print("Digite um número: ");
    int num1 = captura.nextInt();
    
    int i = 1, divis = 0;

    while(i <= num1){
        if(num1 % i == 0){
            divis++;
        }
        i++;
    }

    if(divis == 2){
        System.out.println("O número é primo.");
    } else {
        System.out.println("O número não é primo.");
}
}
}