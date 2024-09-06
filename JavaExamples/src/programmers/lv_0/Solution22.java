package programmers.lv_0;

import java.util.Arrays;
import java.util.Scanner;

// 정사각형 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/181830
public class Solution22 {
    public int[][] solution(int[][] array) {
        int rowLength = array.length;
        int colLength = array[0].length;
        int max = rowLength > colLength ? rowLength : colLength;

        int[][] answer = new int[max][max];


        for (int i = 0 ; i < max; i++) {
            for (int j = 0; j < max; j++) {
                if (j <= colLength-1 && i <= rowLength-1) {
                    answer[i][j] = array[i][j];
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution22 T= new Solution22();
        System.out.println("행 배열 크기를 입력하세요.");
        int listSizeRow = sc.nextInt();
        if(listSizeRow < 1 || listSizeRow > 100) {
            System.out.println("배열크기는 1에서 100사이로 입력해주세요");
            System.exit(-1);
        }
        System.out.println("열 배열 크기를 입력하세요.");
        int listSizeCol = sc.nextInt();
        if(listSizeCol < 1 || listSizeCol > 100) {
            System.out.println("배열크기는 1에서 100사이로 입력해주세요");
            System.exit(-1);
        }

        int[][] array = new int[listSizeRow][listSizeCol];

        for(int i =0 ; i <listSizeRow; i++) {
          for(int j = 0 ; j <listSizeCol; j++) {
              System.out.println((i+1)+"번째 행 "+(j+1)+"번째 열 "+"의 숫자를입력해주세요.");
              array[i][j] = sc.nextInt();
          }
        }

        int[][] answer = T.solution(array);
        System.out.println(Arrays.deepToString(answer));
    }
}
