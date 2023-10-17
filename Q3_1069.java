import java.util.Scanner;

public class Q3_1069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sequence = sc.next();
        
        int maxRepetitions = 1; // Initialize with at least one repetition
        int currentRepetitions = 1;
        
        for (int i = 1; i < sequence.length(); i++) {
            if (sequence.charAt(i) == sequence.charAt(i - 1)) {
                currentRepetitions++;
            } else {
                currentRepetitions = 1;
            }
            
            maxRepetitions = Math.max(maxRepetitions, currentRepetitions);
        }
        
        System.out.println(maxRepetitions);
    }
}
