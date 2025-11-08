package Isabel.Regina.Silva.Lopes;

public class IRSL28 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("* Aluna: Isabel Regina Silva Lopes - RA: 0024188          *");
		System.out.println("* Classe: IRSL28 - Soma dos pares entre 1 e 100           *");
		System.out.println("************************************************************");
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