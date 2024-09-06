package runs;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// https://cote.inflearn.com/contest/10/problem/04-05
// k 번째 큰 수 합
public class Main12 {

  public int solution(int n, int k, int[] nums) {
    int answer = 0;

    LinkedHashSet<Integer> sets = new LinkedHashSet<>();
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        for (int l = j + 1; l < n; l++) {
          sets.add(nums[i]+nums[j]+nums[l]);
        }
      }
    }

    List<Integer> list = new LinkedList<>(sets);
    Collections.sort(list, Collections.reverseOrder());
    if (list.size() >= k) {
      answer = list.get(k-1);
    } else {
      answer = -1;
    }

    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main12 T = new Main12();
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }
    System.out.println(T.solution(n, k, nums));
  }
}
