package runs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// https://cote.inflearn.com/contest/10/problem/07-08
// 송아지 찾기
public class Main32_3 {

  public int solution(int s, int e) {
    int answer = 0;
    int[] move = {1, -1, 5};
    Queue<Integer> que = new LinkedList<>();

    que.offer(s);
    int[] checks = new int[10001];
    checks[s] = 1;
    while (!que.isEmpty()) {
      int len = que.size();
      for (int i = 0; i < len; i++) {
        int x = que.poll();
        for (int j = 0; j < move.length; j++) {
          int nx = x + move[j];

          if (nx == e) {
            return answer + 1;
          }

          if (nx >=1 && nx <= 10000 && checks[nx] == 0) {
            que.offer(nx);
            checks[nx] = 1;
          }
        }
      }
      answer++;
    }


    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main32_3 T = new Main32_3();
    int s = sc.nextInt();
    int e = sc.nextInt();
    System.out.println(T.solution(s, e));
  }
}
