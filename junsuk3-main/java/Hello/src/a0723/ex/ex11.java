package a0723.ex;

public class ex11 {
    public static void main(String[] args) {
        //3670 시간 분 초 나타내시오
        int second = 3670;
        int hour = second / 3600;
        int minute = (second % 3600) / 60;
        int sec = second % 60;

        System.out.println(hour + "시간");
        System.out.println(minute + "분");
        System.out.println(sec + "초");
        System.out.println(hour + "시간" + minute + "분" + sec + "초");
        
        
    }
}
