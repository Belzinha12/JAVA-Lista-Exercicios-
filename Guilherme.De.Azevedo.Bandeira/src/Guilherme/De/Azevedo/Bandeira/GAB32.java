package Guilherme.De.Azevedo.Bandeira;

import java.util.Scanner;

public class GAB32 {

    public static void main(String[] args) {
        System.out.println("****************************************************************");
        System.out.println("* Aluno: Guilherme de Azevedo Bandeira - RA:0024827 ************");
        System.out.println("* Classe GAB32 - Tabuada de um número **************************");
        System.out.println("****************************************************************");
        System.out.println();
        
        Scanner cap = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = cap.nextInt();
        
        int i = 1;

        do {
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
        } while(i <= 10);
}
}
