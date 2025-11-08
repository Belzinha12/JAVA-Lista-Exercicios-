package Guilherme.De.Azevedo.Bandeira;

import java.util.Scanner;

public class GAB40 {

	public static void main(String[] args) {
        System.out.println("****************************************************************");
        System.out.println("* Aluno: Guilherme de Azevedo Bandeira - RA:0024827 ************");
        System.out.println("* Classe GAB40 - Maior número até digitar negativo *************");
        System.out.println("****************************************************************");
        System.out.println();
        
        Scanner cap = new Scanner(System.in);

        int n1, maior = 0;
        do {
            System.out.print("Digite um número (negativo para sair): ");
            n1 = cap.nextInt();
            if(n1 > maior && n1 >= 0){
                maior = n1;
            }
        } while(n1 >= 0);

        System.out.println("Maior número digitado: " + maior);
}
}