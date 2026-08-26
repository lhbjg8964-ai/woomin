package a0825.sort.sk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorPractice {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student("홍길동", 20, 85));
        list.add(new Student("김철수", 22, 92));
        list.add(new Student("이영희", 21, 78)); 
        list.add(new Student("박민수", 19, 92));


        // ① 이름 오름차순
        System.out.println("=== 이름 오름차순 ===");

        Collections.sort(list, new Comparator<Student>() {

            @Override
            public int compare(Student a, Student b) {
                return a.getName().compareTo(b.getName());
            }
        });

        print(list);


        // ② 나이 오름차순
        System.out.println("\n=== 나이 오름차순 (람다) ===");

        Collections.sort(list, (a, b) -> a.getAge() - b.getAge());

        print(list);


        // ③ 점수 내림차순
        System.out.println("\n=== 점수 내림차순 (람다) ===");

        Collections.sort(list, (a, b) -> b.getScore() - a.getScore());

        print(list);


        // ④ 점수 내림차순, 점수가 같으면 이름 오름차순
        System.out.println("\n=== 점수 내림차순, 같으면 이름순 ===");

        Collections.sort(list, (a, b) -> {

            // 점수가 같으면 이름 오름차순
            if (a.getScore() == b.getScore()) {
                return a.getName().compareTo(b.getName());
            }

            // 점수가 다르면 점수 내림차순
            return b.getScore() - a.getScore();
        });

        print(list);
    }


    // 학생 목록 출력
    public static void print(List<Student> list) {

        for (Student s : list) {
            System.out.println(s);
        }
    }
}