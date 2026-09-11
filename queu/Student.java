package queu;

public class Student{

    // Atributos
    public String nome;
    public String curso;
    public int matricula;
    public float ira;
    public char sexo;

    // Construtor
    public Student(String nome, String curso, int matricula, float ira, char sexo){
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
        this.ira = ira;
        this.sexo = sexo;
    }

    // Métodos
    public void matriculado(){
        System.out.printf("O aluno %s [%c] está matriculado no SIGAA.\n", nome, sexo);
        System.out.printf("Matrícula: %d\n", matricula);
    }

    // Método que uni com o "Car.java"
    public void dirigir(Car someCar){
        System.out.println(nome+ " está dirigindo o "+ someCar.model + " " +someCar.year);
    }
}
