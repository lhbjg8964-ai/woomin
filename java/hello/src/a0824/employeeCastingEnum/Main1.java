package a0824.employeeCastingEnum;

import java.util.ArrayList;
import java.util.HashSet;

public class Main1 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new FullTimeEmployee("홍길동", 1, 3000000, 500000);
        employees[1] = new PartTimeEmployee("김영희", 2, 0, 20, 15000);
        employees[2] = new Manager("박철수", 3, 5000000, 100000, 5);
        employees[3] = new FullTimeEmployee("이미영", 4, 2500000, 300000);
        employees[4] = new PartTimeEmployee("최민수", 5, 0, 15, 12000);

        System.out.println("==== 모든 직원 정보 출력 (다형성) ====");
        for (Employee emp : employees) {
            emp.printInfo();
        }

        System.out.println("\n==== 전체 급여 합계 ====");
        double totalSalary = 0;
        for (Employee emp : employees) {
            totalSalary = totalSalary + emp.calculateSalary();
        }
        System.out.println("전체 급여 합계: " + String.format("%,.0f", totalSalary));

        // instanceof 대신 enum으로 타입을 구분할 수 있다.
        // 오타가 없고, switch에서 모든 종류를 빠짐없이 다루기 쉽다.
        System.out.println("\n==== 직원 타입별 처리 (enum switch) ====");
        for (Employee emp : employees) {
            switch (emp.getType()) {
                case FULL_TIME:
                    ((FullTimeEmployee) emp).workFullTime();
                    break;
                case PART_TIME:
                    ((PartTimeEmployee) emp).workPartTime();
                    break;
                case MANAGER:
                    ((Manager) emp).manageTeam();
                    break;
            }
        }

        System.out.println("\n==== equals 비교 ====");
        Employee hong1 = new FullTimeEmployee("홍길동", 1, 3000000, 500000);
        Employee hong2 = new FullTimeEmployee("홍길동", 1, 9999999, 0); // 사번 같음, 급여는 다름
        Employee hong3 = new FullTimeEmployee("홍길동", 99, 3000000, 500000); // 이름만 같고 사번 다름

        System.out.println("hong1 == hong2 (주소 비교): " + (hong1 == hong2));           // false
        System.out.println("hong1.equals(hong2) (사번 비교): " + hong1.equals(hong2));   // true  (id=1)
        System.out.println("hong1.equals(hong3) (이름만 같음): " + hong1.equals(hong3)); // false (id 다름)

        // ArrayList.contains()는 내부에서 equals()를 호출한다.
        System.out.println("\n==== ArrayList.contains (중복 사번 검사) ====");
        ArrayList<Employee> list = new ArrayList<>();
        list.add(employees[0]); // 홍길동 id=1
        Employee sameId = new PartTimeEmployee("다른이름", 1, 0, 10, 10000); // 사번만 같음
        System.out.println("같은 사번이 이미 있나? " + list.contains(sameId)); // true

        // HashSet은 equals + hashCode 둘 다 맞아야 중복을 제거한다.
        System.out.println("\n==== HashSet (같은 사번은 한 명만 저장) ====");
        HashSet<Employee> set = new HashSet<>();
        set.add(hong1);
        set.add(hong2); // id가 같아서 추가되지 않음
        set.add(hong3); // id가 달라서 추가됨
        System.out.println("Set 인원수: " + set.size()); // 2
        for (Employee emp : set) {
            emp.printInfo();
        }

        System.out.println("\n==== 특정 직원 검색 (이름) ====");
        String searchName = "홍길동";
        Employee found = findEmployee(employees, searchName);
        if (found != null) {
            System.out.println("검색 결과");
            found.printInfo();
        } else {
            System.out.println(searchName + "을(를) 찾을 수 없습니다.");
        }
    }

    private static Employee findEmployee(Employee[] employees, String searchName) {
        for (Employee emp : employees) {
            if (emp.getName().equals(searchName)) {
                return emp;
            }
        }
        return null;
    }
}
