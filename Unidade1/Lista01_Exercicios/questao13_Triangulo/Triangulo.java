package Unidade1.Lista01_Exercicios.questao13_Triangulo;

public class Triangulo {
    private int ladoA, ladoB, ladoC;

    public Triangulo(int ladoA, int ladoB, int ladoC){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public int getLadoA() {
        return ladoA;
    }

    public int getLadoB() {
        return ladoB;
    } 

    public int getLadoC() {
        return ladoC;
    }

    public String classificar(){
        if (getLadoA() == getLadoB() && getLadoB() == getLadoC() && getLadoA() == getLadoC()){
            return "Equilátero";
        }

        else if (getLadoA() == getLadoB() || getLadoA() == getLadoC() || getLadoC() == getLadoB()){
            return "Isósceles";
        }

        else {
            return "Escaleno";
        }

    }

    public static void main (String[] Args){
        Triangulo esteTriangulo = new Triangulo(1, 2, 3);

        System.out.println(esteTriangulo.classificar());;
    }
}   
