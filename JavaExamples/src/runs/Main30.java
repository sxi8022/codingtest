package runs;

import java.util.Scanner;

// 결정 알고리즘
//https://cote.inflearn.com/contest/10/problem/06-09
public class Main30 {

  public int solution(int n, int m, int[] arr) {
    int answer = 0;
    int lt = 0, rt = 0;
    for (int x : arr) {
      if (lt < x) {
        lt = x;
      }
      rt += x;
    }

    while (lt <= rt) {
      int mid = (lt + rt) / 2;
      if (count(arr, mid) <= m) {
        rt = mid - 1;
        answer = mid;
      } else {
        lt = mid + 1;
      }
    }

    return answer;
  }

  private int count(int[] arr, int mid) {
    int cnt = 1;
    int sum = 0;
    for (int x : arr) {
      if (sum + x > mid) {
        cnt ++;
        sum = x;
      } else {
        sum += x;
      }
    }

    return cnt;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main30 T = new Main30();
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println(T.solution(n,m,arr));
  }
}
