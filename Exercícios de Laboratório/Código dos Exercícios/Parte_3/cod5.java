package Parte_3;

import java.util.Scanner;

public class cod5 {
    public static void main (String[] Args){
        Scanner meuScanner = new Scanner(System.in);

        System.out.print("Insira um número para descobrir seu fatorial: ");
        int numeroUser = meuScanner.nextInt();

        meuScanner.close();

        int fatorial = 1; 

        if (numeroUser > 0){
            for (int i = numeroUser; i > 0; i--){
                fatorial = fatorial * i;
            }
        }

        else {
            System.out.println("Não existe fatorial de número negativo");
        }

        System.out.println("O fatorial de " + numeroUser + " é: " + fatorial);
    }
}
