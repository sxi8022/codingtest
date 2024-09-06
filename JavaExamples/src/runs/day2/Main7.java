package runs.day2;

import java.util.Scanner;

// https://cote.inflearn.com/contest/10/problem/10-02
// 돌다리건너기
public class Main7 {

  static int[] dy;

  public int solution(int n) {

    dy[1] = 1;
    dy[2] = 2;
    for (int i = 3; i <= n+1; i++) {
      dy[i] = dy[i - 2] + dy[i - 1];
    }
    return dy[n+1];
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main7 T = new Main7();
    int n = sc.nextInt();
    dy = new int[n + 2];
    System.out.println(T.solution(n));
  }
}
