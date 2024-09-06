package programmers.lv_1;

import java.util.Scanner;

public class Solution10 {

  public int solution(int n) {
    int answer = 0;
    String nStr = String.valueOf(n);

    for (int i = 0; i < nStr.length(); i++) {
       answer += (nStr.charAt(i) - '0');
    }

    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution10 T = new Solution10();
    System.out.println("자연수 입력");
    int n = sc.nextInt();

    System.out.println(T.solution(n));
  }
}
