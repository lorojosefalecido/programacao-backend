package com.mycompany;

import java.util.Scanner;

public class Aula05Repetição {
    
    public static void main(String[] args) {
        /**
         * For (para)
         * 
         * Para cada elemento repita
         * 1° variável de interação
         * 2° condição de parada
         * 3° incremento ou decremento
         */
        // incremento
        for(int i = 0; < 10; i = i+2) {
            System.out.println(i);
        }

        // decremento
        System.out.println(x:"Contagem regressiva...");
        for (int i = 10; i >= 0; i--) {
            Thread.sleep(1000L);
            System.out.println(i + "...");
        }
        System.out.println("Booom !!");

        /**
         * Classe Scanner
         * 
         * E utilizada para ler valores do usuario inseridas pelo prompt.
         */
        Scanner scan = new Scanner(System.in); // Criar o scanner
        System.out.println("Digite um numero: ");

        int numero = scan.nextInt(); // Lê o valor digitado e capturado pelo scanner
        System.out.println("Você digitou " + numero + " !!");
    }
}
