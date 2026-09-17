package Unidade1.Lista01_Exercicios.questao8_NumeroPrimo;

import java.util.Scanner;

public class NumeroPrimo {
    private int numero;

    public NumeroPrimo(int numero){
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public boolean verificarPrimo(){

        boolean isPrimo = true;

        for (int i = 2; i < getNumero(); i++){
            if (getNumero() % i == 0){

                isPrimo = false;
            }   
        }

        return isPrimo;
    }

    public static void main (String[] Args){
        Scanner meuScanner = new Scanner(System.in);    

        System.out.print("Insira um valor: ");
        NumeroPrimo meuPrimo = new NumeroPrimo(meuScanner.nextInt());
        meuScanner.close();

        System.out.printf("O número %d é primo? %b\n", meuPrimo.numero, meuPrimo.verificarPrimo());

    }

}
