package programmers.lv_2;

import java.util.Scanner;

public class Solution2 {

  public int solution(String name) {
    int answer = 0;
    int len = name.length();
    int min_move = len - 1;

    for (int i = 0; i < len; i++) {
      answer += Math.min(name.charAt(i) - 'A', 26 - (name.charAt(i) - 'A'));
      if (i < len -1 && name.charAt(i+1) == 'A') {
        int next = i + 1;
        while (next < len && name.charAt(next) == 'A') {
          next++;
        }
        min_move = Math.min(min_move, (i * 2) + name.length() - next);
        min_move = Math.min(min_move, i + (name.length() - next) * 2);
      }
    }

    return answer + min_move;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution2 T = new Solution2();
    String name = sc.nextLine();

    System.out.println(T.solution(name));
  }
}
