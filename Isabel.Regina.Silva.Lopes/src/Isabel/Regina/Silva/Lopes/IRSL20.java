package Isabel.Regina.Silva.Lopes;

import java.util.Scanner;

public class IRSL20 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("* Aluna: Isabel Regina Silva Lopes - RA: 0024188          *");
		System.out.println("* Classe: IRSL20 - Números de Fibonacci                   *");
		System.out.println("************************************************************");
		System.out.println();

		Scanner captura = new Scanner(System.in);
        System.out.print("Digite o número de termos: ");
        int num1 = captura.nextInt();
        int seq1 = 0, seq2 = 1, seq3;

        System.out.print("Sequência: ");
        for(int i = 1; i <= num1; i++){
            System.out.print(seq1 + " ");
            seq3 = seq1 + seq2;
            seq1 = seq2;
            seq2 = seq3;
}
}
}