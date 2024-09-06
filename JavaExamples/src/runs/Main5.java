package runs;

import java.util.Scanner;

public class Main5 {
  public int solution(int n, int m, int[] array) {
    int answer = 0;
    int sum = 0;
    int lt = 0;

    for (int rt = 0; rt < n; rt++) {
      sum += array[rt];
      if (sum == m) {
        answer++;
      }
      while (sum >= m) {
        sum -= array[lt++];
        if (sum == m) {
          answer ++;
        }
      }

    }


    return answer;
  }

  public static void main(String[] args) {
    Main5 T = new Main5();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] array = new int[n];

    for (int i = 0; i < n; i++) {
      array[i] = sc.nextInt();
    }

    System.out.print(T.solution(n, m, array));

  }
}
