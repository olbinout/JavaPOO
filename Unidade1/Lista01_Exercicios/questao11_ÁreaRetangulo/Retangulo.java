package Unidade1.Lista01_Exercicios.questao11_ÁreaRetangulo;

public class Retangulo {
    private double largura, altura;

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }
    
    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public double calcularArea(){
        return (getAltura() * getLargura());
    }

    public static void main(String[] args) {
        Retangulo meuRetangulo = new Retangulo(6, 7);

        System.out.println("Área: " + meuRetangulo.calcularArea());
        
    }
}
