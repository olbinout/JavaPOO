package Unidade1.Exemplo_6;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Fiat", "Argo", "Preto");   
        Motorista piloto = new Motorista("Otávio", meuCarro);

        piloto.ligarCarro();

        // Como o atributo "velocidade" da classe "Carro" está "private", então só pode mudar ele se usarmos o método "setVelocidade".
        meuCarro.setVelocidade(5);

        piloto.acelerarCarro(10);


        // Percebe-se agora que o piloto é quem realiza os métodos para acelerar o carro.
    }
    
}
