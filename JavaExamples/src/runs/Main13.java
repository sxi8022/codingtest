package runs;

import java.util.Scanner;
import java.util.Stack;

// https://cote.inflearn.com/contest/10/problem/05-01
public class Main13 {

  public String solution(String str) {
    String answer = "YES";
    Stack<Character> stack = new Stack<>();

    for (char x : str.toCharArray()) {
      if(x == '(') {
        stack.push(x);
      } else if (x == ')') {
        if(stack.isEmpty()) {
           return "NO";
        } else {
          stack.pop();
        }
      }
    }

    if (stack.isEmpty()) {
      return  answer;
    } else {
      return "NO";
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main13 T = new Main13();
    String str = sc.next();
    System.out.println(T.solution(str));
  }
}
