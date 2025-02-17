package ninetynine;

import java.util.Arrays;
import java.util.Scanner;

public class Day13 {

    public String[] findRelativeRanks(int[] score) {
        String[] answer = new String[score.length];

        // 원본 인덱스를 담는 배열
        Integer[] index = new Integer[score.length];
        for(int i = 0; i < score.length; i++) {
            index[i] = i;
        }

        // 인덱스 배열을 score 배열 기준 내림차순으로 정렬
        Arrays.sort(index, (i1, i2) -> score[i2] - score[i1]);

        for(int i = 0; i < index.length; i++) {
            //
            int idx = index[i];

            if(i == 0) {
                answer[idx] = "Gold Medal";
            } else if(i == 1) {
                answer[idx] = "Silver Medal";
            } else if(i == 2) {
                answer[idx] = "Bronze Medal";
            } else {
                answer[idx] = (i+1) + "";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Day13 t = new Day13();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
        }
        String[] answer =  t.findRelativeRanks(score);;
        for (String s : answer) {
            System.out.print(s + " ");
        }

    }

}
