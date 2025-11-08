package Guilherme.De.Azevedo.Bandeira;

import java.util.Scanner;

public class GAB06 {

    public static void main(String[] args) {
        System.out.println("****************************************************************");
        System.out.println("* Aluno: Guilherme de Azevedo Bandeira - RA:0024827 ************");
        System.out.println("* Classe GAB06 - Múltiplo de 3 e/ou 5 **************************");
        System.out.println("****************************************************************");
        System.out.println();
        
        Scanner cap = new Scanner(System.in);
        
        System.out.println("Digíte um número : ");
        
        int n1 = cap.nextInt();
        
        if(n1 % 3 == 0 && n1 % 5 == 0) System.out.println("Multiplo de 3 e 5");
        
        else if(n1 % 3 == 0) System.out.println("Multiplo de 3");
        
        else if(n1 % 5 == 0) System.out.println("Multiplo de 5");
        
        else System.out.println("Nao e multiplo de 3 nem 5");
        
}
}