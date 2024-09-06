package runs;

import java.util.Arrays;
import java.util.Scanner;

// 장난꾸러기
// https://cote.inflearn.com/contest/10/problem/06-06
public class Main26 {

  public int[] solution(int n, int[] nums) {
    int[] answer = new int[2];
    int[] sorted = nums.clone();

    Arrays.sort(sorted);
    int cnt = 0;
    for (int i = 0; i < n; i++) {
      if (cnt < 2) {
        if (nums[i] != sorted[i]) {
          answer[cnt] = i + 1;
          cnt ++;
        }
      } else {
        break;
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main26 T = new Main26();
    int n = sc.nextInt();
    int[] nums = new int[n];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = sc.nextInt();
    }
    for (int x : T.solution(n, nums)) {
      System.out.print(x + " ");
    }
  }
}
