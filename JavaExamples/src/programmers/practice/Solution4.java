package programmers.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Solution4 {

  public int[] solution(int day, int k) {
    int[] answer = new int[12];
    int tmpDay = day;
    int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
    for (int i = 0; i < days.length; i++) {
      for (int j = 1; j <= days[i]; j++) {
              if (j == k) {
                if (tmpDay < 5) {
                  answer[i] = 0;
                } else {
                  answer[i] = 1;
                }
              }
              tmpDay++;
                 if (tmpDay > 6) {
                   tmpDay = 0;
                 }

      }
    }
    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution4 T = new Solution4();
    int day = sc.nextInt();
    int k = sc.nextInt();

    System.out.println(Arrays.toString(T.solution(day, k)));
  }
}
