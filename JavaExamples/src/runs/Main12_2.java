package runs;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;



public class Main12_2 {

  public int solution(int n, int k , int[] nums) {
    int answer = 0;
    LinkedHashSet<Integer> sets = new LinkedHashSet<>();

    for (int i = 0; i < n; i++) {
      for (int j = i+1; j < n; j++) {
        for (int l = j+1; l < n; l++) {
          sets.add(nums[i] + nums[j] + nums[l]);
        }
      }
    }
    
    
    List<Integer> lists = new LinkedList<>(sets);
    Collections.sort(lists, Collections.reverseOrder());
    if (lists.size() >= k) {
      answer = lists.get(k -1);
    } else {
      answer =  -1;
    }



    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main12_2 T = new Main12_2();
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }
    System.out.println(T.solution(n, k, nums));
  }

}
