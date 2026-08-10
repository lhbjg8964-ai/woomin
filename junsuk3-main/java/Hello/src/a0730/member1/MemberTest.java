package a0730.member1;

public class MemberTest {
    public static void main(String[] args) {
         // 회원 객체 3개 생성
        Member m1 = new Member("홍길동", 25, "hong@test.com");
        Member m2 = new Member("김철수", 30, "kim@test.com");
        Member m3 = new Member("이영희", 22, "lee@test.com");

        m1.showInfo();
       System.out.println();

        m2.showInfo();
        System.out.println();

        m3.showInfo();
    }
}
