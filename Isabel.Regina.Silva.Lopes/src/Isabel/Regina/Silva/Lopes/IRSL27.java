package Isabel.Regina.Silva.Lopes;

import java.util.Scanner;

public class IRSL27 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("* Aluna: Isabel Regina Silva Lopes - RA: 0024188          *");
		System.out.println("* Classe: IRSL27 - Quantidade de números ímpares          *");
		System.out.println("************************************************************");
		System.out.println();

	 Scanner captura = new Scanner(System.in);
     
     int i = 1, impar = 0, num1;
     
     while(i <= 5){
         System.out.print("Digite o " + i + "º número: ");
         num1 = captura.nextInt();
         if(num1 % 2 != 0){
             impar++;
         }
         i++;
     }
     System.out.println("Quantidade de ímpares: " + impar);
}
}