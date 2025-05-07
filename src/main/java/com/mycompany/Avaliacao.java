package com.mycompany;

public class Avaliacao {
    //Atividade1

    public static void main(String[] args) {
        int pai = 46;
        int mae = 45;
        int filho = 20;
        int filha = 9;

        int totalIades = pai + mae + filho + filha;
        int numeroFamilia = 4;

        int mediaIdade = (int) totalIdades / numeroFamilia;

         System.out.println("A média de idade da família é: " + mediaIdade + "anos.");

    }
    //Atividad 2

        double raio = 25.0;
        double area = Math.PI * Math.pow(raio, b:2);
        System.out.println(format:"A área do circulo com raio de %.2f cm é: %.2f cm²%n", raio, area);

    //Atividade3

        double precoOriginal = 1200.00;
        double percentualReajuste = 15.0;

        double valorReajuste = (percentualReajuste / 100) * precoOriginal;
        double precoFinal = precoOriginal + valorReajuste;

        System.out.println("O preço final do produto após o reajuste é: R$ " + precoFinal);

    //Atividade4

       // Preço do produto
        double precoProduto = 850.00;
       // Percentual de desconto
        double percentualDesconto = 0.30;

       // Cálculo do desconto
        double desconto = precoProduto * percentualDesconto;
        double precoComDesconto = precoProduto - desconto;

       // Exibindo os resultados
        System.out.printf("Preço original: R$ %.2f%n", precoProduto);
        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("Preço com desconto: R$ %.2f%n", precoComDesconto);



}