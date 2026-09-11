package queu;

public class Main{
    public static void main (String[] anythingHere){
        // Instanciação da classe Car, este objeto é chamado "carOne"
        Car carOne = new Car ("Argo", "Black", 2018);

        System.out.println("Model: "+ carOne.model);
        System.out.println("Color: "+ carOne.color);
        System.out.println("Year: "+ carOne.year);

        carOne.accelerate();

        // Instanciação da classe Student, este objeto é chamado "aluno1"
        Student aluno1 = new Student("Otávio", "BTI", 2025010168, 8.9F, 'M');
        aluno1.matriculado();
        aluno1.dirigir(carOne);
    }
}
