import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

    // 학생 정보를 저장할 ArrayList
    private ArrayList<Student> studentList = new ArrayList<>();

    // 사용자 입력을 위한 Scanner
    private Scanner scanner = new Scanner(System.in);

    // 학생 관리 프로그램 실행
    public void run() {

        while (true) {
            System.out.println("\n===== 학생 관리 프로그램 =====");
            System.out.println("1. 학생 등록");
            System.out.println("2. 학생 검색");
            System.out.println("3. 학생 수정");
            System.out.println("4. 학생 삭제");
            System.out.println("5. 전체 학생 출력");
            System.out.println("0. 프로그램 종료");
            System.out.println("============================");

            int menu = inputNumber("메뉴 선택: ");

            switch (menu) {
                case 1:
                    addStudent();
                    break;

                case 2:
                    searchStudent();
                    break;

                case 3:
                    updateStudent();
                    break;

                case 4:
                    deleteStudent();
                    break;

                case 5:
                    printAllStudents();
                    break;

                case 0:
                    System.out.println("학생 관리 프로그램을 종료합니다.");
                    return;

                default:
                    System.out.println("올바른 메뉴 번호를 입력해주세요.");
            }
        }
    }

    // 1. 학생 등록(Create)
    private void addStudent() {
        System.out.println("\n===== 학생 등록 =====");

        System.out.print("학번: ");
        String studentId = scanner.nextLine();

        // 같은 학번이 이미 등록되어 있는지 확인
        Student student = findStudent(studentId);

        if (student != null) {
            System.out.println("이미 등록된 학번입니다.");
            return;
        }

        System.out.print("이름: ");
        String name = scanner.nextLine();

        int age = inputNumber("나이: ");
        int score = inputNumber("점수: ");

        // 새로운 학생 객체 생성
        Student newStudent =
                new Student(studentId, name, age, score);

        // ArrayList에 학생 추가
        studentList.add(newStudent);

        System.out.println("학생이 등록되었습니다.");
    }

    // 2. 학생 검색(Read)
    private void searchStudent() {
        System.out.println("\n===== 학생 검색 =====");

        System.out.print("검색할 학번: ");
        String studentId = scanner.nextLine();

        // 학번으로 학생 찾기
        Student student = findStudent(studentId);

        if (student == null) {
            System.out.println("해당 학생을 찾을 수 없습니다.");
        } else {
            System.out.println("검색 결과");
            System.out.println(student);
        }
    }

    // 3. 학생 수정(Update)
    private void updateStudent() {
        System.out.println("\n===== 학생 수정 =====");

        System.out.print("수정할 학생의 학번: ");
        String studentId = scanner.nextLine();

        // 학번으로 수정할 학생 찾기
        Student student = findStudent(studentId);

        if (student == null) {
            System.out.println("해당 학생을 찾을 수 없습니다.");
            return;
        }

        // 현재 학생 정보 출력
        System.out.println("현재 정보");
        System.out.println(student);

        // 새로운 정보 입력
        System.out.print("새로운 이름: ");
        String newName = scanner.nextLine();

        int newAge = inputNumber("새로운 나이: ");
        int newScore = inputNumber("새로운 점수: ");

        // Setter를 사용하여 학생 정보 수정
        student.setName(newName);
        student.setAge(newAge);
        student.setScore(newScore);

        System.out.println("학생 정보가 수정되었습니다.");
        System.out.println(student);
    }

    // 4. 학생 삭제(Delete)
    private void deleteStudent() {
        System.out.println("\n===== 학생 삭제 =====");

        System.out.print("삭제할 학생의 학번: ");
        String studentId = scanner.nextLine();

        // 학번으로 삭제할 학생 찾기
        Student student = findStudent(studentId);

        if (student == null) {
            System.out.println("해당 학생을 찾을 수 없습니다.");
            return;
        }

        // ArrayList에서 학생 삭제
        studentList.remove(student);

        System.out.println("학생 정보가 삭제되었습니다.");
    }

    // 5. 전체 학생 출력(Read)
    private void printAllStudents() {
        System.out.println("\n===== 전체 학생 목록 =====");

        // 학생 목록이 비어 있는지 확인
        if (studentList.isEmpty()) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }

        // 향상된 for문으로 모든 학생 출력
        for (Student student : studentList) {
            System.out.println(student);
        }

        System.out.println("---------------------------");
        System.out.println("전체 학생 수: "
                + studentList.size() + "명");
    }

    // 학번으로 학생을 찾는 메서드
    private Student findStudent(String studentId) {

        // 학생 목록을 처음부터 끝까지 확인
        for (Student student : studentList) {

            // 입력한 학번과 학생의 학번이 같으면
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }

        // 학생을 찾지 못한 경우 null 반환
        return null;
    }

    // 숫자를 안전하게 입력받는 메서드
    private int inputNumber(String message) {

        while (true) {
            try {
                System.out.print(message);

                // 문자열로 입력받은 후 int로 변환
                return Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력해주세요.");
            }
        }
    }
}