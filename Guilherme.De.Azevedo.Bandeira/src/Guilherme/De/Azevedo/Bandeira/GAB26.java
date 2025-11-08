package Guilherme.De.Azevedo.Bandeira;

import java.util.Scanner;

public class GAB26 {

    public static void main(String[] args) {        
        System.out.println("****************************************************************");
        System.out.println("* Aluno: Guilherme de Azevedo Bandeira - RA:0024827 ************");
        System.out.println("* Classe GAB26 - Número primo com while ************************");
        System.out.println("****************************************************************");
        System.out.println();
        
        Scanner cap = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int n1 = cap.nextInt();
        
        int i = 1, div = 0;

        while(i <= n1){
            if(n1 % i == 0){
                div++;
            }
            i++;
        }

        if(div == 2){
            System.out.println("O número é primo.");
        } else {
            System.out.println("O número não é primo.");
}
}
}