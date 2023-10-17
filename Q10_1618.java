import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10_1618 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = input.readLine();
        int n = Integer.parseInt(str);

        int count = 0;

        // Count the number of factors of 5 in the factorial
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }

        output.write(count + "\n");
        output.flush();
    }
}
