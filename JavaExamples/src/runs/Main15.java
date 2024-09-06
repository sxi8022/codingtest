package runs;

import java.util.Scanner;
import java.util.Stack;

public class Main15 {
public int solution(int[][] board, int[] moves) {
  int answer = 0;
  Stack<Integer> stack = new Stack<>();

  for (int pos = 0; pos < moves.length; pos++) {
    for (int i = 0; i < board[0].length; i++) {
      if (board[i][moves[pos] -1] != 0) {
        int tmp = board[i][moves[pos] -1];
        board[i][moves[pos] -1] = 0;
        if (!stack.isEmpty() && tmp == stack.peek()) {
          stack.pop();
          answer += 2;
        } else {
          stack.push(tmp);
        }
        break;
      }
    }
  }

  return answer;
}

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  Main15 T = new Main15();
  int n = sc.nextInt();
  int[][] board = new int[n][n];

  for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
      board[i][j] = sc.nextInt();
    }
  }
  int m = sc.nextInt();
  int[] moves = new int[m];
  for (int i = 0; i < m; i++) {
    moves[i] = sc.nextInt();
  }

  System.out.println(T.solution(board, moves));
}
}
