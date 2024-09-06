package programmers.practice;

import java.util.Scanner;

// 높이가 n인 삼각형 출력
public class Solution1 {

  public void solution(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i+1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution1 T = new Solution1();
    int n = sc.nextInt();
    T.solution(n);
  }
}
