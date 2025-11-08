package Guilherme.De.Azevedo.Bandeira;

import java.util.Scanner;

public class GAB03 {

	public static void main(String[] args) {
		System.out.println("****************************************************************");
	    System.out.println("* Aluno: Guilherme de Azevedo Bandeira - RA:0024827 ************");
	    System.out.println("* Classe GAB03 - Maior de dois número **************************");
	    System.out.println("****************************************************************");
	    System.out.println();
	    
	    
	    
        Scanner cap = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = cap.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = cap.nextInt();

        if (n1 > n2) {
            System.out.println("O maior é " + n1);
        } else if (n2 > n1) {
            System.out.println("O maior é " + n2);
        } else {
            System.out.println("Os dois números são iguais");
        }

    }
}
