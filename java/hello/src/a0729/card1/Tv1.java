package a0729.card1;

public class Tv1 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        t1.channel = 7;
        t1.volume = 15;

        Tv t2 = new Tv();
        t2.channel = 20;
        t2.volume = 20;

        System.out.println("회사 : " + Tv.brand);
        System.out.println("크기 : " + Tv.inch + "인치");
        System.out.println("채널 : " + t1.channel);
        System.out.println("볼륨 : " + t1.volume);

        System.out.println("\n-------------------------------------");

        System.out.println("회사 : " + Tv.brand);
        System.out.println("크기 : " + Tv.inch + "인치");
        System.out.println("채널 : " + t2.channel);
        System.out.println("볼륨 : " + t2.volume);
    }
    
}
