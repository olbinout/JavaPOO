package Parte_3;

import java.util.Scanner;

public class cod6 {
    public static void main (String[] Args){
        Scanner meuScanner = new Scanner(System.in);

        System.out.print("Insira um valor: ");
        int valor01User = meuScanner.nextInt();
        
        System.out.print("Insira outro valor: ");
        int valor02User = meuScanner.nextInt();

        meuScanner.close();

        // Valida qual valor é menor
        int menorValor, maiorValor;
        if (valor01User < valor02User){
            menorValor = valor01User;
            maiorValor = valor02User;
        }

        else {
            menorValor = valor02User;
            maiorValor = valor01User;
        }

        for (int i = menorValor; i <= maiorValor; i++){
            System.out.print(i + " ");
        }

        System.err.println();

        for (int i = menorValor; i <= maiorValor; i++){
            int ehPrimo = 0;

            for (int j = 1; j <= i; j++){
                if (i % j == 0){
                    ehPrimo = ehPrimo + 1;
                }
            }

            if (ehPrimo == 2){
                System.out.print("X" + " ");
            }

            else {
                System.out.print(" " + " ");
            }

        }

    }
}