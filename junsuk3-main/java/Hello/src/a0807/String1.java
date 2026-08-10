package a0807;

public class String1 {
    public static void main(String[] args) {
        String str1 = "Java"; //true  100번지
        String str2 = "Java"; //true   100번지
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        
        String str3 = new String("Java"); 
        //객체를 만들면 주소가 달라짐
        System.out.println(str1 == str3); //200 - 주소끼리비교 false

        System.out.println(str1.equals(str3)); //내용비교 Java Java 비교

        

    }
}
