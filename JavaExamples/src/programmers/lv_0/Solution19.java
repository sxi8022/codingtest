package programmers.lv_0;

import java.util.Scanner;

//flag에 따라 다른 값 반환하기
public class Solution19 {

    public int solution(int a , int b, boolean flag) {
        int answer = 0;
        if (flag) {
            answer = a + b;
        } else {
            answer = a - b;
        }
        return answer;
     }

    public static void main(String[] args) {
        Solution19 T = new Solution19();
        Scanner sc = new Scanner(System.in);
        String sc1 = sc.nextLine();
        boolean flag = false;
        if (sc1.equals("true")) {
            flag = true;
        }
        else
        {
            flag = false;
        }

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(T.solution(a, b, flag));

    }
}
