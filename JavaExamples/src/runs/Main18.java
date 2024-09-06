package runs;

import java.util.Scanner;
import java.util.Stack;
import programmers.lv_1.Solution;

// 쇠막대기 절단
// https://cote.inflearn.com/contest/10/problem/05-05
public class Main18 {

  public int solution(String str) {
    int answer = 0;
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < str.length(); i++) {
      char x = str.charAt(i);
      if (x == '(') {
        stack.push(x);
      } else if (x == ')') {
        if (stack.size() >0) {
           if (str.charAt(i-1) == '(' ) {
             stack.pop();
             answer += stack.size();
           } else {
             stack.pop();
             answer += 1;
           }
        }
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main18 T = new Main18();
    String str = sc.next();

    System.out.println(T.solution(str));
  }
}
