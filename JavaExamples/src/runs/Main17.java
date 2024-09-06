package runs;

import java.util.Scanner;

// 선택정렬
// https://cote.inflearn.com/contest/10/problem/06-01
public class Main17 {

  public int[] solution(int[] nums) {

    for (int i = 0; i < nums.length - 1; i++) {
      int minIdx = i;
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[minIdx] > nums[j]) {
          minIdx = j;
        }
      }
      int tmp = nums[minIdx];
      nums[minIdx] = nums[i];
      nums[i] = tmp;
    }

    return nums;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main17 T = new Main17();
    int n = sc.nextInt();
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = sc.nextInt();
    }
    for (int x : T.solution(array)) {
      System.out.print(x + " ");
    }
  }
}
