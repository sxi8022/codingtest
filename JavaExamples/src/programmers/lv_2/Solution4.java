package programmers.lv_2;


// https://school.programmers.co.kr/learn/courses/30/lessons/132265
// 롤케이크 자르기

import java.util.*;

public class Solution4 {

  public int solution(int[] topping) {
   int answer =0;


  Map<Integer, Integer> map_1 = new HashMap<>();
  Map<Integer, Integer> map_2 = new HashMap<>();

   if (topping.length < 2) return 0;

   for (int e : topping) {
       map_2.put(e, map_2.getOrDefault(e, 0) + 1);
   }

   for (int e : topping) {
       map_1.put(e, map_1.getOrDefault(e, 0) + 1);
       if (map_2.get(e) - 1 == 0) {
           map_2.remove(e);
       } else {
           map_2.put(e, map_2.get(e) -1);
       }

       if (map_1.size() == map_2.size()) {
           answer++;
       }
   }

   return answer;
  }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Solution4 T = new Solution4();
        int n = sc.nextInt();
        int[] topping = new int[n];
        for (int i = 0; i < n; i++) {
            topping[i] = sc.nextInt();
        }
        System.out.println(T.solution(topping));


    }
}
