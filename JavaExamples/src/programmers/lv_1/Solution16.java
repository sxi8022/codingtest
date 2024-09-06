package programmers.lv_1;

import java.util.Scanner;

// 직사각형 별찍기
// https://school.programmers.co.kr/learn/courses/30/lessons/12969
public class Solution16 {

  public void solution(int n, int m) {

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution16 T = new Solution16();
    int n = sc.nextInt();
    int m = sc.nextInt();
    T.solution(n, m);
  }
}
