package Parte_3;

import java.util.Scanner;

public class cod4 {
    public static void main (String[] Args){
        double [][] alunos = new double[10][3]; 

        Scanner meuScanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            System.out.println("Notas do " + (i+1) +"* Aluno: ");
            for (int j = 0; j < 3; j++){
                System.out.print("Nota " + (j+1) +"* ");
                alunos[i][j] = meuScanner.nextDouble();
            }
        }

        for (int i = 0; i < 10; i++){
            System.out.print("Média do " + (i+1) + "* aluno: ");

            double soma = 0;

            for (int j = 0; j < 3; j++){
                soma = soma + alunos[i][j];
            }

            System.out.println(soma / 3);
        }

        meuScanner.close();
    }
}
