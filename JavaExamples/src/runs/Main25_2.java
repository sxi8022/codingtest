package runs;

import java.util.Arrays;
import java.util.Scanner;

public class Main25_2 {
  public char solution(int[] nums) {
    char answer = 'U';
    Arrays.sort(nums);
    for (int i = 0; i < nums.length -1; i++) {
      if (nums[i] == nums[i+1]) {
        return 'D';
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }
    Main25_2 T = new Main25_2();
    System.out.println(T.solution(nums));
  }
}
