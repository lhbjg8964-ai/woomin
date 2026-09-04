package a0904.이우민_문제1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Student> list = new ArrayList<>();

        while (true) {
            System.out.println("------------------------");
            System.out.println("1. 학생 등록");
            System.out.println("2. 학생 검색");
            System.out.println("3. 학생 수정");
            System.out.println("4. 학생 삭제");
            System.out.println("5. 전체 출력");
            System.out.println("6. 종료");
            System.out.print("선택 > ");
            int menu;

            try {
                menu = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력하세요");
                continue;
            }

            switch (menu) {
                case 1:
                    System.out.print("이름 입력 : ");
                    String name = sc.nextLine();
                    int age = inputAge(sc, "나이 입력 : ");
                    list.add(new Student(name, age));
                    System.out.println("학생 등록 완료");
                    break;

                case 2:
                    System.out.print("검색할 이름 : ");
                    String searchName = sc.nextLine();
                    Student foundStudent = findStudent(list, searchName);
                    if (foundStudent != null) {
                        System.out.println(foundStudent);
                    } else {
                        System.out.println("학생이 없습니다");
                    }
                    break;

                case 3:
                    System.out.print("수정할 이름 : ");
                    String updateName = sc.nextLine();
                    int newAge = inputAge(sc, "새로운 나이 : ");
                    if (updateStudent(list, updateName, newAge)) {
                        System.out.println("수정 완료");
                    } else {
                        System.out.println("해당 학생이 없습니다");
                    }
                    break;

                case 4:
                    System.out.print("삭제할 이름 : ");
                    String deleteName = sc.nextLine();
                    if (deleteStudent(list, deleteName)) {
                        System.out.println("삭제 완료");
                    } else {
                        System.out.println("삭제할 학생이 없습니다");
                    }
                    break;

                case 5:
                    if (list.isEmpty()) {
                        System.out.println("등록된 학생이 없습니다");
                    } else {
                        for (Student student : list) {
                            System.out.println(student);
                        }
                    }
                    break;

                case 6:
                    System.out.println("프로그램을 종료합니다");
                    sc.close();
                    return;

                default:
                    System.out.println("1~6번 중에 선택하세요");
            }
        }
    }

    public static Student findStudent(ArrayList<Student> list, String name) {
        for (Student student : list) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    public static boolean updateStudent(ArrayList<Student> list,String name, int newAge) {Student student = findStudent(list, name);
        if (student != null) {
            student.setAge(newAge);
            return true;
        }
        return false;
    }

    public static boolean deleteStudent(ArrayList<Student> list, String name) {
        Student student = findStudent(list, name);
        if (student != null) {
            list.remove(student);
            return true;
        }
        return false;
    }

    public static int inputAge(Scanner sc, String message) {
        while (true) {
            System.out.print(message);
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("나이는 숫자로 입력하세요");
            }
        }
    }
}