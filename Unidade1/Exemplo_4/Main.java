package Unidade1.Exemplo_4;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Fiat", "Argo", "Preto");   

        // Como o atributo "velocidade" da classe "Carro" está "private", então só pode mudar ele se usarmos o método "setVelocidade".
        meuCarro.setVelocidade(5);

        meuCarro.ligar();
        meuCarro.acelerar(10);

    }
    
}
