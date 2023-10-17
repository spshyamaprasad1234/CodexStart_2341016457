import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Q7_1072 {
    public static void main(String[] args)throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = input.readLine();
        long n = Integer.parseInt(str);
        
        for (int k = 1; k <= n; k++) {
            long totalWays = (long)k * k;
            long attackingWays = 0;

            if (k > 2) {
                attackingWays = 4 * (k - 1) * (k - 2);
            }
            
            long nonAttackingWays = totalWays * (totalWays - 1) / 2 - attackingWays;
            
            output.write(nonAttackingWays + "\n");
            output.flush();
        }
    }
}
