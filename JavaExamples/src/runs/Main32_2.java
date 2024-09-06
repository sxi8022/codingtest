package runs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main32_2 {

  public int solution(int s, int e) {
    int answer = 0;
    Queue<Integer> que = new LinkedList<>();
    int[] ch = new int[10001];
    int[] move = {1, -1, 5};
    que.offer(s);
    ch[s] = 1;
    if (s == e) {
      return answer;
    }

    while (!que.isEmpty()) {
      int len = que.size();
      for (int i = 0; i < len; i++) {
        int x = que.poll();
        for (int j = 0; j < move.length; j++) {
          int nx = x + move[j];
          if (nx == e) {
            return answer + 1;
          }
          if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
            ch[nx] = 1;
            que.offer(nx);
          }
        }
      }
      answer++;
    }

    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main32_2 T = new Main32_2();
    int s = sc.nextInt();
    int e = sc.nextInt();
    System.out.println(T.solution(s, e));
  }
}
