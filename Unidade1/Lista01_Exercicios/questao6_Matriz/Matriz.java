package Unidade1.Lista01_Exercicios.questao6_Matriz;

import java.util.Scanner;

public class Matriz {
    private int[][] valores;

    public Matriz(int[][] valores){
        this.valores = valores;
    }

    public int[][] getValores(){
        return this.valores;
    }

    public void imprimir(){
        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(getValores()[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main (String[] Args){
        Scanner meuScanner = new Scanner(System.in);
        int[][] dados = new int[3][3]; 

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.printf("Linha %d Coluna %d: ", i , j);
                dados[i][j] = meuScanner.nextInt();
            }
        }

        Matriz minhaMatriz = new Matriz(dados);

        minhaMatriz.imprimir();

        meuScanner.close();
    }

}
