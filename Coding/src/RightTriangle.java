import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RightTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean isRunning = true;
        while (isRunning) {
            // 한줄에 공백으로 3개의 값을 입력받는다.
            String[] line = reader.readLine().split(" ");

            //가장 긴변을 오름차순으로 맨 뒤에 넣기 위한 배열 선언 및 정렬
            int[] arr = new int[3];
            for (int i = 0; i < arr.length; i++)
                arr[i] = Integer.parseInt(line[i]);
            Arrays.sort(arr);

            //0 0 0 입력시 프로그램 종료
            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0)
                break;


            // 3개의 값이 피타고라스 정리를 만족해야 한다.
            int aSquared = arr[0] * arr[0];
            int bSquared = arr[1] * arr[1];
            int cSquared = arr[2] * arr[2];

            //직각 삼각형일 경우 right, 아닐 경우 wrong을 출력한다
            String result;
            if (aSquared + bSquared == cSquared) {
                result = "right";
            } else {
                result = "wrong";
            }
            System.out.println(result);
        }
    }
}
