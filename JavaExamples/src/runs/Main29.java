package runs;

import java.util.Scanner;

//https://cote.inflearn.com/contest/10/problem/06-09
// 뮤직비디오(결정알고리즘)
public class Main29 {

  public int solution(int n, int m, int[] arr) {
    int answer = 0;

    int max = 0 ;
    for (int x : arr) {
      if (max < x) {
        max = x;
      }
    }
    int lt = max;
    int rt = 0;
    for(int x : arr) {
      rt += x;
    }
    while (lt <= rt) {
      int mid = (lt + rt) /2;
      if (count(arr, mid) <= m) {
        answer =mid;
        rt =mid -1;
      }
      else lt = mid +1;
    }
    return answer;
  }

  private int count(int[] arr, int capacity) {
    int cnt =1 , sum =0;
    for (int x : arr) {
      if (sum + x> capacity) {
        cnt++;
        sum =x ;
      }
      else sum+=x;
    }
    return cnt;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main29 T = new Main29();
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0 ; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println(T.solution(n, m, arr));
  }
}
