package a0825.sort.sk;

public class Student implements Comparable<Student>{
    String Name;
    int Age;
    int Score;
    public Student(String name, int age, int score) {
        this.Name = name;
        this.Age = age;
        this.Score = score;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
    }
    @Override
    public int compareTo(Student o) {
        return this.score-o.score;
    }
    
}
