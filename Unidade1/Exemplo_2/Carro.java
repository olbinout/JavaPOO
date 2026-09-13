package Unidade1.Exemplo_2;

public class Carro {
    String marca;
    String modelo;
    String cor;
    int velocidade = 0;

    void ligar(){
        System.out.println("O " + modelo + " está ligado!");
    }

    void acelerar(int valor){
        velocidade = velocidade + valor;
        System.out.print(marca + " " + modelo + " " + cor + " acelerou! " );
        System.out.println("Sua velocidade atual é de " + velocidade + "Km/h");
    }
}
