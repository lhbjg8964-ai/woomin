package a0724;

public class for2 {
    public static void main(String[] args) {
        for(int i=1; i <=5; i++){
            for(int j=1; j <=5; j++){
                 System.out.print("*");
            }
            System.out.println();//한줄바꿈
        }

//삼각형 *
         for(int i=1; i <=5; i++){
            for(int j=1; j <=i; j++){
                 System.out.print("*");
            }
            System.out.println();//한줄바꿈
        }

    }
}
