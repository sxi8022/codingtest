package runs.day2;

import java.util.Scanner;
import programmers.lv_1.Solution;

public class Main1 {

  static int n = 0;
  static int f = 0;

  static boolean flag = false;
  static int[] arr;
  static boolean[] visited;
  static int[] output;

  static void dfs(int l, int n, int r) {
    if (l == r) {
      if (isAnswer(output)) flag = true;
      return;
    }
    for (int i = 0; i < n; i++) {
      if (flag) return;
      if (!visited[i]) {
        visited[i] = true;
        output[l] = arr[i];
        dfs(l+1, n, r);
        visited[i] = false;
      }
    }
  }

  static boolean isAnswer(int[] tmp) {
    int[] ch = tmp.clone();
    for (int j = ch.length -1; j > 0; j--) {
      for (int i = 0; i < j; i++) {
      ch[i] = ch[i] + ch[i+1];
      }
    }
    return ch[0] == f;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution T = new Solution();
    n = sc.nextInt();
    f = sc.nextInt();
    arr = new int[n];
    visited = new boolean[n];
    output = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = i + 1;
      visited[i] =false;
    }
    int l = 0;
    dfs(l, n , n);
    for (int i = 0; i < n; i++) {
      System.out.print(output[i] + " ");
    }
  }
}
