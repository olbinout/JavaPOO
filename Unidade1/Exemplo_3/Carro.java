package Unidade1.Exemplo_3;

public class Carro {
    String marca;
    String modelo;
    String cor;
    int velocidade;

    public Carro (String marcaEscolhida, String modeloEscolhido, String corEscolhida){
        marca = marcaEscolhida;
        modelo = modeloEscolhido;
        cor = corEscolhida;

        velocidade = 0;

        System.out.println("Um carro da marca " + marca + " acabou de ser fabricado!");
    }

    void ligar(){
        System.out.println("O " + modelo + " está ligado!");
    }

    void acelerar(int valor){
        velocidade = velocidade + valor;
        System.out.print(marca + " " + modelo + " " + cor + " acelerou! " );
        System.out.println("Sua velocidade atual é de " + velocidade + "Km/h");
    }
}
