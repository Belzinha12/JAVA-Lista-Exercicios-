package Guilherme.De.Azevedo.Bandeira;

import java.util.Scanner;

public class GAB04 {

	public static void main(String[] args) {
		System.out.println("****************************************************************");
	    System.out.println("* Aluno: Guilherme de Azevedo Bandeira - RA:0024827 ************");
	    System.out.println("* Classe GAB04 - Pode votar? ***********************************");
	    System.out.println("****************************************************************");
	    System.out.println();	    
	    
        Scanner cap = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = cap.nextInt();

        if (idade >= 16) {
            System.out.println("Pode votar");
        } else {
            System.out.println("Não pode votar");
}
}
}							