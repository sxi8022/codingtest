package runs;

import java.util.Scanner;

public class Main6 {

  public int solution(int n) {
    int answer = 0;
    int sum = 0;

    for (int i =1; i < n; i++) {
      sum = 0;
      for(int j = i; j < n; j++) {
        sum+= j;
        if (sum == n) {
          answer++;
          break;
        }
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    Main6 T = new Main6();
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    System.out.println(T.solution(n));

  }
}
