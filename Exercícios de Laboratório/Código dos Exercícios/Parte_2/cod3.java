package Parte_2;

import java.util.Scanner;

public class cod3 {
    public static void main (String[] Args){
        Scanner meuScanner = new Scanner(System.in);

        System.out.print("Insira um valor: ");
        int valor1 = meuScanner.nextInt();

        System.out.print("Insira outro valor: ");
        int valor2 = meuScanner.nextInt();

        System.out.println("Selecione o tipo de operação: ");
        System.out.println("[+] Adição");
        System.out.println("[-] Subtração");
        System.out.println("[*] Multiplicação");
        System.out.println("[/] Divisão");

        System.out.print("Insira: ");
        char opcaoUser = meuScanner.next().charAt(0);

        meuScanner.close();

        switch (opcaoUser){
            case '+': {
                System.out.println("Resultado: " + (valor1 + valor2));
                if ((valor1 + valor2) < 0){
                    System.out.println("Número negativo");
                }

                else if ((valor1 + valor2) > 0){
                    System.out.println("Número positivo");
                }

                else {
                    System.out.println("Número neutro");
                }
                
                break;
            }

            case '-': {
                System.out.println("Resultado: " + (valor1 - valor2));
                if ((valor1 - valor2) < 0){
                    System.out.println("Número negativo");
                }

                else if ((valor1 - valor2) > 0){
                    System.out.println("Número positivo");
                }

                else {
                    System.out.println("Número neutro");
                }

                break;
            }

            case '*': {
                System.out.println("Resultado: " + (valor1 * valor2));
                if ((valor1 * valor2) < 0){
                    System.out.println("Número negativo");
                }

                else if ((valor1 * valor2) > 0){
                    System.out.println("Número positivo");
                }

                else {
                    System.out.println("Número neutro");
                }          
                
                break;
            }

            case '/': {
                if (valor2 != 0){
                    if (valor1 % valor2 == 0){
                        System.out.println("Resultado: " + (valor1 / valor2));

                        if ((valor1 / valor2) < 0){
                            System.out.println("Número negativo");
                        }

                        else if ((valor1 / valor2) > 0){
                            System.out.println("Número positivo");
                        }

                        else {
                            System.out.println("Número neutro");
                        }   
                    }   

                    else {
                        System.out.println("Não é divisível");
                    }

                }

                else {
                    System.out.println("O denominador é 0");
                }

                break;
            }

        }
    }
}
