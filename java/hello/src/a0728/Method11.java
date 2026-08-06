package a0728;

public class Method11 {
    public static void main(String[] args) {
        int sum = total(90,80,70); //인수

        System.out.println("총점 : " + sum);
    }

    private static int total(int i, int j, int k) {//매개변수
        return i + j + k;
    }
}
