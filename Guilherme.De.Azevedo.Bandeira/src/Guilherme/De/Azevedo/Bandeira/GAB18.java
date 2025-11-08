package Guilherme.De.Azevedo.Bandeira;

import java.util.Scanner;

public class GAB18 {

	public static void main(String[] args) {
        System.out.println("****************************************************************");
        System.out.println("* Aluno: Guilherme de Azevedo Bandeira - RA:0024827 ************");
        System.out.println("* Classe GAB18 - Número primo **********************************");
        System.out.println("****************************************************************");
        System.out.println();
        
        Scanner cap = new Scanner(System.in);
        
        int n1, div=0;
        System.out.print("Digite um número: ");
        n1 = cap.nextInt();

        for (int i=1; i<=n1; i++){
            if(n1%i==0){
                div++;}
}

        if(div==2){
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }
    }
}