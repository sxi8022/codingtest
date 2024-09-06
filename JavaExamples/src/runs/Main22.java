package runs;

import java.util.Scanner;

// 버블정렬
// https://cote.inflearn.com/contest/10/problem/06-02
public class Main22 {

  public int[] solution(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = 0; j < nums.length - i - 1; j++) {
        if (nums[j] > nums[j+1]) {
         int tmp = nums[j+1];
         nums[j+1] = nums[j];
         nums[j] = tmp;
        }
      }
    }
    
    
    return nums;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main22 T = new Main22();
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
