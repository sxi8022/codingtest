package runs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main36 {

  static int n, m = 0;
  static ArrayList<ArrayList<Integer>> graph;
  static int[] ch, dis;

  public void solution(int v) {
    Queue<Integer> que = new LinkedList<>();
    ch[v] = 1;
    dis[v] = 0;
    que.offer(v);
    while (!que.isEmpty()) {
      int current = que.poll();
      for (int nv : graph.get(current)) {
        if (ch[nv] == 0) {
          ch[nv] = 1;
          que.offer(nv);
          dis[nv] = dis[current] + 1;
        }
      }
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main36 T = new Main36();
    n = sc.nextInt(); // 정점의 개수
    m = sc.nextInt(); // 간선의 개수
    graph = new ArrayList<ArrayList<Integer>>();
    for (int i = 0; i <= n; i++) {
      graph.add(new ArrayList<Integer>());
    }
    ch = new int[n + 1];
    dis = new int[n + 1];
    for (int i = 0; i < m; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      graph.get(a).add(b);
    }
    T.solution(1);
    for (int i = 2; i <= n; i++) {
      System.out.println(i + " : " + dis[i]);
    }
    System.out.println();
  }
}

/*
6 9
1 3
1 4
2 1
2 5
3 4
4 5
4 6
6 2
6 5
*
* */