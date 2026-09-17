package a0914;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        while (true) {
            System.out.println();
            System.out.println("1. 추가  2. 목록  3. 삭제  4. 종료");
            System.out.print("메뉴 선택: ");

            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                System.out.print("학생 이름: ");
                String name = sc.nextLine();
                students.add(name);
                System.out.println("추가되었습니다.");

            } else if (menu == 2) {
                System.out.println("===== 학생 목록 =====");

                if (students.isEmpty()) {
                    System.out.println("등록된 학생이 없습니다.");
                } else {
                    for (int i = 0; i < students.size(); i++) {
                        System.out.println(i + " : " + students.get(i));
                    }
                }

            } else if (menu == 3) {
                System.out.println("===== 학생 목록 =====");

                for (int i = 0; i < students.size(); i++) {
                    System.out.println(i + " : " + students.get(i));
                }

                System.out.print("삭제할 인덱스: ");
                int index = sc.nextInt();
                sc.nextLine();

                if (index >= 0 && index < students.size()) {
                    String deleteName = students.remove(index);
                    System.out.println(deleteName + " 삭제 완료");
                } else {
                    System.out.println("잘못된 인덱스입니다.");
                }

            } else if (menu == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;

            } else {
                System.out.println("잘못된 메뉴입니다.");
            }
        }

        sc.close();
    }
}