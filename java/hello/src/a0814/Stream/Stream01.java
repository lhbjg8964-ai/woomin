package a0814.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream01 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        List<Integer> evens = numbers.stream()
                .filter(n -> n %2 == 0)
                .collect(Collectors.toList());
        System.out.println(evens);
        System.out.println();
        //결과값을 프린트만 하려할때
        numbers.stream()
                .filter(n -> n %2 == 0)
                .forEach(System.out::println);

        //첫번째것과 동일한 자바 16이상
          List<Integer> even = numbers.stream()
                .filter(n -> n %2 == 0)
                .toList();//자바 16이상
        System.out.println(even);        

    }
}
