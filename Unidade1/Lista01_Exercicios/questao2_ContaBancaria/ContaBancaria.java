package Unidade1.Lista01_Exercicios.questao2_ContaBancaria;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria (String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular(){
        return this.titular;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void depositar(double valor){
        setSaldo(getSaldo() + valor);
    }

    public void sacar(double valor){
        if (getSaldo() >= valor){
            setSaldo(getSaldo() - valor);
        }
        else {
            System.out.println("Saldo insuficiente.");
        }
    } 

    public static void main (String[] somethingElse){
        ContaBancaria titular = new ContaBancaria("Otávio", 550);

        System.out.printf("Conta bancária atual de %s: %f", titular.titular, titular.saldo);
        titular.depositar(500);
        titular.sacar(750);
    }   

}