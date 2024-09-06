package runs;

import java.util.Scanner;
import java.util.Stack;

public class Main14 {
 public String solution(String str) {
   String answer = "";
   Stack<Character> stack = new Stack<>();
   for (char x : str.toCharArray()) {
     if (x == ')') {
       while (stack.pop() != '(') {
         stack.pop();
       }
     } else {
       stack.push(x);
     }

   }

   for (int i = 0 ; i < stack.size(); i++) {
     answer += stack.get(i);
   }

   return answer;
 }

 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   Main14 T = new Main14();
   String str = sc.next();
   System.out.println(T.solution(str));
 }
}
