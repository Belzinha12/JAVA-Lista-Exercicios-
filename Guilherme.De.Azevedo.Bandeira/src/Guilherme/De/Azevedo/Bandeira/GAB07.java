package Guilherme.De.Azevedo.Bandeira;

import java.util.Scanner;

public class GAB07 {

	public static void main(String[] args) {
        System.out.println("****************************************************************");
        System.out.println("* Aluno: Guilherme de Azevedo Bandeira - RA:0024827 ************");
        System.out.println("* Classe GAB07 - Triângulo válido ******************************");
        System.out.println("****************************************************************");
        System.out.println();

        Scanner cap = new Scanner(System.in);
        
        System.out.print("Digite o 1º lado : ");
        int l1 = cap.nextInt();
       
        System.out.print("Digite o 2º lado : ");
        int l2 = cap.nextInt();
        
        System.out.print("Digite o 3º lado : ");
        int l3 = cap.nextInt();
        
        
        if (l1 < l2 + l3 && l2 < l1 + l3 && l3 < l1 + l2) { 
        System.out.println("Triangulo valido");
        }
        else {
        System.out.println("Nao e triangulo");       
   }
}
}