package Unidade1.Lista01_Exercicios.questao3_ContadorSimples;

import java.util.Scanner;

public class Contador {
    private int limite;

    public Contador(int limite){
        this.limite = limite;
    }

    public int getLimite(){
        return this.limite;
    }

    public void contaAte(){
        for (int i = 1; i <= getLimite(); i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);

        System.out.print("Insira o limite: ");
        int limiteUser = meuScanner.nextInt();
        meuScanner.close();
        
        Contador contadorzinho = new Contador(limiteUser);

        contadorzinho.contaAte();
    }
}
