package Guilherme.De.Azevedo.Bandeira;

import java.util.Scanner;

public class GAB25 {

    public static void main(String[] args) {       
        System.out.println("****************************************************************");
        System.out.println("* Aluno: Guilherme de Azevedo Bandeira - RA:0024827 ************");
        System.out.println("* Classe GAB25 - Tabuada com while *****************************");
        System.out.println("****************************************************************");
        System.out.println();
        
        Scanner cap = new Scanner(System.in);
        System.out.print("Digite um número: ");
        
        int n1 = cap.nextInt();
        
        int i = 1;

        while(i <= 10){
            System.out.println(n1 + " x " + i + " = " + (n1 * i));
            i++;
}

}
}