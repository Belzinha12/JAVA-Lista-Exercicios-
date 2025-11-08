package Guilherme.De.Azevedo.Bandeira;

import java.util.Scanner;

public class GAB08 {

	public static void main(String[] args) {
        System.out.println("****************************************************************");
        System.out.println("* Aluno: Guilherme de Azevedo Bandeira - RA:0024827 ************");
        System.out.println("* Classe GAB08 - Login simples *********************************");
        System.out.println("****************************************************************");
        System.out.println();

        Scanner cap = new Scanner(System.in);
        
        System.out.print("Digite o usuario: ");
        String user = cap.nextLine();
        
        System.out.print("Digite a senha: ");
        String senha = cap.nextLine();
        
        if  (user.equals("guilherme") && senha.equals("24827"))
        	System.out.println("Acesso permitido");
        else 
        	System.out.println("Login invalido");
        
    }
}