package programmers.lv_1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution22 {

    public int[][] solution(int[][] square, int k) {
        int startSize =  square[0].length;
        int endSize = startSize; //초기화
        for (int j=0; j < k; j++) {
            endSize *= 2;
        }

        int[][] answer = new int [endSize][endSize];

        // 가장 왼쪽 상단에 복사
        for (int i= 0; i < startSize; i++) {
            for (int j = 0; j <startSize; j++) {
                answer[i][j] = square[i][j];
            }
        }

        for(int c = 0; c < k; c++) {
            // 오른쪽 복사

        }

        // k 번 확장
//        for (int c =0; c < k; c++) {
//            // 오른쪽 복사
//            for (int i = 0; i < endSize; i++) {
//                for (int j = 0; j < endSize; j++) {
//                    answer[i][j+startSize] = answer = answer[i][endSize - j -1];
//                }
//            }
//
//        }



        // 오른쪽 복사
        for (int i= 0; i < startSize; i++) {
            for (int j = startSize; j <endSize; j++) {
                answer[i][j] = square[i][j - startSize];
            }
        }

        // 아래쪽 복사
        for (int i= startSize; i < endSize; i++) {
            for (int j = 0; j <endSize; j++) {
                answer[i][j] = answer[i - startSize][j];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution22 T = new Solution22();
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        for (int i =0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] answer = T.solution(arr, n);
        System.out.println(Arrays.toString(answer));
    }
}
