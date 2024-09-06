package programmers.lv_2;

import java.util.Scanner;

// 최대값과 최솟값
// https://school.programmers.co.kr/learn/courses/30/lessons/12939
public class Solution3 {

    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        int[] intArr = new int[arr.length];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i <intArr.length; i++) {
            if (intArr[i] < min) min = intArr[i];
            if (intArr[i] > max) max = intArr[i];
        }

        answer = min + " " + max;

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Solution3 T = new Solution3();
        System.out.println(T.solution(s));
    }
}
