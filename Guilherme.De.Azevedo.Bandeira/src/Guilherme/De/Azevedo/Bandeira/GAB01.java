package Guilherme.De.Azevedo.Bandeira;

import java.util.Scanner;

public class GAB01 {

	public static void main(String[] args) {
		System.out.println("****************************************************************");
	    System.out.println("* Aluno: Guilherme de Azevedo Bandeira - RA:0024827 ************");
	    System.out.println("* Classe GAB01 - Número positivo ou negativo *******************");
	    System.out.println("****************************************************************");
	    System.out.println();
	    	    
        Scanner cap = new Scanner(System.in); 

        System.out.print("Digite um número: ");
        int n1 = cap.nextInt();

        if (n1 > 0) {
            System.out.println("Número positivo");
        } else if (n1 < 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("Zero");
}
}
}