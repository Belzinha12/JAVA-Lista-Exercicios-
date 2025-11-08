package Guilherme.De.Azevedo.Bandeira;

import java.util.Scanner;

public class GAB37 {

    public static void main(String[] args) {
        System.out.println("****************************************************************");
        System.out.println("* Aluno: Guilherme de Azevedo Bandeira - RA:0024827 ************");
        System.out.println("* Classe GAB37 - Soma até múltiplo de 10 ***********************");
        System.out.println("****************************************************************");
        System.out.println();
        
        Scanner cap = new Scanner(System.in);

        int n1, soma = 0;
        do {
            System.out.print("Digite um número (para parar escreva um múltiplo de 10!):  ");
            n1 = cap.nextInt();
            soma += n1;
        } while(n1 % 10 != 0);

        System.out.println("Soma total: " + soma);
}
}