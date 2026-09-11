package Parte_1;

import java.util.Scanner;

public class cod2 {
    public static void main (String[] Args){
        // Instaciação do scanneador
        Scanner meuScanner = new Scanner(System.in);

        // Variável que o usuário vai pôr o número
        int numUser;

        System.out.print("Digite um número inteiro: ");
        // Scanneando o valor e pondo na variável "numUser"
        numUser = meuScanner.nextInt();

        meuScanner.close();

        System.out.println("Seu número foi: " + numUser);
        System.out.println("Seu antecessor: " + (numUser - 1));
        System.out.println("Seu sucessor: " + (numUser + 1));

        if (numUser == 6){
            System.out.println("Aí é muito fácil!");
        }

    }
}
