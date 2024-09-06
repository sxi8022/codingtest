package programmers.lv_2;

import java.util.Scanner;

// https://school.programmers.co.kr/learn/courses/30/lessons/12945
// 피보나치
public class Solution1 {

  public int solution(int n) {
    int answer = 0;
    int n1 = 0;
    int n0 = 0;
    for (int i = 2; i <= n; i++) {
      if (i == 2) {
        n1 = 1;
        n0 = 0;
      } else {
        n0 = n1;
        n1 = answer;
      }
      answer = (n0 + n1) % 1234567;

    }
    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution1 T = new Solution1();
    int n = sc.nextInt();
    System.out.println(T.solution(n));
  }
}
