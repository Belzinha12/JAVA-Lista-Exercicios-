package Guilherme.De.Azevedo.Bandeira;

import java.util.Scanner;

public class GAB15 {

	 public static void main(String[] args) {
	        System.out.println("****************************************************************");
	        System.out.println("* Aluno: Guilherme de Azevedo Bandeira - RA:0024827 ************");
	        System.out.println("* Classe GAB15 - Fatorial **************************************");
	        System.out.println("****************************************************************");
	        System.out.println();

	        Scanner cap = new Scanner(System.in);
	        
	        System.out.print("Digite um numero: ");
	        
	        int n1 = cap.nextInt(), fat = 1;
	        
	        for(int i=1;i<=n1;i++) fat*=i;
	        System.out.println(fat);	        
	    }
	}