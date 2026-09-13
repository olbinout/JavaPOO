package Unidade1.Exemplo_4;

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private int velocidade;

    public Carro (String marcaEscolhida, String modeloEscolhido, String corEscolhida){
        marca = marcaEscolhida;
        modelo = modeloEscolhido;
        cor = corEscolhida;

        velocidade = 0;

        System.out.println("Um carro da marca " + marca + " acabou de ser fabricado!");

    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public String getCor(){
        return cor;
    }

    public int getVelocidade(){
        return velocidade;
    }

    public void setVelocidade(int velocidadeUser){
        if (velocidadeUser >= 0){
            velocidade = velocidadeUser;
        }
        else {
            System.out.println("Erro!!!");
            System.out.println("Não é aceito velocidade negativa.");
        }
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
