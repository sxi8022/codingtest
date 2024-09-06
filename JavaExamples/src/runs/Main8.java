package runs;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

// https://cote.inflearn.com/contest/10/problem/04-02
// 아나그램 두문자열이 알파벳의 나열 순서를 다르지만 그 구성이 일치하면 두 단어는 아나그램이라한다.
public class Main8 {

  public String solution(String str1, String str2) {
    String answer = "YES";

    HashMap<Character, Integer> strMap = new HashMap<>();
    for (int i = 0; i < str1.length(); i++) {
      if (!strMap.containsKey(str1.charAt(i))) {
        strMap.put(str1.charAt(i), 1);
      } else {
        strMap.put(str1.charAt(i), strMap.get(str1.charAt(i)) + 1);
      }
    }

    for(Entry<Character, Integer> elem : strMap.entrySet()){
      for (int j = 0; j < str2.length(); j++) {
        if(elem.getKey().equals(str2.charAt(j))) {
          if(elem.getValue() == 0) {
            answer = "NO";
            return answer;
          } else {
            strMap.put(str2.charAt(j), strMap.get(elem.getKey()) - 1);
          }
        }
      }
    }

    for(Entry<Character, Integer> elem : strMap.entrySet()){
      if (elem.getValue() != 0) {
        answer = "NO";
        return answer;
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main8 T = new Main8();
    String str1 = sc.next();
    String str2 = sc.next();
    System.out.println(T.solution(str1, str2));
  }
}
