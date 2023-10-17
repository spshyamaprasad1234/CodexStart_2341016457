import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q9_1617 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = input.readLine();
        int n = Integer.parseInt(str);
        int mod = 1000000007; // Modulo for large numbers

        // Calculate 2^n modulo mod
        long result = 1;
        for (int i = 0; i < n; i++) {
            result = (result * 2) % mod;
        }

        output.write(result + "\n");
        output.flush();
    }
}
