package runs;

import java.util.Scanner;
import java.util.Stack;
import programmers.lv_1.Solution;

// 후위식 연산
// https://cote.inflearn.com/contest/10/problem/05-04
public class Main17_2 {

  public int solution(String str) {
    int answer = 0;
    Stack<Integer> stack = new Stack<>();
    for (char x : str.toCharArray()) {
      if (x >= 48 && x <= 57) {
        stack.push(x - 48);
      } else {
        int rt = stack.pop();
        int lt = stack.pop();
        if (x == '+') {
          stack.push(lt + rt);
        } else if (x == '*') {
          stack.push(lt * rt);
        } else if (x == '/') {
          stack.push(lt / rt);
        } else if (x == '-') {
          stack.push(lt - rt);
        }
      }
    }
    answer = stack.get(0);
    return answer;
  }




  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main17_2 T = new Main17_2();
    String str = sc.next();
    System.out.println(T.solution(str));
  }
}
