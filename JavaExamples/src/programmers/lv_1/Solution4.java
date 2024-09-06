package programmers.lv_1;


import java.util.Scanner;

public class Solution4 {

  public int solution(int[] number) {
    int num = 0;

    for (int i = 0; i < number.length; i++) {
      for (int j = i+1; j < number.length; j++) {
        for (int k = j+1; k < number.length; k++) {
          if (number[i]+number[j]+number[k] == 0) {
            num++;
          }
        }
      }
    }




    return num;
  }


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution4 T = new Solution4();
    System.out.println("한국중학교학생 수 입력");
    int n = sc.nextInt();
    int[] number = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.println("학생번호 입력");
      number[i] = sc.nextInt();
    }

    System.out.println(T.solution(number));
  }
}
