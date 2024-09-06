package programmers.lv_0;

import java.util.InputMismatchException;
import java.util.Scanner;

// 정수 num과 k가 매개변수로 주어질 때, num을 이루는 숫자 중에 k가 있으면
// num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
public class Solution11 {
    public int solution (int num, int k) {
        int answer = -1;
        int[] array = new int[String.valueOf(num).length()];

        for (int i = 0 ; i < array.length; i++) {
            array[i] = Character.getNumericValue(String.valueOf(num).charAt(i));
        }

        for (int i = 0 ; i < array.length; i++) {
            if (array[i] == k) {
                answer = i+1;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution11 T = new Solution11();
        System.out.println("숫자를 입력하세요.");
        try {
            int targetNum = sc.nextInt();
            if (targetNum < 1 || targetNum >= 1000000) {
                System.out.println("문자열의 길이는 1이상 1000000 미만이어야 합니다.");
                System.exit(-1);
            }
            System.out.println("검색할 숫자를 입력하세요.");
            int selectNum = sc.nextInt();
            if (selectNum < 1 || selectNum >= 10) {
                System.out.println("문자열의 길이는 1이상 10 미만이여야 합니다.");
                System.exit(-1);
            }


            int answer = T.solution(targetNum, selectNum);
            System.out.println(answer);
        } catch (InputMismatchException e) {
            System.out.println("자리수를 넘어섰습니다.");
            System.exit(-1);
        }

    }
}
