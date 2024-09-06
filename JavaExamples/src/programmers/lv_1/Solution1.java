package programmers.lv_1;

import java.util.Arrays;
import java.util.Scanner;


// https://school.programmers.co.kr/learn/courses/30/lessons/77484
// 로또의 최고 순위와 최저 순위
public class Solution1 {
  public int[] solution(int[] lottos, int[] win_nums) {
      int zeroCnt = 0;
      int matched = 0 ;
      for (int i: lottos) {
        if (i == 0) zeroCnt++;
        else {
          for (int j: win_nums) {
              if (i == j) {
                matched++;
                break;
              }
          }
        }
      }
      int min = matched;
      int max = matched + zeroCnt;

      int[] answer = {Math.min(7-max, 6), Math.min(7-min,6)};


      return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution1 T = new Solution1();
    int[] lottos = new int[6];
    int[] win_nums = new int[6];
    for (int i = 0 ; i < lottos.length; i ++) {
      System.out.println("로또 번호를 입력해주세요 숫자 하나씩 엔터 1~45.");
      int a = sc.nextInt() ;
      if(a <0 || a > 45) {
          System.exit(-1);
      }
      lottos[i] = a;
    }

    for (int i = 0 ; i < lottos.length; i ++) {
      System.out.println("로또 당첨 번호를 입력해주세요 숫자 하나씩 엔터 입력 1~45.");
      int a = sc.nextInt() ;
      if(a <0 || a > 45) {
        System.exit(-1);
      }
      win_nums[i] = a;
    }
    System.out.println(Arrays.toString(T.solution(lottos, win_nums)));

  }
}