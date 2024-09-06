package runs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main20 {

  public String solution(String exp, String str) {
    String answer = "YES";
    Queue<Character> queue = new LinkedList<>();
    for (char x : exp.toCharArray()) {
      queue.add(x);
    }

    for (int i = 0; i < str.length(); i++) {
      char v = str.charAt(i);
      if (queue.contains(v)) {
        if (v != queue.peek()) return "NO";
        else queue.poll();
      }
    }

    if (!queue.isEmpty()) {
      answer = "NO";
    }

    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main20 T = new Main20();
    String exp = sc.nextLine();
    String str = sc.nextLine();
    System.out.println(T.solution(exp, str));
  }
}
