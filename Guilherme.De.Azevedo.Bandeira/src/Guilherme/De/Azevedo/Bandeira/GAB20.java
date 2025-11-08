package Guilherme.De.Azevedo.Bandeira;

import java.util.Scanner;

public class GAB20 {

	public static void main(String[] args) {
        
        System.out.println("****************************************************************");
        System.out.println("* Aluno: Guilherme de Azevedo Bandeira - RA:0024827 ************");
        System.out.println("* Classe GAB20 - Números de Fibonacci **************************");
        System.out.println("****************************************************************");
        System.out.println();
        
        Scanner cap = new Scanner(System.in);
        System.out.print("Digite o número de termos: ");
        int n1 = cap.nextInt();
        int t1 = 0, t2 = 1, t3;

        System.out.print("Sequência: ");
        for(int i = 1; i <= n1; i++){
            System.out.print(t1 + " ");
            t3 = t1 + t2;
            t1 = t2;
            t2 = t3;
}
}
}