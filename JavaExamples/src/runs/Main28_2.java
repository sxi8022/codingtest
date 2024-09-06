package runs;

import java.util.Arrays;
import java.util.Scanner;

public class Main28_2 {
public int solution(int n , int m , int[] nums) {
  int answer = 0;
  int rt = n -1;
  int lt = 0;
  Arrays.sort(nums);
  while (rt >= lt) {
    int mid = (lt + rt) / 2;

    if (nums[mid] == m) {
      answer = mid + 1;
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
  Main28_2 T = new Main28_2();
  int n = sc.nextInt();
  int m = sc.nextInt();
  int[] nums = new int[n];
  for (int i = 0; i < n; i++) {
    nums[i] = sc.nextInt();
  }
  System.out.println(T.solution(n,m, nums));
}
}
