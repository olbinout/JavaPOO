package Parte_4;

import java.util.Scanner;

public class cod3 {
    public static void main (String[] Args){
        Scanner meuScanner = new Scanner(System.in);
        double comprimento, altura, largura;

        System.out.print("Insira o comprimento: ");
        comprimento = meuScanner.nextDouble();

        System.out.print("Insira o altura: ");
        altura = meuScanner.nextDouble();

        System.out.print("Insira o largura: ");
        largura = meuScanner.nextDouble();

        meuScanner.close();

        System.out.println("O volume é: " + calcularVolume(comprimento, altura, largura) + "m³");
    }

    public static double calcularVolume(double comprimento, double altura, double largura){
        return comprimento * altura * largura;
    }
}
