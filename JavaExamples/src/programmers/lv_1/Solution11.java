package programmers.lv_1;

import java.util.Arrays;
import java.util.Scanner;

//https://school.programmers.co.kr/learn/courses/30/lessons/12954
//x만큼 간격이 있는 n개의숫자
public class Solution11 {

  public long[] solution(int x, int n) {
    long answer[] = new long[n];

    long num = 0;
    for (int i =0; i < n; i++) {
      num = num + x;
      answer[i] = num;
    }

    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution11 T = new Solution11();
    System.out.println("정수x입력");
    int x = sc.nextInt();
    if (x > 10000000 || x < -10000000) {
      System.out.println("x의 범위 초과");
      System.exit(-1);
    }

    System.out.println("자연수 n입력");
    int n = sc.nextInt();

    if (n > 1000 || n < 1) {
      System.out.println("자연수만입력하세요.");
      System.exit(-1);
    }

    System.out.println(Arrays.toString(T.solution(x, n)));
  }
}
