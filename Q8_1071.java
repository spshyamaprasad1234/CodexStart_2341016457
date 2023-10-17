import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;


public class Q8_1071 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = input.readLine();
        int t = Integer.parseInt(str); // Number of test cases

        while (t-- > 0) {
            String xy[] = input.readLine().split(" ");
            
            long y = Long.parseLong(xy[0]); // Row 
            long x = Long.parseLong(xy[1]); // Column

            long max = Math.max(x, y); // Find the maximum of x and y
            long diagonal = (max - 1) * (max - 1); // Calculate the value at the diagonal
            long result;

            if (max % 2 == 0) { // If max is even
                if (max == x) {
                    result = diagonal + y;
                } else {
                    result = diagonal + max * 2 - x;
                }
            } else { // If max is odd
                if (max == y) {
                    result = diagonal + x;
                } else {
                    result = diagonal + max * 2 - y;
                }
            }

            output.write(result + "\n");
            output.flush();
        }
    }
}
