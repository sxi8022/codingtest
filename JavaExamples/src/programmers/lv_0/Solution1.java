package programmers.lv_0;

import java.util.Scanner;

// 배열 두배 만들기
public class Solution1 {

    public int[] solution(int[] array) {
        int[] answer = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            answer[i] = array[i] * 2;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution1 T= new Solution1();
        System.out.println("배열 크기를 입력하세요.");
        int size = sc.nextInt();
        System.out.println("배열을입력해주세요.");
        int[] array = new int[size];
        for(int i = 0 ; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int[] answer = T.solution(array);
        for(int i = 0 ; i < answer.length; i++) {
            System.out.printf("%d " , answer[i]);
        }

    }

}
