import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputBall {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] line = input.split(" ");

        String basketCount = line[0]; // 1 ~ 5

        String basketNum = line[1]; // 4 개의 수를 받겠다는 뜻
        int basketNumLength = Integer.parseInt(basketNum);


        // 바스켓의 수만큼 배열의 크기를 만들어 줌
        int[] basket = new int[Integer.parseInt(basketCount)];

        // 몇번을입력해서 공의 위치를 바꿀 건지 입력
        for (int i = 0; i < basketNumLength; i++) {
            String[] inputNumber = br.readLine().split(" "); // 1  2  3
            // 값을 나눠주고
            int basketBeginIndex = Integer.parseInt(inputNumber[0])-1;
            int basketEndIndex = Integer.parseInt(inputNumber[1])-1;
            int basketBallValue = Integer.parseInt(inputNumber[2]);

            // beginIndex ~ endIndex 까지 value를 넣어야 하기 때문에 for문으로 범위를 설정해줌
            for (int start = basketBeginIndex; start <= basketEndIndex; start++) {
                basket[start] = basketBallValue;
            }
        }
        // 출력
        for (int basketBall : basket) {
            System.out.print(basketBall + " ");
        }
    }
}
