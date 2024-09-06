package programmers.lv_0;

import java.util.Scanner;

//두 정수 a, b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요.
//https://school.programmers.co.kr/learn/courses/30/lessons/181947
public class Solution18 {
    public String solution(int a, int b) {
        String answer = (a + " + " + b  + " = " + (a + b));
        return answer;
     }

    public static void main(String[] args) {
        Solution18 T = new Solution18();
        Scanner sc = new Scanner(System.in);
        // System.out.println("첫번째 수를 입력하세요.");
        int a = sc.nextInt();

        // System.out.println("두번째 수를 입력하세요.");
        int b = sc.nextInt();

        if (a < 1 || a  > 100 || b < 1 || b> 100 ) {
            System.exit(-1);
        }
        System.out.println(T.solution(a,b));
    }
}
