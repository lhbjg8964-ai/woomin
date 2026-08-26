package a0825.sort.hak1;

public class Compare1 {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";
        String str3 = "apple";
        // CompareTo - 두 문자열 사전식으로 비교
        // 문자열을 앞에서부터 한글자씩 비교
        System.out.println(str1.compareTo(str2));
        // 아스키코드로 비교햇을때 a(97)가 b(98)보다 작아서 음수 -1
        System.out.println(str1.compareTo(str3));
        // 아스키코드로 비교했을때 같은 값 이므로 0
        System.out.println(str2.compareTo(str1));
        // 아스키코드로 비교했을때 b가 a보다 크기에 양수 1
    }
    
}
