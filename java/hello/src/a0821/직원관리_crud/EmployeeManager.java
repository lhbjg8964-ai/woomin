package a0821.직원관리_crud;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManager {
    
    private ArrayList<Employee> list = new ArrayList<>(); // Employee의 리스트를 담을 arrayList
    private Scanner sc = new Scanner(System.in);

    public EmployeeManager() { // EmployeeManager 생성과 동시에 더미데이터를 넣는다.
        list.add(new Employee("E001", "홍길동", "개발팀", 3500));
        list.add(new Employee("E002", "김영희", "인사팀", 3200));
        list.add(new Employee("E003", "이철수", "영업팀", 3000));
        list.add(new Employee("E004", "박민수", "개발팀", 3800));
        list.add(new Employee("E005", "최지우", "기획팀", 3400));
    }

    public void run(){
        
        while (true) { //Menu 보임
            System.out.println("========== 직원 관리 시스템 ==========");
            System.out.println("1. 직원 등록 (C)");
            System.out.println("2. 전체 조회 (R)");
            System.out.println("3. 직원 수정 (U)");
            System.out.println("4. 직원 삭제 (D)");
            System.out.println("5. 사번으로 검색");
            System.out.println("0. 종료");
            System.out.print(" 선택> ");

            String menu =sc.nextLine();

            switch (menu) {
                case "1":
                    addEmployee(); //회원 추가
                    // 사번을 입력하고 사번중복이 없으면 이름, 부서, 연봉을 입력받고 List에 add로 추가
                    break;
                case "2":
                    printAll(); //화면에 사원 출력하기
                    // 사번을 입력하고 사번중복이 없으면 이름, 부서, 연봉을 입력받고 List에 add로 추가
                    break;
                case "3":
                    updateEmployee(); //사원 정보 수정
                    break;
                case "4":
                    deleteEmployee(); //사원 정보 삭제
                    break;
                case "5":
                    searchEmployee(); 
                    break;
                case "0":
                    System.out.println("프로그램 종료합니다");
                    return;
            
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }

    }

    private void searchEmployee() {
        System.out.println("검색 사번:");
        String id = sc.nextLine();
        Employee e = findById(id);

        if (e == null) {
            System.out.println("해당 사번이 없습니다.");
            }else{
                System.out.println(e);
            }
        }

    private void deleteEmployee() {
        // 사원이 있는지 확인
        // 리스트에서 remove로 삭제
        System.out.println("삭제할 사번:");
        String id = sc.nextLine();
        Employee e = findById(id);

        if (e == null) {
            System.out.println("해당 사번이 없습니다.");
            return;
        }

        list.remove(e);
        System.out.println("삭제되었습니다.");
    }

    private void updateEmployee() {
        // 수정할 사번이 있어야 수정이됨
        // id를 제외한 이름 부서 연봉등을 입력 받아 setter 메서드 이용 수정
        System.out.print("수정할 사번 : ");
        String id =sc.nextLine();
        Employee e = findById(id);

        if (e == null ){
            System.out.println("해당 사번이 없습니다");
            return;
        }
        System.out.print("새 이름 : ");
        String name = sc.nextLine();
        if (!name.isEmpty()) {
            e.setName(name);
        }
        System.out.print("새 부서 : ");
        String dept = sc.nextLine();
        if (!dept.isEmpty()) {
            e.setDept(dept);
        } 
        System.out.print("새 연봉 : ");
        String salaryStr = sc.nextLine();
        if (!salaryStr.isEmpty()) {
            e.setSalary(Integer.parseInt((salaryStr)));
        }
        // "E001", "홍길동", "개발팀", 3500
        System.out.println("수정되었습니다.");
    }

    private void printAll() {
        if (list.isEmpty()){ // 사원이 아무도 없으면
            System.out.println("등록된 직원이 없습니다.");
            return;
        }
        for(int  i = 0; i < list.size(); i++){
            System.out.println("[" + (i + 1) + "] " + list.get(i));
        }
        
    }

    private void addEmployee() {
        System.out.print("사번 : ");
        String id = sc.nextLine();

        //사번을 입력받아서 리스트에 없어야 새로운 직원등록 가능 (중복방지)
        if(findById(id) != null){
            System.out.println("이미 존재하는 사번입니다.");
            return;
        }
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("부서 : ");
        String dept = sc.nextLine();
        System.out.print("연봉 : ");
        int salary = Integer.parseInt(sc.nextLine()); // 문자로 입력받아 숫자로 변화 "10000" -> 10000원
        list.add(new Employee(id, name, dept, salary)); // Employee 생성자로 객체만들어서 list 추가
        System.out.println("직원이 등록되었습니다.");
    }

    private Employee findById(String id) {
        for(Employee e : list){
            if(e.getId().equals(id)){ //id와 list 안에 있는 id 비교
                return e; //Employee 객체
            }
        }
        return null;

        
    }





}
