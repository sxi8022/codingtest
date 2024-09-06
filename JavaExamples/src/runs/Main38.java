package runs;

import java.util.Scanner;

public class Main38 {

  static int answer = Integer.MIN_VALUE;
  static int c, n;


  public void DFS(int l, int sum, int[] arr) {
    if (sum > c) {
      return;
    }

    if (l == n) {
      answer = Math.max(answer, sum);
    } else {
      DFS(l+1, sum+arr[l], arr);
      DFS(l+1, sum, arr);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main38 T = new Main38();
    c = sc.nextInt();
    n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    T.DFS(0, 0, arr);
    System.out.println(answer);
  }
}
