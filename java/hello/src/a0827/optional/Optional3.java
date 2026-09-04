package a0827.optional;

import java.util.Optional;

//값이 없으면 예외 던지기 -> orELseThrow
public class Optional3 {
    public static void main(String[] args) {
        String userId = null; //Db에서 찾지 못한 상황

        String name = Optional.ofNullable(userId) // useId가 null 일수 있으므로 
            .orElseThrow(()->new IllegalArgumentException("사용자 찾지 못함"));
        //값이 있으면 name  반환 하고 없으면 예외를 발생시켜라
        System.out.println(name);    
    }
}
