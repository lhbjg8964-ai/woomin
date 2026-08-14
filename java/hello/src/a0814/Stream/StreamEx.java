package a0814.Stream;

import java.util.Arrays;
import java.util.List;

// Java Stream은 Java 8에서 추가된 기능
// 컬렉션이나 배열의 데이터를 필터링, 정렬, 변환, 집계할 때 사용

public class StreamEx {
    public static void main(String[] args) {
        List<Integer> scores =
                Arrays.asList(90, 80, 70, 100, 95);

        // 향상된 for문
        for (Integer score : scores) {
            System.out.println(score);
        }

        System.out.println();

        // Stream과 람다식
        scores.stream()
              .forEach(score -> System.out.println(score));
    }
}
// List
//  │
//  ▼
// stream()
//  │
//  ▼
// 가공(filter, map, sorted...)
//  │
//  ▼
// 최종처리(forEach, collect, count...)