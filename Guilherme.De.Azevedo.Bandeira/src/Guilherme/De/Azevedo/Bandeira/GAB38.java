package Guilherme.De.Azevedo.Bandeira;

import java.util.Scanner;

public class GAB38 {

    public static void main(String[] args) {
        System.out.println("****************************************************************");
        System.out.println("* Aluno: Guilherme de Azevedo Bandeira - RA:0024827 ************");
        System.out.println("* Classe GAB38 - Confirmar saída com 's' ***********************");
        System.out.println("****************************************************************");
        System.out.println();
        
        Scanner cap = new Scanner(System.in);

        char resp;
        do {
            System.out.print("Deseja sair? (s/n): ");
            resp = cap.next().toLowerCase().charAt(0);
        } while(resp != 's');

        System.out.println("Programa encerrado.");
}
}