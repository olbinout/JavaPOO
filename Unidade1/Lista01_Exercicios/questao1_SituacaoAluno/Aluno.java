package Unidade1.Lista01_Exercicios.questao1_SituacaoAluno;

public class Aluno {
    private double nota1;
    private double nota2;
    private double frequencia;

    public Aluno(int nota1, int nota2, double frequencia){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.frequencia = frequencia;
    }

    public double getNota1(){
        return this.nota1;
    }

    public double getNota2(){
        return this.nota2;
    }

    public double getFrequencia(){
        return frequencia;
    }

    public void situacao(){
        double media = (getNota1() + getNota2()) / 2;
        
        boolean mediaAceita = (media >= 7);
        boolean frequenciaAceita = (getFrequencia() >= 0.75);

        if (mediaAceita && frequenciaAceita){
            System.out.println("Aprovado");
        }

        else if (mediaAceita && !frequenciaAceita){
            System.out.println("Reprovado por falta");
        }

        else if (!mediaAceita && frequenciaAceita){
            System.out.println("Reprovado por média");
        }

        else{
            System.out.println("Reprovado por média e por falta");
        }
    }

    public static void main (String[] Args){
        Aluno otavio = new Aluno(8, 8, 0.75);

        otavio.situacao();
    }
}
