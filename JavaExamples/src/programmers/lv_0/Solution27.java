package programmers.lv_0;

import java.util.ArrayList;
import java.util.Scanner;

// https://school.programmers.co.kr/learn/courses/30/lessons/120905
//정수 n과 정수 배열 numlist가 매개변수로 주어질 때, numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.
public class Solution27 {

  public ArrayList<Integer> solution (int n, int[] numlist) {
    ArrayList<Integer> answer = new ArrayList<>();

    for (int i = 0 ; i < numlist.length; i++) {
        if(numlist[i] % n == 0) {
           answer.add(numlist[i]);
        }
    }




    return answer;
  }


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution27 T = new Solution27();

    System.out.println("정수 n을 입력하세요.");
    int n = sc.nextInt();


    System.out.println("배열 크기를 입력하세요.");
    int listSize = sc.nextInt();


    if (listSize < 1 || listSize > 100) {
      System.out.println("배열크기는 1에서 100 사이로 입력해주세요");
      System.exit(-1);
    }

    int[] numlist = new int[listSize];

    for (int i =0; i< listSize; i++) {
      System.out.println("배열값을 입력하세요.");
      int b = sc.nextInt();
      if (b < 1 || b > 100000) {
        System.out.println("배열값은 1에서 100000 사이로 입력해주세요");
        System.exit(-1);
      }
      numlist[i] = b;
    }
    ArrayList<Integer> answer = T.solution(n, numlist);
    System.out.println(answer.toString());



  }
}
