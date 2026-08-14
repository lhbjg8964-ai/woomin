package a0812.file.student;

import java.io.FileReader;
import java.io.IOException;

public class StudentRead {
    public static void main(String[] args) {
        try {
        FileReader fr = new FileReader("C:/abcdf/test.txt");
            int data; //
            while ((data = fr.read()) != -1) {
                System.out.print((char)data);
            }
            fr.close();
        }catch(IOException e){
            System.out.println("파일을 읽을 수 없습니다.");
            System.out.println(e.getMessage());

        }
    }
    
}
