package Inheritance;

public class Electronics {

String model;
String color;
String manufacture;
String typeofElectronics;

public Electronics(String model,String color,String manufacture,String typeofElectronics){
    this.model = model;
    this.color = color;
    this.manufacture = manufacture;
    this.typeofElectronics = typeofElectronics;
}

public void TurnOn(){ System.out.println( "TurnOn....... " ); }

public void Turnoff(){ System.out.println("Turnoff........"); }

public void Connect(){ System.out.println("Connect.........");}

public void scrollUp(){ System.out.println("ScrolledUp");}

public void scrollDown(){ System.out.println("ScrolledDown");}




}
