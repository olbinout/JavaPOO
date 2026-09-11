package Parte_1;

import java.util.Scanner;

public class cod5 {
    public static void main (String[] Args){
        Scanner meuScanner = new Scanner(System.in);
        double pesoKg;
        double alturaMetros;

        System.out.println(" ** ÍNDICE DE MASSA CORPORAL (IMC) **");

        System.out.print("Insira seu peso (em Kg): ");
        pesoKg = meuScanner.nextDouble();

        System.out.print("Insira sua altura (em metros): ");
        alturaMetros = meuScanner.nextDouble();

        meuScanner.close();

        double imc = pesoKg / Math.pow(alturaMetros, 2);

        System.out.println("Peso em Kg: " + pesoKg);
        System.out.println("Altura em metros: " + alturaMetros);
        System.out.println("IMC: " + imc);

    }
}
