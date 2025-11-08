package Guilherme.De.Azevedo.Bandeira;

import java.util.Scanner;

public class GAB35 {

    public static void main(String[] args) {
        System.out.println("****************************************************************");
        System.out.println("* Aluno: Guilherme de Azevedo Bandeira - RA:0024827 ************");
        System.out.println("* Classe GAB35 - Número positivo obrigatório *******************");
        System.out.println("****************************************************************");
        System.out.println();
        
        Scanner cap = new Scanner(System.in);

        int n1;
        do {
            System.out.print("Digite um número positivo: ");
            n1 = cap.nextInt();
        } while(n1 <= 0);

        System.out.println("Número aceito: " + n1);
}
}