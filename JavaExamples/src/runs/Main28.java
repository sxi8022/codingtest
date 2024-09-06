package runs;

import java.util.Arrays;
import java.util.Scanner;

public class Main28 {

  public int solution(int n, int m, int[] nums) {
    int answer = 0;
    Arrays.sort(nums);
    int lt = 0;
    int rt = n-1;
    while (lt <= rt) {
      int mid = (lt + rt) / 2;
      if (nums[mid] == m) {
        answer = mid +1;
        break;
      }
      if (nums[mid] > m) {
        rt = mid -1;
      } else {
        lt = mid + 1;
      }
    }
    
    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main28 T = new Main28();
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }
    System.out.println(T.solution(n, m, nums));
  }
}
