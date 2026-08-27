package a0827.optional;

import java.util.Optional;

// 값이 없으면 예외 던지기 -> orELseThrow
public class Optional3 {
    public static void main(String[] args) {
        String userId = null; // Db에서 찾지 못한 상황

        String name = Optional.ofNullable(userId) // userId가 null 일수 있으므로
            .orElseThrow(() -> new IllegalArgumentException("사용자 찾지 못함"));
            // 값이 있으면 name 반환 하고 없으면 예외를 발생시켜라
            System.out.println(name);
    }
    
}
// Spring Data JPA에서 다음과 같은 코드를 자주 보게 됩니다.

// Optional<Member> result =
//         memberRepository.findById(id);

// 회원이 있을 수도 있고 없을 수도 있기 때문에 Optional<Member>로 반환합니다.

// 그리고 서비스에서:

// Member member =
//         memberRepository.findById(id)
//             .orElseThrow(() ->
//                 new IllegalArgumentException(
//                     "회원을 찾을 수 없습니다."
//                 )
//             );

// 이렇게 작성할 수 있습니다.