package programmers.lv_1;

import java.util.HashSet;
import java.util.Scanner;

// https://school.programmers.co.kr/learn/courses/30/lessons/12928
// 약수의합
public class Solution9 {
  public int solution(int num) {
   // 대량의 데이터일경우  사용하는 방식
    HashSet<Integer> set = new HashSet<Integer>();
    for(int i=1; i<=Math.sqrt(num); i++) {
      if(num % i == 0) {
        set.add(i);
        set.add(num / i);
      }
    }

    return set.stream().mapToInt(Integer::intValue).sum();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution9 T = new Solution9();
    System.out.println("정수입력");
    int num = sc.nextInt();
    System.out.println(T.solution(num));
  }
}

/*

기존 풀이법
    for (int i = 1; i <= num; i++) {
       if (num % i ==0) {
         answer += i;
       }
    }

* 
* */