package Isabel.Regina.Silva.Lopes;

import java.util.Scanner;

public class IRSL25 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("* Aluna: Isabel Regina Silva Lopes - RA: 0024188          *");
		System.out.println("* Classe: IRSL25 - Tabuada com while                      *");
		System.out.println("************************************************************");
		System.out.println();

        Scanner captura = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        
        int num1 = captura.nextInt();
        
        int i = 1;

        while(i <= 10){
            System.out.println(num1 + " x " + i + " = " + (num1 * i));
            i++;
}

}
}