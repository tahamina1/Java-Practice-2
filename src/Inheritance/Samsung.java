package Inheritance;

public class Samsung extends Computer {
    public Samsung(String model, String color) {
        super(model, color,"Samsung");
    }

    @Override
    public void TurnOn() {
        System.out.println("Turn on firefox");
    }

    @Override
    public void Turnoff() {
        System.out.println("Turn off firefox");
    }
}
