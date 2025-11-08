package Guilherme.De.Azevedo.Bandeira;

import java.util.Scanner;

public class GAB05{
public static void main(String[] args) {
	
	System.out.println("****************************************************************");
    System.out.println("* Aluno: Guilherme de Azevedo Bandeira - RA:0024827 ************");
    System.out.println("* Classe GAB05 - Notas e aprovação *****************************");
    System.out.println("****************************************************************");
    System.out.println();
    
    Scanner cap = new Scanner(System.in);

    System.out.print("Digite a nota da primeira avaliação: ");
    double n1 = cap.nextDouble();

    System.out.print("Digite a nota da segunda avaliação: ");
    double n2 = cap.nextDouble();

    double med = (n1 + n2) / 2;

    System.out.println("Média final: " + med);

    if (med >= 7) {
        System.out.println("Aprovado");
    } else {
        System.out.println("Reprovado");
}
}
}
