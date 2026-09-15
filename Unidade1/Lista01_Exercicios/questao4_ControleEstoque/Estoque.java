package Unidade1.Lista01_Exercicios.questao4_ControleEstoque;

public class Estoque {
    private String nomeProduto;
    private int quantMinima;
    private int quantAtual;

    public Estoque (String nomeProduto, int quantMinima, int quantAtual){
        this.nomeProduto = nomeProduto;
        this.quantMinima = quantMinima;
        this.quantAtual = quantAtual;
    }

    public String getNomeProduto(){
        return this.nomeProduto;
    }

    public int getQuantMinima(){
        return this.quantMinima;
    }

    public int getQuantAtual(){
        return this.quantAtual;
    }

    public void setQuantAtual(int valor){
        this.quantAtual = valor; 
    }

    public boolean precisaReabastecer(){
        boolean reabastecimento = getQuantAtual() < getQuantMinima();
        return reabastecimento;
    }

    public void simulacao(int dias, int vendasPorDia){

        for (int i = 0; i < dias; i++){
            System.out.println("DIA: " + (i + 1) + " / Vendas por dia: " + vendasPorDia);
            setQuantAtual(getQuantAtual() - vendasPorDia);

            if(getQuantAtual() < vendasPorDia){
                break;
            }
        }
    }

    public static void main (String[] Args){
        Estoque estoque = new Estoque("Camisa", 10  , 10);

        estoque.simulacao(10, 5);
        if (estoque.precisaReabastecer() == true){
            System.out.println("Precisa reabastecer? " + estoque.precisaReabastecer());
        }

        else {
            System.out.println("Quantas " + estoque.nomeProduto + " sobraram? " + estoque.getQuantAtual());
        }
        
    }
}
