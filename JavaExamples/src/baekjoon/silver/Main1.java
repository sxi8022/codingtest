package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 다리 놓기
// https://www.acmicpc.net/problem/1010
public class Main1 {

    // 다리 건설 경우의 수
    private static final int[][] dp = new int[31][31];

    /*
    * 메인 함수
    *
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         int T = Integer.parseInt(br.readLine());
         for (int i = 0; i < T; i++) {
             StringTokenizer st = new StringTokenizer(br.readLine());
             int N = Integer.parseInt(st.nextToken());
             int M = Integer.parseInt(st.nextToken());
             System.out.println(combination(M,N));
         }

    }

    /*
    *
    * 조합 결과 반환 함수
    * c : 원소 개수
    * r : 조합 개수
    * */
    private static int combination(int c, int r) {

        if (dp[c][r] > 0) {
            return dp[c][r];
        }

        // 원소의 갯수가 조합의 갯수와 동일하거나 0일 경우
        else if (c == r || r == 0) {
            return dp[c][r] = 1;
        }

        // 일반적인 경우
        else {
            return dp[c][r] = combination(c -1, r  -1 ) + combination(c -1, r);
        }
    }
}
