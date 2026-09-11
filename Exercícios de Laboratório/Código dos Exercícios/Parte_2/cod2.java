package Parte_2;

import java.util.Scanner;

public class cod2 {
    public static void main (String[] Args){
        Scanner meuScanner = new Scanner(System.in);

        int numerador;
        int denominador;

        System.out.print("Numerador: ");
        numerador = meuScanner.nextInt();

        System.out.print("Denominador: ");
        denominador = meuScanner.nextInt();

        meuScanner.close();

        if (denominador != 0){ 
            if (numerador % denominador == 0){
                System.out.println("O " + numerador + " é divisível por " + denominador);
            }

            else {
                System.out.println("O " + numerador + " não é divisível por " + denominador);
            }
        }

        else {
            System.out.println("O denominador é igual a 0");
        }
    }
}
