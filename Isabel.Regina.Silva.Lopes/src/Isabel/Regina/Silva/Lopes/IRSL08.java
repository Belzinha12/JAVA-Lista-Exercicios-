package Isabel.Regina.Silva.Lopes;

import java.util.Scanner;

public class IRSL08 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("* Aluna: Isabel Regina Silva Lopes - RA: 0024188          *");
		System.out.println("* Classe: IRSL08 - Login simples                           *");
		System.out.println("************************************************************");
		System.out.println();

        Scanner captura = new Scanner(System.in);
        
        System.out.print("Digite o usuario: ");
        String usuario = captura.nextLine();
        
        System.out.print("Digite a senha: ");
        String senha = captura.nextLine();
        
        if  (usuario.equals("isabel") && senha.equals("24188"))
        	System.out.println("Acesso permitido");
        else 
        	System.out.println("Login invalido");
        
    }
}