package runs;

import java.util.Scanner;
import programmers.lv_1.Solution;

// 삽입정렬
// https://cote.inflearn.com/contest/10/problem/06-03
public class Main23 {

  public int[] solution(int[] nums) {
    for (int i = 1; i < nums.length; i++) {
      for (int j = i-1; j >= 0; j--) {
        if (nums[j+1] < nums[j]) {
          int tmp = nums[j+1];
          nums[j+1]  = nums[j];
          nums[j] = tmp;
        } else {
          break;
        }
      }
    }
    return nums;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main23 T = new Main23();
    int n = sc.nextInt();
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }
    for (int x : T.solution(nums)) {
      System.out.print(x + " ");
    }

  }
}
