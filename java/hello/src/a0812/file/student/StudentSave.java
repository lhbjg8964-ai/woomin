package a0812.file.student;

import java.io.File;
import java.io.FileWriter;

public class StudentSave {
    public static void main(String[] args) {
        Student[] student = {
                new Student("홍길동",20,"컴퓨터공학"), // student 객체생성
                 new Student("김철수",21,"전자"),
                  new Student("이영희",22,"AI"),
        };
        File folder = new File("C:/abcdf"); // 폴더 객체를 만듦 - 실제 폴더를 만든것이 아님

        if(!folder.exists()){
            folder.mkdir(); //폴더 없으면 폴더 생성
        }

        File file = new File("C:/abcdf/student.txt");

        try { // 권한 없음 , 디스크 오류, 정보 오류시 예외발생
            FileWriter fw = new FileWriter(file); // student.txt 생성
            for (Student s : student) {
                fw.write("===== 학생 정보 =====\n");
                fw.write("이름 : " + s.getName() + "\n");
                fw.write("나이 : " + s.getAge() + "\n");
                fw.write("전공 : " + s.getMajor() + "\n");
            }
            fw.close();

            System.out.println("학생 정보 저장 완료");

        } catch (Exception e) {
             System.out.println("저장 실패");
        }
    }
}

// Simple Student class to resolve type when external class is missing
class Student {
    private String name;
    private int age;
    private String major;

    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getMajor() { return major; }
}
