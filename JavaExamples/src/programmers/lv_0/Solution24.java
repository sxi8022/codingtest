package programmers.lv_0;

import java.util.*;

// 배열의 평균값
// https://school.programmers.co.kr/learn/courses/30/lessons/120817
public class Solution24 {
    public double solution(int[] arr) {
        double answer = 0 ;
        for (int i =0; i < arr.length; i++)
        {
            answer += arr[i];
        }
        String temp = String.format("%.1f", answer / arr.length);
        answer = Double.parseDouble(temp);

        return answer;
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution24 T = new Solution24();
        System.out.println("배열 크기를 입력하세요.");
        int listSize = sc.nextInt();
        if (listSize < 1 || listSize > 100) {
            System.out.println("배열크기는 1에서 100000사이로 입력해주세요");
            System.exit(-1);
        }

        System.out.println("배열을입력해주세요.");
        int[] arr = new int[listSize];
        sc.nextLine();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < 0 || arr[i] > 1000) {
                System.out.println("길이는 0~1000자 사이로 입력하세요.");
                System.exit(-1);
            }
        }

        double answer = T.solution(arr);
        System.out.println(answer);
    }
}
