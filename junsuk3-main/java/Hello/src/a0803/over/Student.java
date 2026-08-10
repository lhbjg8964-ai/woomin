package a0803.over;

class Student {
     String name;
    int age;

    // 기본 생성자
    public Student() {
        System.out.println("기본 생성자");
    }

    // 생성자 1
    public Student(String name) {
        this.name = name;
    }

    // 생성자 2
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
