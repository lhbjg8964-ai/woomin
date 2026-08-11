package a0811.library;

import java.util.Scanner;

public class Search {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 객체 생성과 동시에 더미 데이터 3개 생성
        LibraryManger manger = new LibraryManger();

        boolean flag = true;

        while (flag) {

            System.out.println();
            System.out.println("==============================");
            System.out.println("     도서검색 시스템");
            System.out.println("==============================");
            System.out.println("1. 대출 가능한 도서 보기");
            System.out.println("2. 도서 대출하기");
            System.out.println("3. 대출한 도서 보기");
            System.out.println("4. 도서 추가하기");
            System.out.println("5. 도서 삭제하기");
            System.out.println("6. 도서 정보 수정하기");
            System.out.println("7. 도서 내용 보기");
            System.out.println("8. 종료");
            System.out.println("==============================");

            System.out.print("원하는 작업을 선택하세요 >> ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println();
                    System.out.println("=== 대출 가능한 도서 ===");

                    manger.allLibrary();

                    break;

                case 2:
                    System.out.println();
                    System.out.println("=== 도서 대출하기 ===");

                    System.out.print("대출하려는 도서 이름 입력 : ");
                    String libraryName = sc.nextLine();

                    if (manger.bookLocations(libraryName)) {

                        System.out.println(
                                "도서가 성공적으로 대출되었습니다."
                        );

                    } else {

                        System.out.println(
                                "도서가 존재하지 않거나 대출 불가능합니다."
                        );
                    }

                    break;

                case 3:
                    System.out.println();
                    System.out.println("=== 대출한 도서 보기 ===");

                    manger.bookLocations();

                    break;

                case 4:
                    System.out.println();
                    System.out.println("=== 도서 추가하기 ===");

                    System.out.print("추가 도서 이름 : ");
                    String newTitle = sc.nextLine();

                    System.out.print("추가 도서 저자 : ");
                    String newAuthor = sc.nextLine();

                    System.out.print("도서 위치 : ");
                    String newLocation = sc.nextLine();

                    System.out.print("도서 ISBN : ");
                    String newIsbn = sc.nextLine();

                    manger.addLibrary(
                            newTitle,
                            newAuthor,
                            newLocation,
                            newIsbn
                    );

                    System.out.println("도서 추가 완료");

                    break;

                case 5:
                    System.out.println();
                    System.out.println("=== 도서 삭제하기 ===");

                    System.out.print("삭제할 도서 이름 : ");
                    String deleteTitle = sc.nextLine();

                    if (manger.deleteLibrary(deleteTitle)) {

                        System.out.println("도서 삭제 완료");

                    } else {

                        System.out.println(
                                "해당 도서를 찾을 수 없습니다."
                        );
                    }

                    break;

                case 6:
                    System.out.println();
                    System.out.println("=== 도서 정보 수정하기 ===");

                    System.out.print("수정할 도서 이름 : ");
                    String updateTitle = sc.nextLine();

                    System.out.print("새 저자 : ");
                    String updateAuthor = sc.nextLine();

                    System.out.print("새 위치 : ");
                    String updateLocation = sc.nextLine();

                    System.out.print("새 ISBN : ");
                    String updateIsbn = sc.nextLine();

                    if (manger.updateLibrary(
                            updateTitle,
                            updateAuthor,
                            updateLocation,
                            updateIsbn)) {

                        System.out.println(
                                "도서 정보 수정 완료"
                        );

                    } else {

                        System.out.println(
                                "해당 도서를 찾을 수 없습니다."
                        );
                    }

                    break;

                case 7:
                    System.out.println();
                    System.out.println("=== 도서 내용 보기 ===");

                    System.out.print("조회할 도서 이름 : ");
                    String searchTitle = sc.nextLine();

                    manger.searchLibrary(searchTitle);

                    break;

                case 8:
                    System.out.println();
                    System.out.println(
                            "도서검색 시스템을 종료합니다."
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