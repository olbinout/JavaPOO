package Unidade1.Lista01_Exercicios.questao9_Maioridade;

import java.util.Scanner;

public class Maioridade {
    private String nome;
    private int idade;

    public Maioridade(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    boolean isMaiorDeIdade(){
        if (18 <= getIdade()){
            return true;
        }

        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String nomeUser = meuScanner.nextLine();

        System.out.print("Insira sua idade: ");
        int idadeUser = meuScanner.nextInt();

        meuScanner.close();

        Maioridade meuMaioridade = new Maioridade(nomeUser, idadeUser);

        System.out.printf("%s é maior de idade? %b\n", meuMaioridade.nome, meuMaioridade.isMaiorDeIdade());
    }
}
