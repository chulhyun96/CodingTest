import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            String line = sc.nextLine();

            String[] lineSplit = line.split(" ");

            String num1 = lineSplit[0];
            String num2 = lineSplit[1];

            int parseIntNum1 = Integer.parseInt(num1);
            int parseIntNum2 = Integer.parseInt(num2);

            String result;

            //먼저 입력된 수가  0 0인지 검사 (종료를 위해)
            if (parseIntNum1 == 0 && parseIntNum2 == 0) {
                break;
            }
            // 약수
            if (parseIntNum2 % parseIntNum1 == 0) {
                result = "factor";
            // 배수
            } else if (parseIntNum1 % parseIntNum2 == 0) {
                result = "multiple";
            }
            // 둘다 아닌 경우
            else {
                result = "neither";
            }
            System.out.println(result);
        }
    }
}
