package a0806.Collection;

import java.util.*;
public class BookMapTest {
    public static void main(String[] args) {
        Map<String, Book> bookMap = new HashMap<>();
        bookMap.put("B001", new Book("자바의정석", "남궁성", 30000));
        bookMap.put("B002", new Book("혼자공부하는자바", "신용권", 28000));
        bookMap.put("B003", new Book("이것이 자바다", "신용권", 35000));
        
        System.out.println("=== 전체 도서===");
        
        for(String key : bookMap.keySet()){
            System.out.println(key + " : " + bookMap.get(key));
        }

        Book book = bookMap.get("B002");
        System.out.println(book);
        System.out.println();

        System.out.println("--- 수정 후 ---");
        bookMap.get("B002").setPrice(25000);
        System.out.println(bookMap.get("B002"));
        System.out.println();


        System.out.println("--- 삭제 후 ---");
        bookMap.remove("B003");

        System.out.println(bookMap);
    }
        
}
    
