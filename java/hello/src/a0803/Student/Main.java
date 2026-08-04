package a0803.Student;

public class Main {

    public static void main(String[] args) {

        // Employee 객체 5개를 저장할 배열
        Employee[] employees = new Employee[5];


        // =================================
        // Create : 직원 데이터 저장
        // =================================

        employees[0] = new Employee(1001, "홍길동", 3000000, 500000);
        employees[1] = new Employee(1002, "이순신", 3500000, 700000);
        employees[2] = new Employee(1003, "김유신", 2800000, 300000);
        employees[3] = new Employee(1004, "강감찬", 3200000, 400000);
        employees[4] = new Employee(1005, "신사임당", 5000000, 800000);


        // =================================
        // Read : 처음 직원 목록 출력
        // =================================

        System.out.println("===== 직원 목록 =====");
        System.out.println();
 
        printEmployees(employees);


        // =================================
        // Update : 홍길동 수정
        // =================================

        System.out.println();
        System.out.println("===== 수정 =====");
        System.out.println();

        for (int i = 0; i < employees.length; i++) {

            // null이 아니고 이름이 홍길동이면
            if (employees[i] != null &&
                employees[i].getName().equals("홍길동")) {

                employees[i].setSalary(4000000);
                employees[i].setBonus(1000000);

                System.out.println("홍길동 직원 수정 완료");
            }
        }


        // =================================
        // Delete : 강감찬 삭제
        // =================================

        System.out.println();
        System.out.println("===== 삭제 =====");
        System.out.println();

        for (int i = 0; i < employees.length; i++) {

            if (employees[i] != null &&
                employees[i].getName().equals("강감찬")) {

                // 해당 배열 자리를 null로 변경
                employees[i] = null;

                System.out.println("강감찬 직원 삭제 완료");
            }
        }


        // =================================
        // Read : 최종 직원 목록
        // =================================

        System.out.println();
        System.out.println("===== 최종 목록 =====");
        System.out.println();

        printEmployees(employees);
    }


    // 직원 목록 출력 메서드
    public static void printEmployees(Employee[] employees) {

        System.out.println("---------------------------------------------");
        System.out.println("사번\t이름\t기본급\t\t보너스\t총급여");
        System.out.println("---------------------------------------------");

        for (int i = 0; i < employees.length; i++) {

            // 직원 객체가 존재하면 정보 출력
            if (employees[i] != null) {
                employees[i].printInfo();
            }

            // null이면 비어있음 출력
            else {
                System.out.println("비어있음");
            }
        }
    }
}