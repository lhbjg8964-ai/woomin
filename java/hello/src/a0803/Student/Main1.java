package a0803.Student;

public class Main1 {public static void main(String[] args) {
    

    Student[] students = new Student[5];
    // crate (더미데이터)
    students[0] = new Student ("홍길동", 90 , 80 , 70);
    students[1] = new Student ("이순신", 100 , 95 , 90);
    students[2] = new Student ("김유신", 85 , 88 , 91);
    students[3] = new Student ("강감찬", 77 , 80 , 83);
    students[4] = new Student ("신사임당", 95 , 98 , 100);
    

    // 학생 목록 read
    System.out.println("===== 학생 목록 =====");
    printStudents(students);
    
}

private static void printStudents(Student[] students) {
    System.out.println("--------------------------------------------");
    System.out.println("이름          국어 영어 수학 총점 평균");
    System.out.println("--------------------------------------------");
    for(int i =0; i < students.length; i++){
       if(students[i] !=null){
        students[i].printlninfo();
       } 
    }
}
}