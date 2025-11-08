package Guilherme.De.Azevedo.Bandeira;

import java.util.Scanner;

public class GAB10 {

	public static void main(String[] args) {
        System.out.println("****************************************************************");
        System.out.println("* Aluno: Guilherme de Azevedo Bandeira - RA:0024827 ************");
        System.out.println("* Classe GAB10 - Ano bissexto **********************************");
        System.out.println("****************************************************************");
        System.out.println();

        Scanner cap = new Scanner(System.in);
        
        System.out.print("Digite o ano: ");
        
        int n1 = cap.nextInt();
        
        if  ((n1%4==0 && n1%100!=0) || n1%400==0) 
        	System.out.println("Bissexto");
        else 
        	System.out.println("Nao bissexto");
        
    }
}