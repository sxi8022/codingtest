package programmers.lv_0;

import java.util.Scanner;

// 점의 위치 구하기
public class Solution4 {

    public int solution(int[] arr) {
        int answer = 0;

        if (arr[0] > 0 && arr[1] > 0) {
            answer = 1;
        } else if(arr[0] > 0 && arr[1] < 0) {
            answer = 4;
        } else if (arr[0] < 0 && arr[1] > 0) {
            answer = 2;
        } else if (arr[0] < 0 && arr[1] < 0) {
            answer = 3;
        }


        return answer;
    }


    public static void main(String[] args) {
        Solution4 T= new Solution4();
        Scanner sc = new Scanner(System.in);
        System.out.println("x와 y숫자를 입력하세요.");
        int[] dot = new int[2];

        for (int i = 0; i < dot.length; i++) {
            dot[i] = sc.nextInt();
        }

        System.out.println(T.solution(dot));
    }
}
