package runs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// https://cote.inflearn.com/contest/10/problem/07-08
// 송아지 찾기 1(BFS : 상태트리탐색)
public class Main32 {

  public int solution(int s, int e) {
    int[] move = {1, 5, -1};
    int[] ch = new int[10001];
    int answer = 0;
    Queue<Integer> queue = new LinkedList<>();
    queue.offer(s);
    while (!queue.isEmpty()) {
      for (int i = 0; i < queue.size(); i++) {
        int x = queue.poll();
        for (int j = 0; j < move.length; j++) {
          int nx = x + move[j];
          if (x == e) {
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
    Main32 T = new Main32();
    int s = sc.nextInt();
    int e = sc.nextInt();
    System.out.println(T.solution(s, e));
  }
}
