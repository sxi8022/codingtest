package programmers.lv_1;

import java.util.Scanner;

public class Solution5 {

  public int solution(int[] absolutes, boolean[] signs) {
    int answer = 0;

    for (int i = 0; i < absolutes.length; i++) {
      int temp = 0;
      if (signs[i]) {
        temp = absolutes[i];
      } else {
        temp = absolutes[i] * -1;
      }
      answer += temp;
    }

    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("배열길이입력");
    Solution5 T = new Solution5();
    int n = sc.nextInt();
    int[] absolute = new int[n];
    boolean[] signs = new boolean[n];
    for (int i = 0; i < n; i++) {
      System.out.println("배열값입력");
      absolute[i] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
      System.out.println("부호값입력 1: true 0: false");
      signs[i] = (sc.nextInt() == 1 ? true : false);
    }
    System.out.println(T.solution(absolute, signs));
  }
}
