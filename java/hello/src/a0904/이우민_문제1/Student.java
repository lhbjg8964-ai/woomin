package a0904.이우민_문제1;

public class Student {
    private String name;
    private int age;
    public Student(String name, int age) {
        this.name = name; // 학생 이름
        this.age = age; // 학생 나이
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
   @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}
