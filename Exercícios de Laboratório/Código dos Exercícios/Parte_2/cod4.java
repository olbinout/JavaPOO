package Parte_2;

import java.util.Scanner;

public class cod4 {
    public static void main (String[] Args){
        System.out.println("******* LANCHONETE COMA BEM ********");
        System.out.println("| CÓDIGO |     LANCHE    |  VALOR  |");
        System.out.println("|  100   |CACHORRO QUENTE| R$10.00 |");
        System.out.println("|  101   |      BAURU    | R$12.00 |");
        System.out.println("|  104   |  REFRIGERANTE | R$5.00  |");
        System.out.println("************************************");

        Scanner meuScanner = new Scanner(System.in);

        int opcao;
        double total = 0;

        do {
            System.out.println("[1] Adicionar um ítem");
            System.out.println("[2] Fechar pedido");

            opcao = meuScanner.nextInt();

            switch (opcao) {
                case 1: {
                    System.out.print("Insira o código referente ao lanche que deseja: ");
                    int codigoLanche = meuScanner.nextInt();

                    switch (codigoLanche) {
                        case 100:
                            System.out.print("Insira a quantidade: ");
                            int quantidadeHotDog = meuScanner.nextInt();
                            System.out.println(quantidadeHotDog +" cachorro quente adicionado ao pedido!");              
                            total = total + (quantidadeHotDog * 10);              
                            break;
                    
                        case 101:
                            System.out.print("Insira a quantidade: ");
                            int quantidadeBauru = meuScanner.nextInt();
                            System.out.println(quantidadeBauru +" bauru adicionado ao pedido!");
                            total = total + (quantidadeBauru * 12);                         
                            break;

                        case 104:
                            System.out.print("Insira a quantidade: ");
                            int quantidadeRefri = meuScanner.nextInt();
                            System.out.println(quantidadeRefri +" refrigerante adicionado ao pedido!");
                            total = total + (quantidadeRefri * 5);

                            break;

                        default:
                            System.out.println("Este código não existe!");
                            break;
                    }

                    System.out.println("Total do pedido: R$" + total);
                    break;
                }
                
            }

        } while (opcao != 2);

        System.out.println("Seu pedido foi finalizado!");

        meuScanner.close();

    }
}
