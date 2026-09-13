package Unidade1.Exemplo_5;

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private int velocidade;

    public Carro (String marca, String modelo, String cor){

        // Ao usar o "this" o código fica mais limpo porque não é mais necessários que os parâmetros sejam "marcaEscolhida", "modeloEscolhido". Além de ser um padrão que deve ser seguido. 

        // O "this" se refere a marca DESTA classe, o modelo DESTA classe.

        // Por exemplo: 
        this.marca = marca; // O atributo "marca" DESTA classe "Carro" recebe o a marca que você me passou. 

        this.modelo = modelo;
        this.cor = cor;

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

    public void setVelocidade(int velocidade){
        if (velocidade >= 0){
            this.velocidade = velocidade;
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
