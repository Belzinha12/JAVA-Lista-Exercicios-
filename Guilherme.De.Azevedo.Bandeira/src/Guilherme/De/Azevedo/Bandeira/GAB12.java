package Guilherme.De.Azevedo.Bandeira;

import java.util.Scanner;

public class GAB12 {

	public static void main(String[] args) {
        System.out.println("****************************************************************");
        System.out.println("* Aluno: Guilherme de Azevedo Bandeira - RA:0024827 ************");
        System.out.println("* Classe GAB12 - Tabuada ***************************************");
        System.out.println("****************************************************************");
        System.out.println();

        Scanner cap = new Scanner(System.in);
        
        System.out.print("Digite um numero para tabuada: ");
        
        int tab = cap.nextInt();
        
        for(int i=1;i<=10;i++) 
        System.out.println(tab+" x "+i+" = "+(tab*i));
}
}