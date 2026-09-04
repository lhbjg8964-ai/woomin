package a0904.이우민_문제3;
import java.util.ArrayList;

public class NumberManager {
    public static void addNumber(ArrayList<Integer> list, int num) {
        list.add(num);
    }

    public static int findMax(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return -1;
        }

        int max = list.get(0);
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findMin(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return -1;
        }
        int min = list.get(0);
        for (int num : list) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    
    public static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }
}