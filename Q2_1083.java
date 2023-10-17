import java.util.Scanner;

public class Q2_1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        
        // Calculate the sum of all integers from 1 to n
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
        // Subtract the sum of the elements in the array
        for (int i = 0; i < n - 1; i++) {
            int num = sc.nextInt();
            sum -= num;
        }
        
        // The remaining sum is the missing number
        System.out.println(sum);
    }
}
