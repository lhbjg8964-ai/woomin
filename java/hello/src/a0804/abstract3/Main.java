package a0804.abstract3;

abstract class Animal {

    String name;

    // 생성자
    Animal(String name) {
        this.name = name;
    }

    // 일반 메서드
    void introduce() {
        System.out.println("이름은 " + name + "입니다.");
    }

    // 추상 메서드
    abstract void sound();
}


// Animal을 상속받는 Dog 클래스
class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    // 추상 메서드는 반드시 구현
    @Override
    void sound() {
        System.out.println("멍멍!");
    }
}


// Animal을 상속받는 Cat 클래스
class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println("야옹!");
    }
}


public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("뽀삐");
        Cat cat = new Cat("나비");

        dog.introduce();
        dog.sound();

        cat.introduce();
        cat.sound();
    }
}