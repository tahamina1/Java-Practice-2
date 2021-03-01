package Inheritance;

public class TestInheritance {

    public static void main(String[] args){

        Samsung samsung = new Samsung("Galaxy Book S","Black");

        System.out.println(samsung.typeofElectronics);
        System.out.println(samsung.manufacture);
        System.out.println(samsung.model);
        samsung.TurnOn();
        samsung.Turnoff();
        samsung.turnMSwordoff();


    }



}
