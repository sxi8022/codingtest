package runs.day2;

import java.util.Scanner;

public class Main1_1 {

  static int n;
  static int f;

  static int[] b, p, ch;
  boolean flag = false;
  int[][] dy = new int[35][35];

  public int comp(int n, int r) {
    if (dy[n][r] > 0) {
      return dy[n][r];
    }
    if (n == r || r == 0) {
      return 1;
    } else {
      return dy[n][r] = comp(n - 1, r - 1) + comp(n - 1, r);
    }
  }

  public void DFS(int l, int sum) {
    if (flag) {
      return;
    }
    if (l == n) {
      if (sum == f) {
        for (int x : p) {
          System.out.print(x + " ");
        }
        flag = true;
      }

    } else {
      for (int i = 1; i <= n; i++) {
        if (ch[i] == 0) {
          ch[i] = 1;
          p[l] = i;
          DFS(l + 1, sum + (p[l] * b[l]));
          ch[i] = 0;
        }
      }
    }
  }


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main1_1 T = new Main1_1();
    n = sc.nextInt();
    f = sc.nextInt();
    b = new int[n];
    p = new int[n];
    ch = new int[n + 1];
    for (int i = 0; i < n; i++) {
      b[i] = T.comp(n - 1, i);
    }
    T.DFS(0, 0);
  }
}
