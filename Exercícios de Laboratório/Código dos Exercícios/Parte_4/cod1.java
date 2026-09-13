package Parte_4;

import java.util.Scanner;

public class cod1 {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);
        int valorUser = meuScanner.nextInt();

        System.out.print("Insira um número: ");

        meuScanner.close();

        System.out.println(isPar(valorUser));

    }

    public static boolean isPar(int numero){
        boolean isPar;
        if (numero % 2 == 0){
            isPar = true;
        }

        else {
            isPar = false;
        }

        return isPar;
    }

}
