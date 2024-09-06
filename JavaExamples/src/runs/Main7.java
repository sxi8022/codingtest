package runs;

import java.util.HashMap;
import java.util.Scanner;


// https://www.inflearn.com/course/lecture?courseSlug=%EC%9E%90%EB%B0%94-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%AC%B8%EC%A0%9C%ED%92%80%EC%9D%B4-%EC%BD%94%ED%85%8C%EB%8C%80%EB%B9%84&unitId=72739&tab=curriculum
// 학급회장 해쉬 구하기
public class Main7 {

public char solution(int n, String vote) {
  char answer = ' ';
  HashMap<Character, Integer> map = new HashMap<Character, Integer>();

  for (int i = 0; i < vote.length(); i++) {
      char tmp = vote.charAt(i);
      if(!map.containsKey(tmp)) {
        map.put(tmp, 1);
      } else {
        int currentValue = map.get(tmp);
        map.put(tmp, currentValue + 1);
      }
  }

  // Max Value
  for (Character key : map.keySet()) {
    if (answer == ' ' || map.get(key) > map.get(answer)) {
      answer = key;
    }
  }


  return answer;
}

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  Main7 T = new Main7();
  int n = sc.nextInt();
  String vote = sc.next();
  System.out.println(T.solution(n, vote));
}

}
