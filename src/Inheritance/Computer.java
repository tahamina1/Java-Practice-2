package Inheritance;

public class Computer extends Electronics{

    public Computer(String model, String color, String manufacture) {
        super(model, color, manufacture, "Computer");
    }

    public void startMSword(){
        System.out.println("Turning MSword on..........");
    }

    public void turnMSwordoff (){
        System.out.println("Turn off MSword............");

    }





}
