package programmers.lv_0;

import java.util.Scanner;
import java.util.regex.Pattern;

// 문자열 뒤집기 - https://school.programmers.co.kr 코딩 기초트레이닝
public class Solution13 {

    public String solution(String str, int s, int e) {
        String answer = "";
        char[] arr = str.toCharArray();
        char[] newArr = new char[e-s + 1];
        char[] finArr = new char[arr.length];
        int cnt =0;
        for (int i = 0; i < arr.length; i++) {
            if (i >= s && i<= e) {
                newArr[cnt++] = arr[i];
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : newArr) {
            sb.append(ch);
        }
        String reverse = sb.reverse().toString();
        char[] reverseNewArr = reverse.toCharArray();


        cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i >= s && i<= e) {
                finArr[i] = reverseNewArr[cnt++];
            } else {
                finArr[i] = arr[i];
            }
        }

        StringBuilder sb2 =  new StringBuilder();
        for(char ch: finArr) {
            sb2.append(ch);
        }

        answer = sb2.toString();

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution13 T = new Solution13();
        System.out.println("문자열을 입력하세요.");

        String myString = sc.nextLine();
        if (myString.length() < 1 || myString.length() > 10000) {
            System.out.println("문자열의 길이는 1이상 1000 이하여야 합니다.");
            System.exit(-1);
        }
        // 알파벳 숫자만 가능
        if (!Pattern.matches("^[a-zA-Z0-9]*$", myString)) {
            System.out.println("no match!");
        }


        System.out.println("첫번째 인덱스를 입력하세요.");
        int s = sc.nextInt();
        if (s < 0 && s >= myString.length() -1) {
            System.out.println("숫자가 잘못되었습니다.");
            System.exit(-1);
        }

        System.out.println("두번째 인덱스를 입력하세요.");
        int e = sc.nextInt();
        if (e >= myString.length() -1 ||  e < s) {
            System.out.println("숫자가 잘못되었습니다.");
            System.exit(-1);
        }




        String answer = T.solution(myString, s, e);
        System.out.println(answer);

    }
}
