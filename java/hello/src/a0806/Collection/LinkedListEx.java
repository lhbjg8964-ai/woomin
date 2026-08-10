package a0806.Collection;
import java.util.*;
public class LinkedListEx {
    public static void main(String[] args) {
          // LinkedList 생성
        LinkedList<String> linkedList = new LinkedList<>();
        
        linkedList.add("첫 번째");
        linkedList.add("두 번째");
        linkedList.add("세 번째");
        System.out.println("초기 리스트: " + linkedList);

        //앞에추가
        linkedList.addFirst("맨 앞");
        System.out.println("초기 리스트: " + linkedList);


         linkedList.addLast("맨 뒤");
        System.out.println("초기 리스트: " + linkedList);

        // 첫 번째/마지막 요소
        System.out.println("첫 번째 요소: " + linkedList.getFirst());
        System.out.println("마지막 요소: " + linkedList.getLast());


         linkedList.add(1, "중간 번째");
         System.out.println(" 리스트: " + linkedList);

         linkedList.remove(3);
         System.out.println(" 리스트: " + linkedList);
        System.out.println("\n=== ArrayList vs LinkedList ===");
        System.out.println("ArrayList: 인덱스 접근이 빠름, 중간 삽입/삭제가 느림");
        System.out.println("LinkedList: 중간 삽입/삭제가 빠름, 인덱스 접근이 느림");
    }
}
