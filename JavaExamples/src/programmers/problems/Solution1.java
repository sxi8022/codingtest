package programmers.problems;

import java.util.Arrays;
import java.util.Scanner;

// 선택정렬
public class Solution1 {

  public int[] solution(int[] arr, int[][] commands) {
    int[] answer = new int[commands.length];

    for (int i = 0; i < commands.length; i++) {
      int[] temp = new int[commands[i][1] - commands[i][0] + 1];
      int index = 0;
      for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
        temp[index++] = arr[j];
      }
      int[] sortedArr = sort(temp);
      answer[i] = sortedArr[commands[i][2] - 1];
    }
    return answer;
  }

  public int[] sort(int[] arr) {
    int[] result = arr.clone();
    for (int i = 0; i < result.length - 1; i++) {
      for (int j = i + 1; j < result.length; j++) {
        if (result[i] > result[j]) {
          int temp = result[i];
          result[i] = result[j];
          result[j] = temp;
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution1 T = new Solution1();
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("2차원배열의 행을 입력");
    int cn = sc.nextInt();

    System.out.println("2차원배열값 입력");
    int[][] commands = new int[cn][3];

    for (int i = 0; i < cn; i++) {
      for (int j = 0; j < 3; j++) {
        commands[i][j] = sc.nextInt();
      }
    }
    System.out.println(Arrays.toString(T.solution(arr, commands)));
  }

}

/*
7
1 5 2 6 3 7 4

2차원배열의 행을 입력
3

2차원배열값 입력

2 5 3
4 4 1
1 7 3

*
* */