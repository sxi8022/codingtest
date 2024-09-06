package programmers.lv_0;

import java.util.Scanner;

//문자열 뒤집기 문자열, 반복문, 출력, 배열, 조건문
public class Solution2 {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            answer += String.valueOf(my_string.charAt(my_string.length() -1 -i));
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution2 T = new Solution2();
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요.");
        String my_string = sc.nextLine();
        System.out.println(T.solution(my_string));


    }
}
