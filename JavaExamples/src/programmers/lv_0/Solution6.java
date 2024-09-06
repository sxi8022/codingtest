package programmers.lv_0;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

//문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라 오름차순 정렬
public class Solution6 {
    public int[] solution (String str) {
        str = str.replaceAll("[^0-9]", "");
        int[] answer = new int[str.length()];

        for(int i =0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        Arrays.sort( answer);

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution6 T = new Solution6();
        System.out.println("문자열을 입력하세요.");

        String myString = sc.nextLine();
        if (myString.length() < 1 || myString.length() > 100) {
            System.out.println("문자열의 길이는 1이상 100 이하여야 합니다.");
            System.exit(-1);
        }
        // 영어소문자, 숫자만가능, 숫자는 1개이상
        if (!Pattern.matches("^([a-z]+[0-9]{1,})$", myString)) {
            System.out.println("no match!");
        }
        int[] array = T.solution(myString);
        for (int i : array) {
            System.out.print(i + " ");
        }

    }
}
