package a0811.library;

public class Library {

    private String title;
    private String author;
    private String location;
    private String isbn;
    private boolean borrowed;

    public Library(String title, String author, String location, String isbn) {
        this.title = title;
        this.author = author;
        this.location = location;
        this.isbn = isbn;
        this.borrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getLocation() {
        return location;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public void printInfo() {
        System.out.println(
                "도서명 : " + title
                + ", 저자 : " + author
                + ", 위치 : " + location
                + ", ISBN : " + isbn
                + ", 대출상태 : " + (borrowed ? "대출중" : "대출가능")
        );
    }
}