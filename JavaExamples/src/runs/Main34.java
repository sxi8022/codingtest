package runs;

import java.util.Arrays;
import java.util.Scanner;

// 사각형의 나머지 좌표 구하기
public class Main34 {

  public int[] solution(int[][] arr) {
    int[] answer = new int[2];
    int x, y = 0;
    if (arr[0][0] == arr[2][0]) {
      x = arr[1][0];
    } else if (arr[1][0] == arr[2][0]) {
      x = arr[0][0];
    } else {
      x = arr[2][0];
    }

    if (arr[0][1] == arr[2][1]) {
      y = arr[1][1];
    } else if (arr[1][1] == arr[2][1]) {
      y = arr[0][1];
    } else {
      y = arr[2][1];
    }
    answer[0] = x;
    answer[1] = y;

    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main34 T = new Main34();
    int count = 0;
    int[][] arr = new int[3][2];
    int x = 0;
    int y = 0;
    while (count < 3) {
      System.out.println("x, y 좌표를 입력하세요.");
      x = sc.nextInt();
      y = sc.nextInt();
      arr[count][0] = x;
      arr[count][1] = y;
      count++;
    }
    System.out.println(Arrays.toString(T.solution(arr)));
  }
}
