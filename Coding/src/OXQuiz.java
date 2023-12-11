import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OXQuiz {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int iterations = Integer.parseInt(br.readLine());

        for (int i = 0; i < iterations; i++) {
            String line = br.readLine();
            int total = 0;
            int score = 0;
            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == 'O') {
                    score++;
                    total += score;
                } else if (line.charAt(j) == 'X') {
                    score = 0;
                }
            }
            System.out.println(total);
        }
    }
}
