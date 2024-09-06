package programmers.lv_1;

import java.util.Scanner;

// https://school.programmers.co.kr/learn/courses/30/lessons/12934
// 제곱근 판별
public class Solution19 {

    public long solution(long n) {
        long answer = 0 ;
        double sqrt = Math.sqrt(n);
        if (sqrt % 1 == 0) {
            answer = (long) Math.pow(sqrt+1, 2);

        } else answer = -1;
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        Solution19 T = new Solution19();
        System.out.println(T.solution(n));
    }
}
