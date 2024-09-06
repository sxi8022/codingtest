package runs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 동전 교환
//https://cote.inflearn.com/contest/10/problem/08-05
public class MainB1 {
  static int n, m, answer = Integer.MAX_VALUE;



  public void DFS(int l , int sum, Integer[] arr) {
    if(sum > m) return;
    if(l >= answer) return;
    if (sum == m ) {
      answer = Math.min(answer, l);
    } else {
      for (int i = 0 ; i <n; i ++) {
        DFS (l+1, sum+arr[i], arr);
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    MainB1 T = new MainB1();
    n = sc.nextInt();
    Integer[] arr = new Integer[n];
    for (int i =0; i < n; i++) arr[i] = sc.nextInt();
    Arrays.sort(arr, Collections.reverseOrder());
    m = sc.nextInt();
    T.DFS(0, 0 , arr);
    System.out.println(answer);
  }
}
