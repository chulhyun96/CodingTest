import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputNumArr = new int[3];

        // 값 3번 입력받기
        for (int i = 0; i < inputNumArr.length; i++) {
            inputNumArr[i] = Integer.parseInt(sc.nextLine());
        }

        // 3번 값 곱하기
        long total = 1;

        for (int i = 0; i < inputNumArr.length; i++) {
             total *= inputNumArr[i];
        }

        // 문자열로 변환
        String multiplyValue = String.valueOf(total);

        // 값을 담을 변수 선언
        int[] arrInt = new int[10];

        // getNumericValue 인자로받은 값을 하나씩 꺼내서 주어진 문자의 값을 숫자로 받음
        for (int i = 0; i < multiplyValue.length(); i++) {
            int number = Character.getNumericValue(multiplyValue.charAt(i));
            // number의 값을 꺼내서 number가 담고 있는 값의 해당 하는 인덱스에 카운트++
            arrInt[number]++;
        }
        // 배열 arrInt에 담긴 ++값을 꺼내서 출력
        for (int count : arrInt) {
            System.out.println(count);
        }
    }
}
