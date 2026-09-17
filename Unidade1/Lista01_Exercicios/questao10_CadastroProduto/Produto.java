package Unidade1.Lista01_Exercicios.questao10_CadastroProduto;

import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);
        
        System.out.print("Insira o nome do produto: ");
        String nomeUser1 = meuScanner.nextLine();

        System.out.print("Insira o preço do produto: ");
        double preco1 = meuScanner.nextDouble();

        System.out.print("Insira a quantidade do produto: ");
        int quantidade1 = meuScanner.nextInt();

        // Limpa o buffer "\n"
        meuScanner.nextLine();

        Produto produto1 = new Produto(nomeUser1, preco1, quantidade1);

        System.out.println("");

        System.out.print("Insira o nome do produto: ");
        String nomeUser2 = meuScanner.nextLine();

        System.out.print("Insira o preço do produto: ");
        double preco2 = meuScanner.nextDouble();

        System.out.print("Insira o quantidade do produto: ");
        int quantidade2 = meuScanner.nextInt();        

        meuScanner.close();

        Produto produto2 = new Produto(nomeUser2, preco2, quantidade2);

        System.out.println("");

        System.out.println("Nome do produto: " + produto1.getNome());
        System.out.println("Preço do produto: " + produto1.getPreco());
        System.out.println("Quantidade do produto: " + produto1.getQuantidade());

        System.out.println("");

        System.out.println("Nome do produto: " + produto2.getNome());
        System.out.println("Preço do produto: " + produto2.getPreco());
        System.out.println("Quantidade do produto: " + produto2.getQuantidade());
    }
}
