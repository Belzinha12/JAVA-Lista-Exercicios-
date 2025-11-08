package Guilherme.De.Azevedo.Bandeira;

import java.util.Scanner;

public class GAB09 {

	public static void main(String[] args) {
        System.out.println("****************************************************************");
        System.out.println("* Aluno: Guilherme de Azevedo Bandeira - RA:0024827 ************");
        System.out.println("* Classe GAB09 - Ordem crescente *******************************");
        System.out.println("****************************************************************");
        System.out.println();

        Scanner cap = new Scanner(System.in);
        
        System.out.print("Digite o 1º numero: ");
        int n1 = cap.nextInt();
        
        System.out.print("Digite o 2º numero: ");
        int n2 = cap.nextInt();
        
        System.out.print("Digite o 3º numero: ");
        int n3 = cap.nextInt();
        
        int ordem;
        
        if(n1>n2){ordem=n1;n1=n2;n2=ordem;}
        if(n2>n3){ordem=n2;n2=n3;n3=ordem;}
        if(n1>n2){ordem=n1;n1=n2;n2=ordem;}
        
        System.out.println(n1+" "+n2+" "+n3);  
    }
}