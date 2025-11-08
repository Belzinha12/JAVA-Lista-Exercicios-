package Guilherme.De.Azevedo.Bandeira;

import java.util.Scanner;

public class GAB02 {

	public static void main(String[] args) {
		System.out.println("****************************************************************");
	    System.out.println("* Aluno: Guilherme de Azevedo Bandeira - RA:0024827 ************");
	    System.out.println("* Classe GAB02 - Par ou ímpar **********************************");
	    System.out.println("****************************************************************");
	    System.out.println();
	    
	    
        Scanner cap = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = cap.nextInt();

        if (n1 % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
}
}
}