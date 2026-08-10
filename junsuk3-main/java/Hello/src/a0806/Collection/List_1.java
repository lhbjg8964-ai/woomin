package a0806.Collection;

import java.util.*;


//컬렉션 프레임워크(collection) - 다수의 데이터를 쉽고 효과적으로 처리 클래스의 집합
// List
// Set
// Map

public class List_1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
		
        // 제넥릭은 객체를 다룬다. 기본형인 int 허용안됨 ->  <Integer> 

		// add() 메소드를 이용한 요소의 저장
		arrList.add(40);
		arrList.add(20);
		arrList.add(30);
		arrList.add(10);
		
		// for 문과 get() 메소드를 이용한 요소의 출력
		for (int i = 0; i < arrList.size(); i++) {
			System.out.print(arrList.get(i) + " ");
		}
		System.out.println();

        arrList.remove(1);
        //향상 for
        for(int e : arrList ){
            System.out.print(e + " ");
        }
        System.out.println();

	   // Collections.sort() 메소드를 이용한 요소의 정렬
		Collections.sort(arrList); // Collections 에서 정렬을 지원

        // iterator() 메소드와 get() 메소드를 이용한 요소의 출력
        //중요하지 않음
		Iterator<Integer> iter = arrList.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();


		// set() 메소드를 이용한 요소의 변경
		arrList.set(0, 20);
        for(int e : arrList ){
            System.out.print(e + " ");
        }
        System.out.println();
        //크기확인
        System.out.println("리스트의 크기 : " + arrList.size());


    }
}
