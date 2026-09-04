package a0825.sort.comparable1;


//Comparable<Student> - import 안해도됨
public class Student implements Comparable<Student> {
    String name;
    int age;
    int score;
    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
    }
    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
        return this.score - o.score;
        //return Integer.compare(this.score, o.score);
        //문자는 이렇게 해야함
        //  return this.name.compareTo(o.name);
    }
    
    
}
