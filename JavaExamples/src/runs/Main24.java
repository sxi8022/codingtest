package runs;

import java.util.Scanner;
// Least Recently Used (LRU) 가장 최근에 사용하지 않은 것들
//https://cote.inflearn.com/contest/10/problem/06-04
public class Main24 {

  public int[] solution(int s, int n, int[] nums) {

    int[] cash = new int[s];
    for (int i = 0; i < n; i++) {
      int pos = -1;
      for (int j = 0; j < s; j++) {
        if (nums[i] == cash[j]) pos=j;
      }
      if (pos == -1) {
        for (int k = s -1; k>=1; k--) {
          cash[k] = cash[k-1];
        }
      } else {
        for (int k = pos; k>= 1; k--) {
          cash[k] = cash[k-1];
        }
      }
      cash[0] = nums[i];
    }

    return cash;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main24 T = new Main24();
    int s = sc.nextInt();
    int n = sc.nextInt();
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }
    for (int x : T.solution(s, n, nums)) {
      System.out.print(x + " ");
    }
  }
}
