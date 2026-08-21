package a0820;

public class Singleton {
        // 객체를 하나만 생성
    private static Singleton instance = new Singleton();
    //static - 클래스 메모리올라갈때 객체 하나 생성 프로그램 종료시까지 유지


    // 생성자를 private으로 막음
    private Singleton() {
        System.out.println("객체 생성");
    }

    // 객체 반환
    public static Singleton getInstance() {
        return instance;
    }

    public void print() {
        System.out.println("안녕하세요");
    }
}
