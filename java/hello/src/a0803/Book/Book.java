package a0803.Book;

public class Book {
    private String title; //책제목
    private String author; //책저자
    private String ISBN;
    
    public Book(String title, String author, String iSBN) {
        this.title = title;
        this.author = author;
        ISBN = iSBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
    

    //도서정보 출력 메서드
    public void displayInfo(){
        System.out.println("title" + title);
        System.out.println("Author" + author);
        System.out.println("ISBN" + ISBN);
    }
    
}
