package Unidade1.Lista01_Exercicios.questao7_CalculadoraMenuInterativo;

import java.util.Scanner;

public class MenuInterativo {
    private double numero1, numero2;

    public double getNumero1(){
        return this.numero1;
    }

    public double getNumero2(){
        return this.numero2;
    }

    public void setNumero1(double valor){
        this.numero1 = valor;
    }

    public void setNumero2(double valor){
        this.numero2 = valor;
    }

    public double somar(){
        return (getNumero1() + getNumero2());
    }

    public double subtrair(){
        return (getNumero1() - getNumero2());
    }

    public double multiplicar(){
        return (getNumero1() * getNumero2());
    }

    public double divisao(){
        if (getNumero2() == 0){
            System.out.println("O denominador não pode ser igual a 0");
            return 0;
        }

        return (getNumero1() + getNumero2());
    }

    public static void main (String[] Args){

        Scanner meuScanner = new Scanner(System.in);
        MenuInterativo menuzin = new MenuInterativo();

        int opcao;

        do {
            System.out.println("[1] add");
            System.out.println("[2] sub");
            System.out.println("[3] mult");
            System.out.println("[4] div");
            System.out.print("Escolha uma opção: ");
            opcao = meuScanner.nextInt();

            if (opcao >= 1 && opcao <= 4){
                System.out.print("Digite o numerador: ");
                menuzin.setNumero1(meuScanner.nextDouble());

                System.out.print("Digite o denominador: ");
                menuzin.setNumero2(meuScanner.nextDouble());

                System.out.print("Resultado: ");
                switch (opcao) {
                    
                    case 1:
                        System.out.println(menuzin.somar());
                        break;

                    case 2:
                        System.out.println(menuzin.subtrair());
                        break;

                    case 3:
                        System.out.println(menuzin.multiplicar());
                        break;

                    case 4:
                        System.out.println(menuzin.divisao());
                        break;
                }
                
            }

            else if (opcao != 0){
                System.out.println("Não existe essa opção.");
            }
        
        } while (opcao != 0);

        meuScanner.close();

    }
}

