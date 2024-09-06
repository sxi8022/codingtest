package runs.day2;

import java.util.Scanner;

// https://cote.inflearn.com/contest/10/problem/10-02
// 계단 오르기
public class Main8 {

  static int[] dy;

  public int solution(int n) {
    dy[1] = 1;
    dy[2] = 2;
    for (int i = 3; i <= n; i++) {
      dy[i] = dy[i-2] + dy[i-1];
    }

    return dy[n];
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main8 T = new Main8();
    int n = sc.nextInt();
    dy = new int[n+1];
    System.out.println(T.solution(n));
  }


}
