package Guilherme.De.Azevedo.Bandeira;

import java.util.Scanner;

public class GAB39 {

	public static void main(String[] args) {
        System.out.println("****************************************************************");
        System.out.println("* Aluno: Guilherme de Azevedo Bandeira - RA:0024827 ************");
        System.out.println("* Classe GAB39 - Validar número entre 1 e 5 ********************");
        System.out.println("****************************************************************");
        System.out.println();
        
        Scanner cap = new Scanner(System.in);

        int n1;
        do {
            System.out.print("Digite um número entre 1 e 5: ");
            n1 = cap.nextInt();
        } while(n1 < 1 || n1 > 5);

        System.out.println("Número aceito: " + n1);
}
}