package Parte_1;

import java.util.Scanner;

public class cod3 {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in); 
        double celsius;

        System.out.print("Quantos graus celsius fazem? ");
        celsius = meuScanner.nextDouble();
        meuScanner.close();

        System.out.println("Está fazendo " + ((celsius * 1.8) + 32) + " graus Fahrenheit");

    }
}
