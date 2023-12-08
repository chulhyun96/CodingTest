import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //반복 횟수 입력 받기
        int iterationNum = Integer.parseInt(sc.nextLine());

        // 반복회수 만큼 순회하면서 입력 받기
        for (int i = 0; i < iterationNum; i++) {
            String line = sc.nextLine();
            // 각 순회시마다 초기화
            int total = 0;
            int score = 0;

            // 값 비교해가며 값 할당
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
        sc.close();
    }
}
