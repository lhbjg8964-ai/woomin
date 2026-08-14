package a0812;

public class Exception4 {
    public static void main(String[] args) {
        String str = "ABC";

        try{
            int num = Integer.parseInt(str); //잃은 숫자인데 "1" 문자된 숫자를 변경할떄 쓰임 (Integer.parseInt)
            // 완전 문자인 ABC가 들어왔으므로
        }catch(NumberFormatException e){
            System.out.println("숫자만 입력하세요");
        }
    }
    
}
