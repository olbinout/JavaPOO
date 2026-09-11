package Parte_1;

import java.util.Scanner;

public class cod4 {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);
        String nomeUser;
        int idadeUser;
    
        System.out.print("Insira sua idade: ");
        idadeUser = meuScanner.nextInt();

        // Como o método "nextInt()" deixa o "\n" no buffer, se não tiver um "nextLine()" em seguida do "nexInt()", o sistema não vai ler o nome do usuário. Por isso, deve-se colocar.

        // Só pra limpar o buffer.
        meuScanner.nextLine();

        System.out.println("Insira seu nome completo abaixo: ");
        nomeUser = meuScanner.nextLine();

        // O método ".next()" só serve quando o usuário não colocar nomes com espaço.
        // O método ".nextLine()" lê a linha inteira.

        meuScanner.close();
        // Após fechar um Scanner, ele ficará eternamente fechado

        System.out.println("Bem-vindo, " + nomeUser + ". Você tem " + idadeUser + " anos");
    
    }
}
