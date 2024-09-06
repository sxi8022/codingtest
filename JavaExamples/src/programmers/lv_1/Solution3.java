package programmers.lv_1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution3 {


  public int solution(int n, int[] lost, int[] reserve) {
    int answer = n - lost.length;

    Arrays.sort(lost);
    Arrays.sort(reserve);

    for (int i = 0; i < lost.length; i++) {
      for (int j = 0;  j < reserve.length; j++) {
         if (lost[i] == reserve[j]) {
           answer++;
           lost[i] = -1;
           reserve[j] = -1;
           break;
         }
      }
    }
    for (int i = 0; i < lost.length; i++) {
      for (int j = 0;  j < reserve.length; j++) {
            if ((lost[i] -1 == reserve[j]) || (lost[i] + 1 == reserve[j])) {
                answer++;
                reserve[j] = -1;
                break;
            }
      }
    }

      return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution3 T = new Solution3();
    System.out.println("전체학생 수를 입력");
    int n = sc.nextInt();
    System.out.println("체육복을 도난당한 학생들의 번호가 담긴 배열의 길이를 입력");
    int robLength = sc.nextInt();
    int[] lost = new int[robLength];
    for (int i = 0; i < robLength; i++) {
      System.out.println("체육복을 도난당한 학생들의 번호 입력하세요.");
      lost[i] = sc.nextInt();
    }

    System.out.println("여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 배열의 길이를 입력");
    int reserveLength = sc.nextInt();
    int[] reserve = new int[reserveLength];
    for (int i = 0; i < reserveLength; i++) {
      System.out.println("여벌의 체육복을 가져온 학생들의 번호 입력하세요.");
      reserve[i] = sc.nextInt();
    }
    int answer = T.solution(n, lost, reserve);
    System.out.println(answer);


  }
}
