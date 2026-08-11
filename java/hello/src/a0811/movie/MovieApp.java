package a0811.movie;

import java.util.Scanner;

public class MovieApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // MovieManager 객체 생성
        // 생성과 동시에 더미 데이터 3개 생성
        MovieManager manager = new MovieManager();

        boolean flag = true;

        while (flag) {

            System.out.println();
            System.out.println("==============================");
            System.out.println("      영화 대여 관리 시스템");
            System.out.println("==============================");
            System.out.println("1. 대여 가능한 영화 보기");
            System.out.println("2. 영화 대여하기");
            System.out.println("3. 대여한 영화 보기");
            System.out.println("4. 영화 추가하기");
            System.out.println("5. 영화 삭제하기");
            System.out.println("6. 영화 정보 수정하기");
            System.out.println("7. 영화 내용 보기");
            System.out.println("8. 종료");
            System.out.println("==============================");

            System.out.print("원하는 작업을 선택하세요 >> ");

            int choice = sc.nextInt();

            // nextInt() 사용 후 남아있는 Enter 제거
            sc.nextLine();

            switch (choice) {

                // 1. 대여 가능한 영화
                case 1:

                    System.out.println();
                    System.out.println("=== 대여 가능한 영화 ===");

                    manager.showAvailableMovies();

                    break;

                // 2. 영화 대여
                case 2:

                    System.out.println();
                    System.out.println("=== 영화 대여하기 ===");

                    System.out.print("대여할 영화 제목 : ");
                    String rentTitle = sc.nextLine();

                    if (manager.rent(rentTitle)) {

                        System.out.println("영화 대여 완료");

                    } else {

                        System.out.println(
                                "영화가 없거나 이미 대여 중입니다."
                        );
                    }

                    break;

                // 3. 대여한 영화 보기
                case 3:

                    System.out.println();
                    System.out.println("=== 대여한 영화 보기 ===");

                    // rent() 메서드 오버로딩
                    manager.rent();

                    break;

                // 4. 영화 추가
                case 4:

                    System.out.println();
                    System.out.println("=== 영화 추가하기 ===");

                    System.out.print("영화 제목 : ");
                    String newTitle = sc.nextLine();

                    System.out.print("감독 : ");
                    String newDirector = sc.nextLine();

                    System.out.print("장르 : ");
                    String newGenre = sc.nextLine();

                    System.out.print("관람 등급 : ");
                    String newRating = sc.nextLine();

                    manager.addMovie(
                            newTitle,
                            newDirector,
                            newGenre,
                            newRating
                    );

                    System.out.println("영화 추가 완료");

                    break;

                // 5. 영화 삭제
                case 5:

                    System.out.println();
                    System.out.println("=== 영화 삭제하기 ===");

                    System.out.print("삭제할 영화 제목 : ");
                    String deleteTitle = sc.nextLine();

                    if (manager.deleteMovie(deleteTitle)) {

                        System.out.println("영화 삭제 완료");

                    } else {

                        System.out.println(
                                "영화가 없거나 대여 중이라 삭제할 수 없습니다."
                        );
                    }

                    break;

                // 6. 영화 정보 수정
                case 6:

                    System.out.println();
                    System.out.println("=== 영화 정보 수정하기 ===");

                    System.out.print("수정할 영화 제목 : ");
                    String updateTitle = sc.nextLine();

                    System.out.println("1. 제목");
                    System.out.println("2. 감독");
                    System.out.println("3. 장르");
                    System.out.println("4. 관람 등급");

                    System.out.print("수정할 항목 선택 >> ");

                    int updateChoice = sc.nextInt();
                    sc.nextLine();

                    System.out.print("수정할 내용 입력 : ");
                    String value = sc.nextLine();

                    if (manager.updateMovie(
                            updateTitle,
                            updateChoice,
                            value)) {

                        System.out.println("영화 정보 수정 완료");

                    } else {

                        System.out.println(
                                "영화를 찾을 수 없거나 잘못된 번호입니다."
                        );
                    }

                    break;

                // 7. 영화 조회
                case 7:

                    System.out.println();
                    System.out.println("=== 영화 내용 보기 ===");

                    System.out.print("조회할 영화 제목 : ");
                    String searchTitle = sc.nextLine();

                    manager.searchMovie(searchTitle);

                    break;

                // 8. 종료
                case 8:

                    System.out.println();
                    System.out.println(
                            "영화 대여 관리 시스템을 종료합니다."
                    );

                    flag = false;

                    break;

                default:

                    System.out.println(
                            "1~8번 사이의 번호를 입력해주세요."
                    );

                    break;
            }
        }

        sc.close();
    }
}