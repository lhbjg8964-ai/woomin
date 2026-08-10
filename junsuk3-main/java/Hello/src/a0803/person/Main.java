package a0803.person;

public class Main extends Object {
    public static void main(String[] args) {
        Person p1 = new Person("홍길동", 20);
        Person p2 = new Person("이순신", 45);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p2.getName());
        System.out.println(p2.getAge());
        System.out.println(p1);
        System.out.println(p2.toString());


    }
}
