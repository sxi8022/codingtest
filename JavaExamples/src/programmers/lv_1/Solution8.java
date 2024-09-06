package programmers.lv_1;

import java.util.Scanner;

// https://school.programmers.co.kr/learn/courses/30/lessons/12937
// 짝수와 홀수
public class Solution8 {

  public String solution(int num) {
    return num % 2 == 0 ? "Even" : "Odd";
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("배열길이입력");
    Solution8 T = new Solution8();
    int n = sc.nextInt();

    System.out.println(T.solution(n));

  }
}
