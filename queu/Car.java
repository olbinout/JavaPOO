package queu;

// Class is like a "blueprint"
public class Car{
    // Atributos 
    public String model;
    public String color;
    public int year;

    // Constructor
    public Car (String model, String color, int year){
        this.model = model;
        this.color = color;
        this.year = year;
    }

    // Método
    public void accelerate(){
        System.out.printf("The %s car is accelerating!\n", model);
    }
    
}
