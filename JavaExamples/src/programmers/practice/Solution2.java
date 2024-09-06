package programmers.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Solution2 {
public int[] solution(int n) {
  int[] answer = new int[n];
  for (int i = 1; i <= n; i++) {
    answer[i-1] = i;
  }
  return answer;
}

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  Solution2 T = new Solution2();
  int n = sc.nextInt();
  System.out.println(Arrays.toString(T.solution(n)));
}

}
