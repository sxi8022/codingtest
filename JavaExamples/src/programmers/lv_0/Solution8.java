package programmers.lv_0;

import java.util.Scanner;
import java.util.regex.Pattern;

// 소문자는 대문자로, 대문자는 소문자로
public class Solution8 {
    public String solution (String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0;  i< my_string.length(); i++) {
            if(61 <= my_string.charAt(i) && my_string.charAt(i) <= 90) {
                sb.append((char)(my_string.charAt(i)+32));
            }
            if (97 <= my_string.charAt(i) && my_string.charAt(i) <= 122) {
                sb.append((char)(my_string.charAt(i) -32));
            }
        }


        answer = sb.toString();

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution8 T = new Solution8();
        System.out.println("문자열을 입력하세요.");

        String myString = sc.nextLine();
        if (myString.length() <= 1 || myString.length() > 1000) {
            System.out.println("문자열의 길이는 1이상 1000 이하여야 합니다.");
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
