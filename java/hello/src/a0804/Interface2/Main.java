package a0804.Interface2;

public class Main {
    public static void main(String[] args) {
        RemoteControl tv = new AirConditioner();
        RemoteControl air = new AirConditioner();

        tv.powerOn();
        air.powerOn();
    }
}
