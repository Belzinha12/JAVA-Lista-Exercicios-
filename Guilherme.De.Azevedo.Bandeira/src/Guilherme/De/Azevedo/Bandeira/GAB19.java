package Guilherme.De.Azevedo.Bandeira;

import java.util.Scanner;

public class GAB19 {

    public static void main(String[] args) {
        System.out.println("****************************************************************");
        System.out.println("* Aluno: Guilherme de Azevedo Bandeira - RA:0024827 ************");
        System.out.println("* Classe GAB19 - Verificar se um número é primo ****************");
        System.out.println("****************************************************************");
        System.out.println();
        
        Scanner cap = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = cap.nextInt();
        int div = 0;

        for(int i = 1; i <= n1; i++){
            if(n1 % i == 0){
                div++;
}
}

        if(div == 2){
            System.out.println("O número é primo.");
        } else {
            System.out.println("O número não é primo.");
}
}
}