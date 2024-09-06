package runs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// https://cote.inflearn.com/contest/10/problem/04-03
// 매출액의 종류
public class Main10 {

  public ArrayList<Integer> solution(int n, int k, int[] array) {
    ArrayList<Integer> answer = new ArrayList<>();
    HashMap<Integer, Integer> hMap = new HashMap<>();
    int lt = 0;
    for (int i = 0; i < k-1; i++) {
      hMap.put(array[i], hMap.getOrDefault(array[i], 0) + 1);
    }

    for (int rt = k -1 ; rt < n; rt ++) {
      hMap.put(array[rt], hMap.getOrDefault(array[rt], 0) + 1);
      answer.add(hMap.size());
      hMap.put(array[lt], hMap.get(array[lt]) -1);
      if (hMap.get(array[lt]) == 0) {
        hMap.remove(array[lt]);
      }
      lt++;
    }


    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main10 T = new Main10();
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] array = new int[n];

    for (int i = 0; i < n; i++) {
      array[i] = sc.nextInt();
    }

    ArrayList<Integer> answer = T.solution(n, k, array);
    for (int x : answer) {
      System.out.print(x + " ");
    }
  }
}
