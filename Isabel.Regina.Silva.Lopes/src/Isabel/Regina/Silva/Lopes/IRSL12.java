package Isabel.Regina.Silva.Lopes;

import java.util.Scanner;

public class IRSL12 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("* Aluna: Isabel Regina Silva Lopes - RA: 0024188          *");
		System.out.println("* Classe: IRSL12 - Tabuada de um número                   *");
		System.out.println("************************************************************");
		System.out.println();

        Scanner captura = new Scanner(System.in);
        
        System.out.print("Digite um numero para tabuada: ");
        
        int tabuada = captura.nextInt();
        
        for(int i=1;i<=10;i++) 
        System.out.println(tabuada+" x "+i+" = "+(tabuada*i));
	}
}
