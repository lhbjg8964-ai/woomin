package a0728;
//함수를 이용해 배열의 합을 구하시오
public class MethodEx07 {
    public static void main(String[] args) {
          int[] num = {10,20,30,40};

        System.out.println(sum(num));
    }

    private static int sum(int[] arr) {
       int sum = 0;
       for (int i=0; i<arr.length;i++){
            sum += arr[i];
       }
       return sum;
    }
}
