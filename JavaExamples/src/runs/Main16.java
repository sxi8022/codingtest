package runs;

import java.util.Scanner;
import java.util.Stack;

// 후위식 연산
// https://cote.inflearn.com/contest/10/problem/05-04
public class Main16 {

  public int solution(String reg) {
    int answer = 0;
    Stack<Integer> stack = new Stack<>();
    for (char x : reg.toCharArray()) {
      if (x >= 48 && x <= 57) stack.push(x-48);
      else {
        int rt = stack.pop();
        int lt = stack.pop();
        if (x == '+') stack.push(lt + rt);
        else if (x == '-') stack.push(lt - rt);
        else if (x == '*') stack.push(lt * rt);
        else if (x == '/') stack.push(lt / rt);
      }
    }
    answer = stack.get(0);
    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main16 T = new Main16();
    String reg = sc.next();

    System.out.println(T.solution(reg));
  }
}
