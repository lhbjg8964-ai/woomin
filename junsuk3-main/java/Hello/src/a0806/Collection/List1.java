package a0806.Collection;

import java.util.ArrayList;

public class List1 {
    public static void main(String[] args) {
         System.out.println("=== ArrayList 예제 ===\n");
        
        // ArrayList 생성
        ArrayList<String> arrayList = new ArrayList<>();
        
        // 요소 추가
        arrayList.add("사과");
        arrayList.add("바나나");
        arrayList.add("오렌지");
        System.out.println("초기 리스트: " + arrayList);
        
        // 특정 위치에 추가
        arrayList.add(1, "포도");
        System.out.println("인덱스 1에 포도 추가: " + arrayList);
        
        // 요소 접근
        System.out.println("인덱스 0: " + arrayList.get(0));
        System.out.println("인덱스 2: " + arrayList.get(2));
        
        // 요소 변경
        arrayList.set(0, "딸기");
        System.out.println("인덱스 0을 딸기로 변경: " + arrayList);
        
        // 요소 삭제 (인덱스)
        arrayList.remove(1);
        System.out.println("인덱스 1 삭제: " + arrayList); //딸기 바나나 오렌지
        
        // 요소 삭제 (요소)
        arrayList.remove("바나나");
        System.out.println("바나나 삭제: " + arrayList);
        
        // 크기 확인
        System.out.println("리스트 크기: " + arrayList.size());


        // 포함 여부 확인
        System.out.println("오렌지 포함 여부: " + arrayList.contains("오렌지"));
        // 포함이면 true 없으면 false
        
        // 인덱스 찾기
        System.out.println("오렌지의 인덱스: " + arrayList.indexOf("오렌지"));
        //찾으면 인덱스번호를 반환 1 찾지못하면 -1
         System.out.println("\n반복문으로 순회:");
        for (String fruit : arrayList) {
            System.out.println("- " + fruit);
        }
        
        // 인덱스로 순회
        System.out.println("\n인덱스로 순회:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(i + ": " + arrayList.get(i));
        }
        
    }
}
