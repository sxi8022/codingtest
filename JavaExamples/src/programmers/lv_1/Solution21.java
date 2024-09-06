package programmers.lv_1;

import java.util.Arrays;
import java.util.Scanner;

class Solution21 {
    public int[] solution(int[][] v) {
        int[] answer = new int[2];
        for (int i = 0; i < answer.length; i++) {
            if (v[0][i] == v[1][i]) {
                answer[i] = v[2][i];
            } else if (v[0][i] == v[2][i]) {
                answer[i] = v[1][i];
            } else {
                answer[i] = v[0][i];
            }
        }
        System.out.println("Hello Java");

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
Solution21 T = new Solution21();
        int n = 3;
        int[][] arr = new int[3][2];
        for (int i =0; i <3; i++) {
            for (int j = 0; j <2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
       int[] answer = T.solution(arr);
        System.out.println(Arrays.toString(answer));
    }
}