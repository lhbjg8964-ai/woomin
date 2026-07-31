package a0731;

//객체간의 상호 작용
public class Avenger2 {
    public static void main(String[] args) {
        Avenger thor = new Avenger("토르", 100);
        Avenger thanos = new Avenger("타노스", 150);
        thor.punch(thanos);
        thanos.punch(thor);

    }
}