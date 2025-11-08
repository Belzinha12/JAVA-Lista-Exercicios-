package Guilherme.De.Azevedo.Bandeira;

import java.util.Scanner;

public class GAB17 {

	public static void main(String[] args) {
        System.out.println("****************************************************************");
        System.out.println("* Aluno: Guilherme de Azevedo Bandeira - RA:0024827 ************");
        System.out.println("* Classe GAB17 - Quadrado dos números **************************");
        System.out.println("****************************************************************");
        System.out.println();
        
        Scanner cap = new Scanner(System.in);
        
        int n1;

        System.out.print("Digite um número : ");
        n1 = cap.nextInt();

        for(int i=1; i<=n1; i++){
            System.out.println(i + " ao quadrado = " + (i*i));
        }
    }
}