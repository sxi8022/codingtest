package runs;

import java.util.Scanner;

// 최대 매출
public class Ex3 {

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
    Scanner sc = new Scanner(System.in);
    Ex3 T = new Ex3();
    System.out.println("매출기록을 입력할 기간입력");
    int n = sc.nextInt();
    System.out.println("k일 동안의 최대 매출액");
    int k = sc.nextInt();

    if (n < 5 || n > 100000) {
      System.exit(-1);
    }

    if (k < 2 || k > n) {
      System.out.println("2보다 작거나 n보다 클 수 없습니다.");
      System.exit(-1);
    }
    System.out.println("각 날짜에 대한 매출값을 입력하세요.");
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println(T.solution(n, k, arr));


  }
}
