package programmers.lv_0;

import java.util.Arrays;
import java.util.Scanner;

public class Solution28 {
  public int[][] solution(int[] numlist, int n) {
    int col_length = numlist.length / n;
    int[][] answer = new int[col_length][n];
    for (int i = 0 ; i <col_length; i++) {
       for (int j = 0; j <n; j++) {
          answer[i][j] = numlist[i*n+j];
       }
    }

    return answer;
  }


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution28 T = new Solution28();


    System.out.println("배열 크기를 입력하세요.");
    int listSize = sc.nextInt();


    System.out.println("정수 n을 입력하세요.");
    int n = sc.nextInt();

    if (n >= listSize || n <2 ) {
      System.out.println("정수 n은 2보다 크거나 같고 배열 크기보다는 작아야합니다.");
      System.exit(-1);
    }

    if (listSize % n != 0 || (listSize > 150 || listSize < 0)) {
      System.out.println("배열길이는 0에서 150 사이, n의 배수가 되어야합니다.");
      System.exit(-1);
    }

    int[] numlist = new int[listSize];

    for (int i =0; i< listSize; i++) {
      System.out.println("배열값을 입력하세요.");
      int b = sc.nextInt();
      numlist[i] = b;
    }
    int[][] answer = T.solution(numlist, n);
    System.out.println(Arrays.deepToString(answer));

  }

}
