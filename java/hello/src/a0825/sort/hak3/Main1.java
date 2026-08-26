package a0825.sort.hak3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
      

  // ===== 더미 데이터 =====
        students.add(new Student("홍길동", 20, 2023001));
        students.add(new Student("김철수", 22, 2023002));
        students.add(new Student("이영희", 21, 2023003));
        students.add(new Student("박민수", 23, 2023004));
        students.add(new Student("최지훈", 19, 2023005));
        students.add(new Student("강다은", 20, 2023006));
        // ======================

        //정렬옵션선택
        System.out.println("정렬 기준을 선택하세요");
        System.out.println("1. 이름");
        System.out.println("2. 나이");
        System.out.println("3. 학번");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                //이름으로 정렬
                Collection.sort(students, new NameComparator());
                break;
            case 2:
                
                Collection.sort(students, new AgeComparator());
                break;
            case 3:
                
                Collection.sort(students, new IdComparator());
                break;
        
            default:
                break;
        }
        // 정렬된 결과 출력
        System.out.println("정렬된 학생 목록:");
        for (Student student : students){
            System.out.println(student);
        }
        sc.close();
    }
    
}

class Student{
    private String name;
    private int age;
    private int studentId;
    
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", studentId=" + studentId + "]";
    }

    public Student(String name, int age, int studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
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

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

}
