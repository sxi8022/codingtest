package runs;

import java.util.Scanner;
import programmers.lv_1.Solution;

public class MainBlue1 {
  static int[] pm;
  static int n, m;

public void DFS(int l) {
    if (l ==m) {
      for (int x : pm) {
        System.out.print(x + " ");
      }
      System.out.println();
    } else {
      for (int i = 1; i <= n; i++) {
        pm[l] = i;
        DFS(l+1);
      }

    }
}

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  MainBlue1 T = new MainBlue1();
   n =sc.nextInt();
   m = sc.nextInt();
   pm = new int[m];
  T.DFS(0);
}
}
