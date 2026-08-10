package a0730.student1;

public class Student {
    //public 누구나 접근이 가능 - 패키지 (폴더가 달라도 접근가능
    //default 에는 같은 폴더만 접근 가능)
    public String name; //이름
    public int age; //나이
    public String major; //전공
    public Student() {
    } //생성자를 병행해서 쓰려면 기본생성자도 만들어 줘야함
    //생성자 - 생성메서드
    //클래스이름 == 생성자이름이 같다.
    //반환형이 없다. (void)

    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }
    // public Student(String n, int a, String m) {
    //     name = n;
    //     age = a;
    //     major = m;
    // }
    //정보 출력 메서드 
    public void displayInfo() {
       System.out.println("학생 이름 : "+ name);
       System.out.println("나이: " +age+"세");
       System.out.println("전공: " +major);
       System.out.println();
    }
  
    


}
