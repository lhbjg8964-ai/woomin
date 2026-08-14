package a0814.Ramda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//여려가지 클래스가 있으면 main 있는 대표 클래스만 public
public class Ramda6 {
    public static void main(String[] args) {
        List<Person> peoples = new ArrayList<>();
        Person p1 =new Person(1, "허준석", 30);
        Person p2 =new Person(2, "김진짜", 33);
        Person p3 =new Person(3, "박성철", 31);
        
        peoples.add(p1);
        peoples.add(p2);
        peoples.add(p3);
        // System.out.println(peoples);
        for(int i = 0; i<peoples.size(); i++){
            System.out.println(peoples.get(i));
        }
        //향상 for문
        System.out.println();
        for(Person p : peoples)
            System.out.println(p);

        System.out.println();
        //forEach
        peoples.forEach(p->System.out.println(p));

        System.out.println();

        //List - Collections 일부
        // 람다식으로 변환하여 나이순으로 정렬
        // Collections.sort(peoples,(a1,a2) -> a1.getAge() - a2.getAge());
        Collections.sort(peoples,(a1,a2) -> a2.getAge() - a1.getAge()); //나이 역순
        // peoples.sort(Comparator.comparingInt(Person::getAge)); 이런방식도 잇음
        // Collections.sort(peoples, (pp1, pp2) -> Integer.compare(pp1.getAge(), pp2.getAge())); 이런방식도있음
        peoples.forEach(p->System.out.println(p));
        System.out.println();
        // Collections.sort(peoples, (pp1, pp2) -> pp1.getName().compareTo(pp2.getName())); //이름 오름차순
        peoples.sort(Comparator.comparing(Person::getName).reversed()); //이름역순 - Stream 많이 쓰임
        peoples.forEach(p->System.out.println(p));
        
       } 
}

class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "번호: " + id + ", 이름: " + name + ", 나이: " + age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}