import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScaleToString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine().replace(" ","");

        int[] values = new int[line.length()];

        for (int i = 0; i < line.length(); i++) {
            values[i] = Character.getNumericValue(line.charAt(i));
        }

        // ?? ????? true? ??? -> ?? ?? false? ??
        boolean isAscending = true;
        boolean isDescending = true;


        for (int i = 0; i < values.length-1; i++) {
            //???? ? ?? deseding? false? -> ????? ?? isAscending? true
            if (values[i] < values[i+1]) {
                isDescending = false;
            }
            //???? ? ?? asceding? false? -> ???? ? ?? isDescending? true
            if (values[i] > values[i+1]) {
                isAscending = false;
            }
            // ???? ?? ?? false? ? -> ???? ??? ??? ascending? ????, ?? true?? ???
        }
        String result = " ";
        if (isAscending) {
            result = "ascending";
        } else if (isDescending) {
            result = "descending";
        } else {
            result = "mixed";
        }
        System.out.println(result);

    }
}
