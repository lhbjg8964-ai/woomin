package a0730.member2;

public class MemberTest {
    public static void main(String[] args) {
         // 회원 객체 3개 생성
        Member m1 = new Member();
        Member m2 = new Member();
        Member m3 = new Member();

        // Setter로 데이터 입력
        m1.setName("홍길동");
        m1.setAge(25);
        m1.setEmail("hong@test.com");

        m2.setName("김철수");
        m2.setAge(30);
        m2.setEmail("kim@test.com");

        m3.setName("이영희");
        m3.setAge(22);
        m3.setEmail("lee@test.com");


      // Getter로 데이터 출력
        System.out.println("이름 : " + m1.getName());
        System.out.println("나이 : " + m1.getAge());
        System.out.println("이메일 : " + m1.getEmail());

        System.out.println();

        System.out.println("이름 : " + m2.getName());
        System.out.println("나이 : " + m2.getAge());
        System.out.println("이메일 : " + m2.getEmail());

        System.out.println();

        System.out.println("이름 : " + m3.getName());
        System.out.println("나이 : " + m3.getAge());
        System.out.println("이메일 : " + m3.getEmail());

    }
}
