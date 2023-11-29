import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 단어 입력 받기
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toUpperCase();
        // 입력받은 단어를 배열로 나누기
        char[] toArray = word.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for (char c : toArray){
            // 입력받은 단어의 인덱스 요소를 꺼내서 비교하기
            // 겹치지 않을 경우 밸류 1, 겹칠경우 현재 밸류에서 +1
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }
        // 가장 많이 겹친 문자를 꺼내기 위한 변수 선언
        int maxCount = 0;
        String maxChar = "";
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            // Map에 저장된 밸류의 값과 count 비교
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = String.valueOf(entry.getKey());
            } else if (entry.getValue() == maxCount) {
                // 가장 많이 겹친 문자가 여러개일 경우 ?로 처리
                maxChar = "?";
            }
        }
        System.out.println(maxChar.toUpperCase());
    }
}
