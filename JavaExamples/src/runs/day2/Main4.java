package runs.day2;

import java.util.Scanner;

public class Main4 {

  static int[] comp;
  static int n, m;

  public void DFS(int l, int s) {
    if (l == m) {
      for(int x : comp) System.out.print(x + " ");
      System.out.println();
    } else {
      for (int i = s; i <= n; i++) {
        comp[l] = i;
        DFS(l+1, i+1);
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main4 T = new Main4();
    n = sc.nextInt();
    m = sc.nextInt();
    comp = new int[m];
    T.DFS(0, 1);
  }
}
