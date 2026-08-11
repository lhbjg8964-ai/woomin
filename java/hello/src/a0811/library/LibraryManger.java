package a0811.library;

import java.util.ArrayList;
import java.util.List;

public class LibraryManger {

    private List<Library> libraryList = new ArrayList<>();

    public LibraryManger() {

        libraryList.add(
                new Library(
                        "자바의 정석",
                        "남궁성",
                        "A-01",
                        "ISBN001"
                )
        );

        libraryList.add(
                new Library(
                        "혼자 공부하는 자바",
                        "신용권",
                        "A-02",
                        "ISBN002"
                )
        );

        libraryList.add(
                new Library(
                        "이것이 자바다",
                        "신용권",
                        "A-03",
                        "ISBN003"
                )
        );
    }

    // 1. 대출 가능한 도서 보기
    public void allLibrary() {

        boolean found = false;

        for (Library library : libraryList) {

            if (!library.isBorrowed()) {
                library.printInfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println("현재 대출 가능한 도서가 없습니다.");
        }
    }

    // 2. 도서 대출하기
    public boolean bookLocations(String title) {

        for (Library library : libraryList) {

            if (library.getTitle().equals(title)) {

                if (!library.isBorrowed()) {

                    library.setBorrowed(true);

                    return true;
                }
            }
        }

        return false;
    }

    // 3. 대출한 도서 보기
    // 매개변수가 없으므로 위의 bookLocations(String title)과 오버로딩
    public void bookLocations() {

        boolean found = false;

        for (Library library : libraryList) {

            if (library.isBorrowed()) {
                library.printInfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println("대출한 도서가 없습니다.");
        }
    }

    // 4. 도서 추가하기
    public void addLibrary(
            String title,
            String author,
            String location,
            String isbn) {

        Library library = new Library(
                title,
                author,
                location,
                isbn
        );

        libraryList.add(library);
    }

    // 5. 도서 삭제하기
    public boolean deleteLibrary(String title) {

        for (int i = 0; i < libraryList.size(); i++) {

            if (libraryList.get(i).getTitle().equals(title)) {

                libraryList.remove(i);

                return true;
            }
        }

        return false;
    }

    // 6. 도서 정보 수정하기
    public boolean updateLibrary(
            String title,
            String author,
            String location,
            String isbn) {

        for (Library library : libraryList) {

            if (library.getTitle().equals(title)) {

                library.setAuthor(author);
                library.setLocation(location);
                library.setIsbn(isbn);

                return true;
            }
        }

        return false;
    }

    // 7. 특정 도서 내용 보기
    public void searchLibrary(String title) {

        for (Library library : libraryList) {

            if (library.getTitle().equals(title)) {

                library.printInfo();

                return;
            }
        }

        System.out.println("해당 도서를 찾을 수 없습니다.");
    }
}