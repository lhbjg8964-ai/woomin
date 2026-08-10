package a0804.Interface2;

public class Tv implements RemoteControl {

    @Override
    public void powerOn() {
      System.out.println("TV 전원 ON");
    }

    @Override
    public void powerOff() {
        System.out.println("TV 전원 OFF");
    }
    
}
