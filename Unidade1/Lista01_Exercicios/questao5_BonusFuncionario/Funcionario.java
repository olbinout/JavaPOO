package Unidade1.Lista01_Exercicios.questao5_BonusFuncionario;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario (String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome(){
        return this.nome;
    }

    public double getSalario(){
        return this.salario;
    }

    public void calcularBonus(){
        double bonus = 0;

        if (getSalario() < 1000){
            bonus = getSalario() * 0.1;
        }

        else if (1000 <= getSalario() && getSalario() <= 3000){
            bonus = getSalario() * 0.05;
        }

        else if (getSalario() > 3000){
            bonus = getSalario() * 0.02;
        }

        System.out.println("Valor do bônus: $" + bonus);
    }

    public static void main (String[] Args){
        Funcionario funcionario = new Funcionario("Otávio", 1500);

        System.out.println("Seu salário: $" + funcionario.salario);
        funcionario.calcularBonus();
    }
}
