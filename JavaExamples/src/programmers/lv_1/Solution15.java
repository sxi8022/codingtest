package programmers.lv_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

// 완주하지 못한 선수 (해시 풀이)
// https://school.programmers.co.kr/learn/courses/30/lessons/42576
public class Solution15 {

  public String solution(String[] participant, String[] completion) {
    String answer = "";
    HashMap<String, Integer> map = new HashMap<>();
    for (String player : participant)
      map.put(player, map.getOrDefault(player, 0) + 1);
    for (String player : completion)
      map.put(player, map.get(player) - 1);

    Iterator<Entry<String, Integer>> iter = map.entrySet().iterator();

    while(iter.hasNext()){
      Map.Entry<String, Integer> entry = iter.next();
      if (entry.getValue() != 0){
        answer = entry.getKey();
        break;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution15 T = new Solution15();
    int n = sc.nextInt();
    int c = n - 1;
    String[] participant = new String[n];
    String[] completion = new String[c];
    sc.nextLine();
    for (int i = 0; i < n; i++) {
      participant[i] = sc.next();
    }
    for (int i = 0; i < c; i++) {
      completion[i] = sc.next();
    }
    System.out.println(T.solution(participant, completion));
  }
}

/*
테스트 1 〉	통과 (0.06ms, 76.9MB)
테스트 2 〉	통과 (0.08ms, 86.5MB)
테스트 3 〉	통과 (0.71ms, 77.9MB)
테스트 4 〉	통과 (0.67ms, 67.9MB)
테스트 5 〉	통과 (0.94ms, 77.7MB)
테스트 6 〉	통과 (0.05ms, 81.5MB)
테스트 7 〉	통과 (0.07ms, 73.9MB)
효율성  테스트
테스트 1 〉	통과 (43.83ms, 80.8MB)
테스트 2 〉	통과 (72.98ms, 88.7MB)
테스트 3 〉	통과 (189.24ms, 95.8MB)
테스트 4 〉	통과 (79.97ms, 96.6MB)
테스트 5 〉	통과 (66.15ms, 96MB)
*
* */