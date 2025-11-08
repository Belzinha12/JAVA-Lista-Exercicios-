package Guilherme.De.Azevedo.Bandeira;

import java.util.Scanner;

public class GAB27 {

    public static void main(String[] args) {
        System.out.println("****************************************************************");
        System.out.println("* Aluno: Guilherme de Azevedo Bandeira - RA:0024827 ************");
        System.out.println("* Classe GAB27 - Quantidade de ímpares digitados ***************");
        System.out.println("****************************************************************");
        System.out.println();
        
        Scanner cap = new Scanner(System.in);
        
        int i = 1, imp = 0, n1;
        
        while(i <= 5){
            System.out.print("Digite o " + i + "º número: ");
            n1 = cap.nextInt();
            if(n1 % 2 != 0){
                imp++;
            }
            i++;
        }
        System.out.println("Quantidade de ímpares: " + imp);
}
}