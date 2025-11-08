package Guilherme.De.Azevedo.Bandeira;

public class GAB28 {

    public static void main(String[] args) {
        System.out.println("****************************************************************");
        System.out.println("* Aluno: Guilherme de Azevedo Bandeira - RA:0024827 ************");
        System.out.println("* Classe GAB28 - Soma dos pares entre 1 e 100 ******************");
        System.out.println("****************************************************************");
        System.out.println();

        int i = 1, soma = 0;
        
        while(i <= 100){
            if(i % 2 == 0){
                soma += i;
            }
            i++;
        }
        System.out.println("Soma dos pares = " + soma);
    }
}