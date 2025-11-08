package Guilherme.De.Azevedo.Bandeira;

import java.util.Scanner;

public class GAB30 {

    public static void main(String[] args) {
        System.out.println("****************************************************************");
        System.out.println("* Aluno: Guilherme de Azevedo Bandeira - RA:0024827 ************");
        System.out.println("* Classe GAB30 - Menu até escolher sair ************************");
        System.out.println("****************************************************************");
        System.out.println();

        Scanner cap = new Scanner(System.in);

        int op = 0;
        while(op != 2){
            System.out.println("1 - Mensagem");
            
            System.out.println("2 - Sair");
            
            System.out.print("Escolha: ");
            op = cap.nextInt();

            if(op == 1){
                System.out.println("Você escolheu a mensagem!");
            }
        }
           System.out.println("Encerrando...");
}
}