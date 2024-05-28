
import java.util.Scanner;

public class DesafioContador {
public static void main(String[] args) {
    System.out.println();
    System.out.println("------CONTADOR--------");
    System.out.println();
    Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro:");
		int parametroUm =terminal.nextInt();
		
        System.out.println("Digite o segundo parâmetro:");
		int parametroDois = terminal.nextInt();
		
		
	

    try {
        contar(parametroUm, parametroDois);
    }catch (java.util.InputMismatchException e){
        System.out.println(e.getMessage());
    }
}  

    static void contar(int parametroUm, int parametroDois )  throws java.util.InputMismatchException {
            //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
            if(parametroUm > parametroDois) {
                      System.out.println ("O segundo parâmetro deve ser maior que o primeiro");
         }
        
            int contagem = parametroDois-parametroUm;
            for(int i=1; i <= contagem; i++) {  
                    System.out.println("Imprimindo o número " + i);
            }
            System.out.println();
            System.out.printf("Olá,A quantidade de números entre o PRIMEIRO PARAMETRO e o SEGUNDO PARAMETRO é:  %s,\n obrigado por UTILIZAR NOSSO SISTEMA", contagem);
            System.out.println();
     
         }

}
        

      

	
