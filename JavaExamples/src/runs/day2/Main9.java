package runs.day2;

import java.util.Scanner;
import programmers.lv_1.Solution;

// 순열구하기
public class Main9 {

  static int[] pm, ch, arr;
  static int n, m;

  public void DFS(int l) {
    if (l == m) {
      for(int x : pm) System.out.print(x + " ");
      System.out.println();
    } else {
      for (int i = 0; i < n; i++) {
        if (ch[i] ==0) {
            ch[i] = 1;
            pm[l] = arr[i];
            DFS(l+1);
            ch[i] = 0;
        }
      }
    }
  }


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main9 T = new Main9();
    n = sc.nextInt();
    m = sc.nextInt();
    arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    ch = new int[n];
    pm = new int[m];
    T.DFS(0);
    System.out.println();
  }
}
