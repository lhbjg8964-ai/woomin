package a0806.Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapEX {
    public static void main(String[] args) {
        System.out.println("=== HashMap 예제 ===\n");
        
        // HashMap 생성
        HashMap<String, Integer> scores = new HashMap<>();
        
        // 요소 추가
        scores.put("홍길동", 85);
        scores.put("김철수", 90);
        scores.put("이영희", 88);
        scores.put("박민수", 92);

         System.out.println("초기 맵: " + scores);

         //값 가져오기
         int score = scores.get("홍길동");
        System.out.println("홍길동의 점수: " + score);
         // 값 수정 (같은 키로 put)
        scores.put("홍길동", 95);
        System.out.println("홍길동 점수 수정 후: " + scores);


        // 키 존재 확인
        System.out.println("홍길동 키 존재: " + scores.containsKey("홍길동"));
        System.out.println("최지영 키 존재: " + scores.containsKey("최지영"));
        
        // 값 존재 확인
        System.out.println("90 점수 존재: " + scores.containsValue(90));
        
       // 요소 삭제
        scores.remove("박민수");
        System.out.println("박민수 삭제 후: " + scores);

       // 크기 확인
        System.out.println("맵 크기: " + scores.size());
        
        // 비어있는지 확인
        System.out.println("비어있는가? " + scores.isEmpty());
System.out.println("\n=== 맵 순회 방법 ===\n");
 // 방법 1: keySet() 사용
        System.out.println("--- keySet()으로 순회 ---");
        for (String name : scores.keySet()) {
            System.out.println(name + ": " + scores.get(name) + "점");
        }
        
        // 방법 2: values() 사용
        System.out.println("\n--- values()로 순회 ---");
        for (Integer scoreValue : scores.values()) {
            System.out.println("점수: " + scoreValue);
        }
        
        // 방법 3: entrySet() 사용 (권장)
        System.out.println("\n--- entrySet()으로 순회 ---");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + "점");
        }

        //LinkedHashMap 입력순서 그대로 출력
        Map<String, String> map = new LinkedHashMap<>();

        map.put("3", "사과");
        map.put("1", "바나나");
        map.put("2", "포도");

        System.out.println(map);

       //키(key)를 기준으로 자동정렬합니다.
       Map<String, String> map1 = new TreeMap<>();

        map1.put("3", "사과");
        map1.put("1", "바나나");
        map1.put("2", "포도");

        System.out.println(map1);

// HashMap
// 가장 많이 사용
// 빠른 검색이 목적
// 순서가 필요 없을 때
// LinkedHashMap
// 입력한 순서대로 출력해야 할 때
// 게시글 목록, 최근 검색어 등
// TreeMap
// 키를 자동으로 정렬해야 할 때
// 학생 번호순, 이름순, 날짜순 출력 등

    }
}
