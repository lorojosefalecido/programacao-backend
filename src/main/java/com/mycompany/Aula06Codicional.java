package com.mycompany;

public class Aula06Condicional {
    public static void main(String[] args) {
       /**
        * Estrutura condicional simples (if, else)
        * 
        * pode ser lida como: SF, SENÃO
        *
        * A condição verdadeira é executada dentro do if
        */ 
        int num = 3;
        
        // % é o resto da divisão
        // comparando com 0, significa que o número é par
        if (num % 2 == 0) {
            System.out.println(num + " é par !!");
        } else {
            System.out.println(num + "é ímpar !!");
        }

        /**
         * Estrutura condicional
         */
        
        double imc = 24.0;

        if (imc < 18.5) {
            System.out.println("Está abaixo do peso");
        }else if (imc >= 18.5 && imc < 24.5) {
            System.out.println("Está com peso ideal");
        }else {
            System.out.println("Está com obesidade");
        }
    }
}
