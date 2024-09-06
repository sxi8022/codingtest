package runs;

import java.util.Scanner;
// 배열 중복확인
// https://cote.inflearn.com/contest/10/problem/06-05
public class Main25 {

  public char solution(int[] nums) {
    char answer = 'U';
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          answer = 'D';
          return answer;
        }
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
    Main25 T = new Main25();
    System.out.println(T.solution(nums));
  }
}
