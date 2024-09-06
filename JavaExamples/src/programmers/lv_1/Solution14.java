package programmers.lv_1;

import java.util.Arrays;
import java.util.Scanner;

// 완주하지 못한 선수 (loop 반복문 풀이)
// https://school.programmers.co.kr/learn/courses/30/lessons/42576
public class Solution14 {

  public String solution(String[] participant, String[] completion) {
    String answer = "";
    Arrays.sort(participant);
    Arrays.sort(completion);
    int i = 0;
    for (i = 0; i < completion.length; i++) {
      if (!participant[i].equals(completion[i])) {
        return participant[i];
      }
    }

    return participant[i];
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution14 T = new Solution14();
    int n = sc.nextInt();
    int c = n - 1;
    String[] participant = new String[n];
    String[] completion = new String[c];
    sc.nextLine();
    for (int i = 0; i < n; i++) {
      participant[i] = sc.next();
    }
    for (int i = 0; i < c; i++) {
      completion[i] = sc.next();
    }
    System.out.println(T.solution(participant, completion));
  }
}
