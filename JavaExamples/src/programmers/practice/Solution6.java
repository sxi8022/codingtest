package programmers.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Solution6 {

  public int solution(int n, int k) {
    long answer = 0;
    long [][] dp = new long [k+1][n+1];
    // 초기 조건 설정
    Arrays.fill(dp[1], 1);
    for (int i = 0; i <= k; i++) {
      for (int j = 0; j <= n; j++) {
        for (int l = 0; l < j; l++) {
          dp[i][j] = (dp[i][j] + dp[i-1][l]);
        }
      }
    }

    for (int i = 1; i<= n; i++) {
      answer = (answer + dp[k][i] % 1000000007);
    }

    return Integer.parseInt(String.valueOf(answer));
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution6 T = new Solution6();
    int n = sc.nextInt();
    int k = sc.nextInt();

    System.out.println(T.solution(n, k));
  }
}
