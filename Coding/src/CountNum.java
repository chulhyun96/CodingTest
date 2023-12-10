import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 3?? ?? ????
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int num3 = Integer.parseInt(br.readLine());

        // ?? long?? ????, String?? ???? ? ??? String?? ??
        String multiplyNum = String.valueOf(num1 * num2 * num3);

        //0~9??? ??? ???? ?? ?? ??
        int[] numArray = new int[10];

        for (int i = 0; i < multiplyNum.length(); i++) {
            //???? ?? ??? ??
            char c = multiplyNum.charAt(i);
            // ??? 0? ?????? 48? ?? ???? ++???? ?? ???
            numArray[c - 48]++;
        }
        for (int arr : numArray) {
            System.out.println(arr);
        }
    }
}
