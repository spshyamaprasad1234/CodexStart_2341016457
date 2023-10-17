import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Q6_1092 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = input.readLine();
        long n = Long.parseLong(str);
        
        long totalSum = n * (n + 1) / 2;
        
        if (totalSum % 2 != 0) {
            output.write("NO\n");
            output.flush();
        } else {
            output.write("YES\n");
            
            totalSum /= 2;
            
            boolean[] included = new boolean[(int) n + 1];
            StringBuilder setA = new StringBuilder();
            StringBuilder setB = new StringBuilder();
            
            int a_cnt = 0;
            int b_cnt = 0;
            for (long i = n; i > 0; i--) {
                if (totalSum - i >= 0) {
                    setA.append(i).append(" ");
                    a_cnt++;
                    totalSum -= i;
                    included[(int) i] = true;
                } else {
                    setB.append(i).append(" ");
                    b_cnt++;
                }
            }
            
            output.write(a_cnt  + "\n");
            output.write(setA + "\n");
            output.write(b_cnt + "\n");
            output.write(setB + "\n");
            output.flush();
        }
    }
}
