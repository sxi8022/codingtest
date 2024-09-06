package runs;

import java.util.Scanner;

public class Main {

  public int solution(int n, int k, int[] arr) {
    int answer, sum = 0;

    for (int i = 0; i < k; i++) {
      sum += arr[i];
    }
    answer = sum;

    for (int i = k; i < n; i++) {
      sum += arr[i];
      sum -= arr[i-k];
      answer = Math.max(answer, sum);
    }

    return answer;
  }

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    Main T = new Main();
    int n = kb.nextInt();
    int k = kb.nextInt();
    int[] arr = new int[n];


    if (n < 5 || n > 100000) {
      System.exit(-1);
    }

    for (int i = 0; i < n; i++) {
      arr[i] = kb.nextInt();
    }
    System.out.println(T.solution(n, k, arr));

  }
}
