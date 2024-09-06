package programmers.lv_0;

import java.util.Scanner;

// 가장 큰 두수 곱하기 (최댓값 만들기)
public class Solution5 {

    public int solution (int[] array) {
        int answer = 0;

       for(int i =0; i < array.length; i++) {
           for (int j=0; j < array.length; j++) {
               if (i != j) {
                   if (answer < array[i] * array[j]) {
                       answer = array[i] * array[j];
                   }
               }
           }
       }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution5 T = new Solution5();
        System.out.println("원소 개수를 입력하세요.");

        int count = sc.nextInt();
        if (count < 2 || count > 100) {
            System.out.println("원소의개수는 2개이상 100개 이하여야 합니다.");
            System.exit(-1);
        }

        int[] array = new int[count];
        System.out.println("배열의 숫자를 입력해주세요.");
        for (int i =0; i < count; i++) {
            array[i] = sc.nextInt();
            if (array[i] < 0 || array[i] > 10000) {
                System.out.println("잘못된 숫자를입력하였습니다. 시스템을 종료합니다.");
                System.exit(-1);
            }
        }

        System.out.println(T.solution(array));
        /*for (int i = 0; i < count; i++) {
            System.out.printf("%d ", array[i]);
        }*/



    }
}
