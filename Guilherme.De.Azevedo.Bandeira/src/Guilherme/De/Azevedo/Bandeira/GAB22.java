package Guilherme.De.Azevedo.Bandeira;

import java.util.Scanner;

public class GAB22 {

	 public static void main(String[] args) {
	        System.out.println("****************************************************************");
	        System.out.println("* Aluno: Guilherme de Azevedo Bandeira - RA:0024827 ************");
	        System.out.println("* Classe GAB22 - Soma até digitar zero *************************");
	        System.out.println("****************************************************************");
	        System.out.println();
	        
            Scanner cap = new Scanner(System.in);
            
	        int n1, soma = 0;
	        
	        System.out.print("Digite um número (0 para parar a soma): ");
	        n1 = cap.nextInt();

	        while(n1 != 0){
	        	
	            soma += n1;
	            
	        System.out.print("Digite um número (0 para parar a soma): ");
	        n1 = cap.nextInt();
	        }

	        System.out.println("Soma total = " + soma);
}
}