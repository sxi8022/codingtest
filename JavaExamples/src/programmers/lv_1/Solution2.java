package programmers.lv_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution2 {
  public int solution(int number, int limit, int power) {
    int answer = 0;

    int numCnt = 0; // 공격력
    ArrayList<Integer> result = new ArrayList<>();
    for (int i =1; i <= number; i++) {
      int numPartCnt = 0;
      for (int j = 1; j*j <= i; j++) {
            if (j * j == i) numPartCnt++;
            else if (i % j  == 0) numPartCnt +=2;
      }
      if (numPartCnt > limit) {
        numPartCnt = power;
      }

      result.add(numPartCnt);
    }

    for (int v : result) {
      answer += v;
    }


    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution2 T = new Solution2();

    System.out.println("기사단원의 수 입력");
    int number = sc.nextInt();

    System.out.println("이웃나라와 협약으로 정해진 공격력의 제한수치를 나타내는 정수 입력");
    int limit = sc.nextInt();

    System.out.println("제한수치를 초과한 기사가 사용할 무기의 공격력을 나타내는 정수 입력");
    int power = sc.nextInt();

    int answer = T.solution(number, limit, power);

    System.out.println(answer);

  }
}