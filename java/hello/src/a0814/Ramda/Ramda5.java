package a0814.Ramda;

import java.util.Arrays;
import java.util.List;

public class Ramda5 {
    public static void main(String[] args) {
        List<String> names1 = Arrays.asList("apple", "banana", "orange");
        System.out.println(names1);
        names1.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println("내림차순 : " + names1);

        //람다
        names1.sort(String::compareTo); // 메서드 참조(method Reference)
        // names1.sort((s1, s2) -> s2.compareTo(s1)); 같은 의미
        System.out.println("오름차순 : " + names1);
    }
    
}
