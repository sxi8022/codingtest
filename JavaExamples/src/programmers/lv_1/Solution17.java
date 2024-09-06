package programmers.lv_1;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

// 두 개 뽑아서 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/68644
public class Solution17 {

  public Set<Integer> solution(int[] arr) {
    int answer = 0;
    Set<Integer> list = new TreeSet<>();
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
          if (i != j) {
            if (list.add(arr[i] + arr[j]));
          }
      }
    }
    return list;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution17 T = new Solution17();
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println(T.solution(arr).toString());
  }
}
