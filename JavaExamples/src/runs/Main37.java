package runs;

import java.util.Scanner;

public class Main37 {

  public static String answer = "NO";

  public static int n = 0;
  public static int total = 0;

  public static boolean flag = false;

  public void DFS (int l , int sum, int[] nums) {
    if (flag) return;
    if (sum > total / 2) return;
    if (l == n) {
      if ((total - sum) == sum) {
        answer = "YES";
        flag = true;
      }
    } else {
      DFS(l+1, sum+nums[l], nums);
      DFS(l+1, sum, nums);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main37 T = new Main37();
    n = sc.nextInt();
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
      total += nums[i];
    }
    T.DFS(0, 0, nums);
    System.out.println(answer);
  }
}
