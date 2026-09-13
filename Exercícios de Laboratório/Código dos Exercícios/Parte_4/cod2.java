package Parte_4;

import java.util.Scanner;

public class cod2 {
    public static void main (String[] Args){
        Scanner meuScanner = new Scanner(System.in);
        
        System.out.print("Insira um valor: ");
        int valorUser = meuScanner.nextInt();

        meuScanner.close();

        verificarMultiploDeCinco(valorUser);

    }

    public static void verificarMultiploDeCinco (int numero){
        if (numero % 5 == 0){
            System.out.println(numero + " é multiplo de cinco");
        }
    }

}
