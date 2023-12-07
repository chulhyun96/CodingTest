import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력을 공백과 함께 받아야함
        String[] input = sc.nextLine().split(" ");

        // 입력받은 수만큼 배열 생성, 배열에 담고 값을 비교하기 위해서
        int[] inputNum = new int[input.length];


        boolean isAscending = true;
        boolean isDescending = true;

        // 입력받은 값을 배열에 넣음
        for (int i = 0; i < inputNum.length; i++) {
            inputNum[i] = Integer.parseInt(input[i]);
        }

        // 값을 입력받은 배열의 인덱스와 그 다음인덱스를 비교하여 오름차순이라면 asceding
        // 내림차순 이라면 descending 둘다 아니라면 mixed
        for (int i = 0; i < inputNum.length -1; i++) {
            if (inputNum[i] < inputNum[i+1]) {
                isDescending = false;
            }
            if (inputNum[i] > inputNum[i+1]) {
                isAscending = false;
            }
        }
        String result;
        if (isDescending) {
            result = "descending";
        } else if (isAscending) {
            result = "ascending";
        } else {
            result = "mixed";
        }
        System.out.println(result);
    }
}
