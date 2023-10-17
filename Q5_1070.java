import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Q5_1070 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = input.readLine();
        int n = Integer.parseInt(str);

        if (n == 2 || n == 3) {
            System.out.println("NO SOLUTION");
        } else {
            int[] permutation = new int[n + 1];
            
            // Create an even and odd list of numbers
            int k = 0;
            for(int i = 2; i <= n; i += 2,k++) {
                permutation[k] = i;
            }
            for(int i = 1; i <= n; i += 2,k++) {
                permutation[k] = i;
            }
            
            // Print the permutation
            for (int i = 0; i < n; i++) {
                output.write(permutation[i] + " ");
            }
            output.flush();
        }
    }
}
