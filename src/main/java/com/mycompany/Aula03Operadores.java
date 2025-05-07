package com.mycompany;

public class Aula03Operadores {

    public static void main(String[] args) {
        /**
         * Tipos de Comentários
         */
        
        // Comentários de uma linha

        /**
          * Comentários de
          * múltiplas
          * linhas
          */

        /**
         * Declaração de variáveis
         */

        String var1; // Toda variável declarada sem valor, automáticamente é null,
        String var2 = null; // Variável declarada com valor null
        String var3 = ""; // Variável declarada com valor vazio (diferente de null)

        /**
         * Operadores Matemáticos
         */

        int num1 = 10;
        int num2 = 2;

        // Soma
        int soma = num1 + num2;
        System.out.println(" A soma entre " + num1 + " e " + num2 + " e: " + soma);

        // Subtração
        int subtracao = num1 - num2;
        System.out.println(" A subtração de " + num1 + " por " + num2 + " e: " + subtracao);

        // Multiplicação
        int multiplicacao = num1 * num2;
        System.out.println(" A multiplcação de " + num1 + " por " + num2 + " e: " + multiplicacao);

        // Divisão
        int divisao = num1 / num2;
        System.out.println(" A divisão de " + num1 + " por " + num2 + " e: " + divisao);
        
    }
}