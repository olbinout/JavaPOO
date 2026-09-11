package Parte_3;

import java.util.Scanner;

public class cod3 {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            System.out.print("Qual a sua idade? ");
            int idadeUser = meuScanner.nextInt();

            if (idadeUser < 18){
                System.out.println("Menor de idade");
            }

            else {
                System.out.println("Maior de idade");
            }
        }

        meuScanner.close();

        System.out.println("Cabô");
    }
}
