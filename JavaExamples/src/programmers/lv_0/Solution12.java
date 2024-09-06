package programmers.lv_0;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

//영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때
//, my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return
public class Solution12 {
    public String solution (String str) {
        String answer = "";
        char[] arr = str.toCharArray();
        for (int i = 0 ; i < arr.length; i++) {
            arr[i] = Character.toLowerCase(arr[i]);
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder(new String(arr));
        answer = sb.toString();

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution12 T = new Solution12();
        System.out.println("문자열을 입력하세요.");

        String myString = sc.nextLine();
        if (myString.length() < 1 || myString.length() > 100) {
            System.out.println("문자열의 길이는 1이상 100 이하여야 합니다.");
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

