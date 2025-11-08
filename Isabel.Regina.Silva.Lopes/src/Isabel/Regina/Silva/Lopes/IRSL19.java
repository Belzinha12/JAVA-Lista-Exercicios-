package Isabel.Regina.Silva.Lopes;

import java.util.Scanner;

public class IRSL19 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("* Aluna: Isabel Regina Silva Lopes - RA: 0024188          *");
		System.out.println("* Classe: IRSL19 - Verificar se um número é primo         *");
		System.out.println("************************************************************");
		System.out.println();


        Scanner captura = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = captura.nextInt();
        int div = 0;

        for(int i = 1; i <= num1; i++){
            if(num1 % i == 0){
                div++;
}
}

        if(div == 2){
            System.out.println("O número é primo.");
        } else {
            System.out.println("O número não é primo.");
}
}
}