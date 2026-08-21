package a0721;

public class Var3 {
    public static void main(String[] args) {
        
        int var1 = 10;
        System.out.println(var1);
        int _var2 = 20;
        int $var3 = 30;

        //int #var4 = 40;  특수문자는 _ , $ 로만 시작
        int var5 = 1000000000; // 4byte int 범위 초과 -2,147,483,648 ~ 2,147,483,647
        long var6 = 10000000000L; //8byte 아주큰 정수 -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
        double doubleVar = 3.141592653589793; //8byte
        float floatVar = 3.14F; //float 접미사 F or f   
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
