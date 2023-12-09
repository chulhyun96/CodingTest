import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlphabetCount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //?? ??

        //?? ????
        String line = br.readLine().toUpperCase();
        int[] alphabet = new int[26];

        for (int i = 0; i < line.length(); i++) {
            char c  = line.charAt(i);
            alphabet[c - 'A']++;
        }

        int maxFrequency = 0;
        char result = ' ';

        for (int i = 0; i < alphabet.length; i++) {
            if (maxFrequency < alphabet[i]) {
                maxFrequency = alphabet[i];
                result = (char) (i + 'A');
            } else if (maxFrequency == alphabet[i]) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}
