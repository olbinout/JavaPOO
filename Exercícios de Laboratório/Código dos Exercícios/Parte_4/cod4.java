package Parte_4;

import java.util.Scanner;
   
public class cod4 {
    public static void main (String[] Args){
        Scanner meuScanner = new Scanner(System.in);
        double nota1, nota2, nota3;
        String nomeUser;

        System.out.print("Insira seu nome: ");
        nomeUser = meuScanner.nextLine();

        System.out.print("Insira sua primeira nota: ");
        nota1 = meuScanner.nextDouble();

        System.out.print("Insira sua primeira nota: ");
        nota2 = meuScanner.nextDouble();

        System.out.print("Insira sua primeira nota: ");
        nota3 = meuScanner.nextDouble();

        meuScanner.close();

        double mediaUser = calcularMedia(nota1, nota2, nota3);

        imprimirConceito(nomeUser, mediaUser);

    }


    public static double calcularMedia(double n1, double n2, double n3){
        return (n1 + n2 + n3) / 3;
    }

    public static void imprimirConceito(String nome, double media){
        System.out.println("Aluno: " + nome);
        System.out.printf("Média: %.1f\n", media);

        System.out.print("Conceito: ");
        if (media >= 8.5){
            System.out.println("A");
        }

        else if (media < 8.5 && media >= 7){
            System.out.println("B");
        }

        else if (media < 7 && media >= 5){
            System.out.println("C");
        }

        else if (media < 5 && media >= 3.5){
            System.out.println("D");
        }

        else {
            System.out.println("E");
        }

    }
    
}