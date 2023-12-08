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

            if (parseIntNum1 == 0 && parseIntNum2 == 0) {
                break;
            }

            if (parseIntNum2 % parseIntNum1 == 0) {
                System.out.println("factor");
            } else if (parseIntNum1 % parseIntNum2 == 0) {
                System.out.println("multiple");
            }
            else {
                System.out.println("neither");
            }
        }
    }
}
