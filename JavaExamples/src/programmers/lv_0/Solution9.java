package programmers.lv_0;

import java.util.Scanner;
import java.util.regex.Pattern;

// 문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때,
// my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
public class Solution9 {
    public String solution (String my_string, int num1, int num2) {
        String answer = "";
        char[] arr = new char[my_string.length()];

        for (int i = 0;  i< my_string.length(); i++) {
            arr[i] = my_string.charAt(i);
        }


        for (int i = 0;  i< my_string.length(); i++) {
           //my_string.charAt(i)
            if (i == num1) {
                char temp = arr[num1];
                arr[num1] = arr[num2];
                arr[num2] = temp;
                break;
            }
        }


        answer =  String.valueOf(arr);

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution9 T = new Solution9();
        System.out.println("문자열을 입력하세요.");

        String myString = sc.nextLine();
        if (myString.length() <= 1 || myString.length() > 100) {
            System.out.println("문자열의 길이는 1이상 100 이하여야 합니다.");
            System.exit(-1);
        }

        // 영어소문자, 대문자 공백만 허용
        if (!Pattern.matches("^[a-zA-Z]*$", myString)) {
            System.out.println("영어소문자, 대문자 공백만 허용!");
            System.exit(-1);
        }

        System.out.println("첫번째숫자를입력하세요.");
        int num1 = sc.nextInt();

        System.out.println("두번째숫자를입력하세요.");
        int num2 = sc.nextInt();

        if (num1 > myString.length() || num2 > myString.length()) {
            System.out.println("숫자가 큽니다.");
            System.exit(-1);
        }


        String answer = T.solution(myString, num1, num2);
        System.out.println(answer);
    }

}
