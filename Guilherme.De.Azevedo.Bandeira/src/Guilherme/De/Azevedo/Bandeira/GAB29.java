package Guilherme.De.Azevedo.Bandeira;

import java.util.Scanner;

public class GAB29 {

    public static void main(String[] args) {
        System.out.println("****************************************************************");
        System.out.println("* Aluno: Guilherme de Azevedo Bandeira - RA:0024827 ************");
        System.out.println("* Classe GAB29 - Contar dígitos de um número *******************");
        System.out.println("****************************************************************");
        System.out.println();

        Scanner cap = new Scanner(System.in);

        System.out.print("Digite um número positivo: ");
        int n1 = cap.nextInt();
        int dig = 0;

        while(n1 > 0){
            n1 /= 10;
            dig++;
        }

        System.out.println("Quantidade de dígitos: " + dig);

}
}