package programmers.lv_0;

import java.util.Scanner;

// 9로나눈 나머지 https://school.programmers.co.kr/learn/courses/30/lessons/181914
public class Solution15 {
    public int solution(String temp) {
        int answer = 0;

        int[] digits = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
            digits[i] = temp.charAt(i) - '0';
        for (int i = 0; i < temp.length(); i++)
            answer +=digits[i];

        answer = answer%9;
        return answer;


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution15 T = new Solution15();
        System.out.println("숫자를 입력하세요.");

        int num = sc.nextInt();
        if (num < 1 || num > 100000) {
            System.out.println("원소는 1이상 100000 이하여야 합니다.");
            System.exit(-1);
        }
        String temp = Integer.toString(num);
        System.out.println(T.solution(temp));

    }
}
