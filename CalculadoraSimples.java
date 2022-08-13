package com.mycompany.calculadorasimples;
/**
 *
 * @author srpatric
 */
import java.util.Scanner;
public class CalculadoraSimples {

    public static void main(String[] args) {
        double n1, n2; 
        double soma, subtracao, multiplicacao, divisao;
        int op;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o primeiro valor: ");
        n1 = entrada.nextDouble();
        System.out.println("Informe o segundo valor ");
        n2 = entrada.nextDouble();
      
        System.out.println("######SELECIONE UMA OPERAÇAO######");
        System.out.println("[1] - SOMA");
        System.out.println("[2] - SUBTRAIR");
        System.out.println("[3] - MULTIPLICAR");
        System.out.println("[4] - DIVIDIR");
        
        System.out.println(">>>>>>>>>>> Digite uma opção: ");
        op = entrada.nextInt();
        
        switch(op) {
            case 1 -> {
                soma = n1+n2;
                System.out.println("A soma é: "+soma);
            }
            case 2 -> { 
                subtracao = n1-n2;
                System.out.println("A subitração é: "+subtracao);
            }
            case 3 -> {
                multiplicacao = n1*n2;
                System.out.println("A multiplicação é: "+multiplicacao);
            }
            case 4 -> {
                if(n1<n2){
                    System.out.println("Impossível de realizar o calculo");
                }
                else {
                    divisao = n1/n2;
                    System.out.println("A divisão é: "+divisao);
                }
            }
                 
                 default -> System.out.println("OPERAÇÃO INVÁLIDA");
        }
        
    }
}
