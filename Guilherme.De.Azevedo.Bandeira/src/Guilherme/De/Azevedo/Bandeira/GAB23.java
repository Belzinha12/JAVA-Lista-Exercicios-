package Guilherme.De.Azevedo.Bandeira;

import java.util.Scanner;

public class GAB23 {

	public static void main(String[] args) {        
        System.out.println("****************************************************************");
        System.out.println("* Aluno: Guilherme de Azevedo Bandeira - RA:0024827 ************");
        System.out.println("* Classe GAB23 - Senha correta *********************************");
        System.out.println("****************************************************************");
        System.out.println();
        
        Scanner cap = new Scanner(System.in);
        
        int senha = 24827, tentativa = 0;
        while(tentativa != senha){
            System.out.print("Digite a senha: ");
            tentativa = cap.nextInt();
}
        System.out.println("Acesso liberado!");
 
}
}