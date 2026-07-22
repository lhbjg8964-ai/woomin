package a0721;

public class Var3 {
    public static void main(String[] args) {
        int var1 = 10;
        System.out.println(var1);
        int var2 = 20;
        int $bar3 = 30;

        // int #var4 =40; 특수문자는 _, $ 로만 시작가능
        // int var5 = 10000000000; int 범위 초과 (4byte / -2,147,483,648 ~ 2,147,483,647)
        long var6 = 100000000000L;
        // long 범위 (8byte / -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807) 아주 큰 정수를 저장할때 사용
        double doubleVar = 3.141592653589793; // 8byte
        float floatVar = 3.14F; // float 접미사 F or f
        System.out.println(doubleVar);

        byte byteVar = 127;
        System.out.println(byteVar); // 정수 1byte (-128 ~ 127)만 저장하고 싶을때
        short shortVar = 32767; // 2byte (-32768 ~32767)
        System.out.println(shortVar);

        //문자형
        char charVar ='A';
        System.out.println(charVar);
        char koreanChar = '가';
        System.out.println(koreanChar);
        char unicodeChar = '\u0061';
        System.out.println(unicodeChar); //유니코드 A로 변환 - 인터넷에서 유니코드 찾아본다

        //논리형
        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println(isTrue);
        System.out.println(isFalse);

        boolean result = (5 > 3);
        System.out.println(result); // true

    }
}
