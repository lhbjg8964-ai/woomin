package a0806.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


// 컬렉션 프레임워크(collection) - 다수의 데이터를 쉽고 효과적으로 처리 클래스의 집합
// List
// Set
// Map

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        // 제넥릭은 객체를 다룬다. 기본형인 int는 허용안됨 대신 -> <Integer>를 대신 사용

        // add()메소드를 이용한 요소의 저장
        arrayList.add(40);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(10);

        // for 문과 get() 메소드를 이용한 요소의 출력
        for(int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i) + "");
        }
        System.out.println();

        arrayList.remove(1);
        // 향상 for문
        for(int e : arrayList){
            System.out.println(e+" ");
        }
        System.out.println();
        // Collections.sort() 메소드를 이용한 요소의 정렬
        Collections.sort(arrayList); // Collections 에서 정렬을 지원

        // Iterator() 메소드와 get()메소드를 이용한 요소의 출력
        // 중요하지않음
        Iterator<Integer> iter = arrayList.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next() + " ");
        }
        System.out.println();

        //set() 메소드를 이용한 요소의 변경
        arrayList.set(0, 20);
        for(int e : arrayList){
            System.out.println(e+" ");
        }
        System.out.println();

        // 크기확인
        System.out.println("리스트의 크기 : "+arrayList.size());



    }
    
}
