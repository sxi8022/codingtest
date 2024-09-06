package runs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main32_1 {

  public int solution(int s, int e) {
    int answer = 0;
    Queue<Integer> queue = new LinkedList<>();
    int len = 0;
    queue.offer(s);
    int[] move = {1, 5, -1};
    int[] ch = new int[10001];
    ch[s] = 1;
    while (!queue.isEmpty()) {
      len = queue.size();
      for (int i = 0; i < len; i++) {
        int x = queue.poll();
        for (int j = 0; j < move.length; j++) {
          int nx = x + move[j];
          if (nx == e) {
            return answer + 1;
          }
          if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
            ch[nx] = 1;
            queue.offer(nx);
          }
        }
      }
      answer++;
    }

    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main32_1 T = new Main32_1();
    int s = sc.nextInt();
    int e = sc.nextInt();

    System.out.println(T.solution(s, e));
  }
}
