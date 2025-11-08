package Guilherme.De.Azevedo.Bandeira;

import java.util.Scanner;

public class GAB34 {

    public static void main(String[] args) {
        System.out.println("****************************************************************");
        System.out.println("* Aluno: Guilherme de Azevedo Bandeira - RA:0024827 ************");
        System.out.println("* Classe GAB34 - Pedir senha até acertar ***********************");
        System.out.println("****************************************************************");
        System.out.println();
        
        Scanner cap = new Scanner(System.in);

        int senha = 24827, dig;
        do {
            System.out.print("Digite a senha: ");
            dig = cap.nextInt();
        } while(dig != senha);

        System.out.println("Acesso liberado!");
}
}