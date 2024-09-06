package programmers.lv_1;

import java.util.Scanner;

// https://school.programmers.co.kr/learn/courses/30/lessons/12944
// 평균구하기
public class Solution7 {

  public double solution(int[] arr) {
    double answer = 0;
    int sum = 0 ;
    double avg = 0.0;
    for (int i = 0; i < arr.length; i++) {
      sum+= arr[i];
    }
    answer = sum / (double) arr.length;

    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println();
    Solution7 T = new Solution7();

    System.out.println("정수 갯수 입력");
    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < arr.length; i++) {
      System.out.println("정수 입력");
      arr[i] = sc.nextInt();
    }

    System.out.println(T.solution(arr));


  }
}
