package Unidade1.Exemplo_6;

public class Motorista {
    private String nomeMotorista;
    private Carro carroMotorista;

    public Motorista (String nome, Carro carro){
        this.nomeMotorista = nome;
        this.carroMotorista = carro;

    }

    public String getNomeMotorista(){
        return this.nomeMotorista;
    }

    public void viajar (){

        // Mostra o nome do motorista e em qual carro ele entrou (Classe Motorita + Classe Carro)
        System.out.println(this.nomeMotorista + " entrou no " + this.carroMotorista.getMarca() + " " + this.carroMotorista.getModelo() + " " + this.carroMotorista.getCor());

        this.carroMotorista.ligar(this.nomeMotorista);
    }

    public void acelerarCarro(int valorDaAcelerada){
        this.carroMotorista.acelerar(valorDaAcelerada);
    }

    public void ligarCarro(){
        this.carroMotorista.ligar(nomeMotorista);
    }
}
