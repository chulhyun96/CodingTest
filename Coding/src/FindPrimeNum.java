import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindPrimeNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int iterations = Integer.parseInt(br.readLine());

        String[] lines = br.readLine().split(" ");

        int primeCount = 0;

        for (int i = 0; i < iterations; i++) {
            int prime = Integer.parseInt(lines[i]);
            boolean isPrime = true; // 현재 숫자가 소수인지를 나타내는 플래그

            //소수는 1과 자기 자신을 제외해야 하므로
            if (prime == 1) {
                isPrime = false;
            }
            //2부터 자기자신의 제곱근까지 나누어보며 나누어 떨어지는지 확인
            for (int j = 2; j <= Math.sqrt(prime); j++) {
                if (prime % j == 0) {
                    //나누어 떨어질 경우 소수가 아니고
                    isPrime = false;
                    // 불필요한 연산을 하지 않기 위한 break
                    break;
                }
            }
            if (isPrime) {
                primeCount++;
            }
        }
        System.out.println(primeCount);
    }
}

