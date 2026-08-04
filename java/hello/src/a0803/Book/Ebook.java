package a0803.Book;

public class Ebook extends Book {
    private double fileSize; // 파일크기(MB)
    private String format; //파일형식
    public Ebook(String title, String author, String iSBN, double fileSize, String format) {
        super(title, author, iSBN);
        this.fileSize = fileSize;
        this.format = format;

        
        

    }
    
    
}
