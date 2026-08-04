package a0804.Interface2;

public class Main {
    public static void main(String[] args) {
        RemoteControl tv = new Tv();
        RemoteControl air = new AirConditionar();

        tv.powerOn();
        air.powerOn();
    }
    
}
