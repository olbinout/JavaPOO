package Parte_2;

import java.util.Scanner;

public class cod5 {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);
        double nota1, nota2, nota3;

        System.out.print("Insira sua primeira nota: ");
        nota1 = meuScanner.nextDouble();
        System.out.print("Insira sua segunda nota: ");
        nota2 = meuScanner.nextDouble();
        System.out.print("Insira sua terceira nota: ");
        nota3 = meuScanner.nextDouble();

        double mediaParcial = (nota1 + nota2 + nota3) / 3;

        if (mediaParcial >= 7){
            System.out.println("Aprovado por média parcial");
        }

        else if (3.5 <= mediaParcial && mediaParcial < 7){
            System.out.println("Encaminhado para Avaliação Final");
            System.out.print("Quanto você tirou na AF? ");
            double afUser = meuScanner.nextDouble();

            double mediaFinal = ((6 * mediaParcial) + (4 * afUser)) / 10;

            if (mediaFinal >= 5){
                System.out.println("Aprovado por média final");
            }

            else {
                System.out.println("Reprovado na média final");
            }
        }

        meuScanner.close();
    }
}
