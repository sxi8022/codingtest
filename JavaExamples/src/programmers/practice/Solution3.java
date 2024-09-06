package programmers.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Solution3 {

  public String solution(String[] survey, int[] choices) {
    String answer = "";
    HashMap<Character, Integer> scores = new LinkedHashMap<>();
    ArrayList<Character> charList = new ArrayList<>();
    scores.put('R', 0);
    scores.put('T', 0);
    scores.put('C', 0);
    scores.put('F', 0);
    scores.put('J', 0);
    scores.put('M', 0);
    scores.put('A', 0);
    scores.put('N', 0);
    String[] indexes = {"RT", "CF", "JM", "AN"};
    for (int i = 0; i < survey.length; i++) {
      if (choices[i] == 1) {
        scores.put(survey[i].charAt(0), scores.get(survey[i].charAt(0)) + 3);
      } else if (choices[i] == 2) {
        scores.put(survey[i].charAt(0), scores.get(survey[i].charAt(0)) + 2);
      } else if (choices[i] == 3) {
        scores.put(survey[i].charAt(0), scores.get(survey[i].charAt(0)) + 1);
      } else if (choices[i] == 5) {
        scores.put(survey[i].charAt(1), scores.get(survey[i].charAt(1)) + 1);
      } else if (choices[i] == 6) {
        scores.put(survey[i].charAt(1), scores.get(survey[i].charAt(1)) + 2);
      } else if (choices[i] == 7) {
        scores.put(survey[i].charAt(1), scores.get(survey[i].charAt(1)) + 3);
      }
    }

    for (int i = 0; i < indexes.length; i++) {
      char first = indexes[i].charAt(0);
      char second = indexes[i].charAt(1);
      if (scores.get(first) < scores.get(second)) {
        charList.add(second);
      } else if (scores.get(first) > scores.get(second)) {
        charList.add(first);
      } else {
        if (first <= second) {
          charList.add(first);
        } else {
          charList.add(second);
        }
      }
    }

    for (char x : charList) {
      answer += x;
    }

    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution3 T = new Solution3();
    int n = sc.nextInt();
    String[] survey = new String[n];
    int[] choices = new int[n];
    for (int i = 0; i < n; i++) {
      survey[i] = sc.next();
    }
    for (int i = 0; i < n; i++) {
      choices[i] = sc.nextInt();
    }
    System.out.println(T.solution(survey, choices));
  }
}
