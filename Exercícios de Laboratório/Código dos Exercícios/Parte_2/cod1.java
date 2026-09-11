package Parte_2;

import java.util.Scanner;

public class cod1 {
    public static void main (String[] Args){
        Scanner meuScanner = new Scanner(System.in);

        int valorUser;

        System.out.print("Insira um valor inteiro qualquer: ");
        valorUser = meuScanner.nextInt();

        meuScanner.close();

        System.out.println("O valor inserido foi: " + valorUser);

        if (0 < valorUser){
            System.out.println("O valor inserido é positivo.");
        }

        else if (valorUser < 0){
            System.out.println("O valor inserido é negativo.");
        }

        else {
            System.out.println("O valor inserido é neutro.");
        }

    }
}
