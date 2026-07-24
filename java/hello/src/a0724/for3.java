public class for3 {public static void main(String[] args) {
    for (int i =2; i <= 9; i++){
        System.out.println("["+i+"단]");
        for(int j = 1; j <=9; j++){
            System.out.println(i+"X"+j+"=" +(i*j));
        }
        System.out.println();

    }

    //삼각형 *
     for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
    
