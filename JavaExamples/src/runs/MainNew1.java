package runs;

import java.util.Scanner;

public class MainNew1 {
  static int answer = Integer.MIN_VALUE, n, m;
  boolean flag = false;

public void DFS(int l, int sum, int time, int[] solve, int[] take) {
  if (time > m) return;
  if (l == n) {
    answer = Math.max(answer, sum);
  } else {
    DFS(l+1, sum+solve[l], time +take[l], solve, take);
    DFS(l+1, sum, time, solve, take);
  }
}

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  MainNew1 T = new MainNew1();
   n = sc.nextInt();
   m = sc.nextInt();
  int[] solve = new int[n];
  int[] take = new int[n];
  for (int i = 0; i < n; i++) {
    solve[i] = sc.nextInt();
    take[i] = sc.nextInt();
  }
  T.DFS(0,0,0,solve, take);
  System.out.println(answer);
}
}
