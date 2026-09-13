package Unidade1.Exemplo_2;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();   
        
        meuCarro.marca = "Fiat";
        meuCarro.modelo = "Argo";
        meuCarro.cor = "Preto";
        meuCarro.velocidade = 0;

        meuCarro.ligar();
        meuCarro.acelerar(10);

    }
    
}
