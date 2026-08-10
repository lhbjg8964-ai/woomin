package a0730.student2;



public class St1Exemple {
    
    public static void main(String[] args) {
      
       Student student1 = new Student();
       Student student2 = new Student();
       Student student3 = new Student();
       //student1.name = "홍길동"; 

       student1.setName("홍길동");
       student1.setAge(20);
       student1.setMajor("전자공학");

       student2.setName("김수환");
       student2.setAge(30);
       student2.setMajor("정보처리");

       student3.setName("정점식");
       student3.setAge(22);
       student3.setMajor("영어과");

       //생성한 객체의 정보를 출력 
        System.out.println("===학생 정보===");
        System.out.println(student1.getName());    
        System.out.println(student1.getAge());    
        System.out.println(student1.getMajor());    

        System.out.println(student2.getName());    
        System.out.println(student2.getAge());    
        System.out.println(student2.getMajor());

        System.out.println(student3.getName());    
        System.out.println(student3.getAge());    
        System.out.println(student3.getMajor());    


    }

}
