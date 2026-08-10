package a0721;

public class Var3 {
    public static void main(String[] args) {
        
        int var1 = 10;
        System.out.println(var1);
        double doubleVar = 3.141592653589793; //8byte
        System.out.println(doubleVar);

        byte byteVar = 127;
        System.out.println(byteVar); // 정수 1byte -128 ~ 127
        short shortVar = 32767; // -32768 ~ 32767  2byte
        System.out.println(shortVar);

        
        //문자형
        char charVar = 'A';
        System.out.println(charVar);
        char koreanChar = '가';
        System.out.println(koreanChar);
        char unicodeChar = '\u0061';
        System.out.println(unicodeChar); //유니코드로 A 표현 - 인터넷에서 유니코드 찾아본다.

        //논리형
        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println(isTrue);
        System.out.println(isFalse);

        boolean result = (5 > 3);  //true
        System.out.println(result);

    }
}
