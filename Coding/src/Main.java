import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 값을 입력받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 제곱 후의 값을 할당하기 위한 변수 선언
        int square = 0;
        // 값의 크기 만큼 순회할 for문
        for (int i = 0; i < 5; i++) {
            /// 값을 입력받아 제곱을 위해 값을 담을 변수 num 선언
            int num = sc.nextInt();
            // 제곱
            square += num * num;
        }
        // 결과에 담아 나누기 위한 변수 선언
        int result = square % 10;
        System.out.println(result);
    }
}
