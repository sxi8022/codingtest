package programmers.lv_0;

import java.util.Scanner;
import java.util.regex.Pattern;

//중복된 문자 제거
public class Solution7 {
    public String solution (String str) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            }
        }
        answer = sb.toString();

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution7 T = new Solution7();
        System.out.println("문자열을 입력하세요.");

        String myString = sc.nextLine();
        if (myString.length() < 1 || myString.length() > 110) {
            System.out.println("문자열의 길이는 1이상 110 이하여야 합니다.");
            System.exit(-1);
        }
        // 영어소문자, 대문자 공백만 허용
        if (!Pattern.matches("^[a-zA-Z]*$", myString)) {
            System.out.println("영어소문자, 대문자 공백만 허용!");
        }
        String answer = T.solution(myString);
        System.out.println(answer);
    }
}
