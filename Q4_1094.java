import java.util.Scanner;

public class Q4_1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] array = new long[n];
        
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLong();
        }
        
        long moves = 0;
        long prev = array[0];
        
        for (int i = 1; i < n; i++) {
            if (array[i] < prev) {
                moves += prev - array[i];
            } else {
                prev = array[i];
            }
        }
        
        System.out.println(moves);
    }
}
