package programmers.lv_0;

import java.util.Arrays;
import java.util.Scanner;

// 2의 영역
//https://school.programmers.co.kr/learn/courses/30/lessons/181894
public class Solution17 {

    public int[] solution(int[] array) {
        int targetNum = 2;
        int startIdx = -1;
        int endIdx = -1;
        for (int i = 0 ; i < array.length; i++) {
            if(array[i] == targetNum) {
                if (startIdx == -1) {
                    startIdx = i;
                } else {
                    endIdx = i;
                }
            }
        }

        if (startIdx == -1 && endIdx == -1) {
            int[] answer2 = new int[1];
            answer2[0] = -1;
            return answer2;
        } else {
            if (startIdx != -1 && endIdx == -1) {
                endIdx = startIdx;
            }
            int answerArrSize = endIdx - startIdx + 1;
            int[] answer =  new int[answerArrSize];
            for (int i = 0; i < answerArrSize; i++) {
                answer[i] = array[i + startIdx];
            }

            return answer;
        }
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution17 T= new Solution17();
        System.out.println("배열 크기를 입력하세요.");
        int listSize = sc.nextInt();
        if(listSize < 1 || listSize > 100000) {
            System.out.println("배열크기는 1에서 100000사이로 입력해주세요");
            System.exit(-1);
        }

        System.out.println("배열을입력해주세요.");
        int[] num_list = new int[listSize];
        for(int i = 0 ; i < num_list.length; i++) {
            num_list[i] = sc.nextInt();
            if (num_list[i] <1 || num_list[i] > 10) {
                System.out.println("숫자길이는 1~10자 사이로 입력하세요.");
                System.exit(-1);
            }
        }
        int[] answer = T.solution(num_list);
        System.out.println(Arrays.toString(answer));
    }

}
