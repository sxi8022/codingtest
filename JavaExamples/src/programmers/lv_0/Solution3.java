package programmers.lv_0;

import java.util.Scanner;

// 가위바위보
public class Solution3 {
    public String solution(String arr) {
        String answer = "";
        String tmpRef = "";

        for (int i=0; i <arr.length(); i++) {
            char at = arr.charAt(i);
            if (at == '2') {
                tmpRef = "0";
            } else if (at == '0') {
                tmpRef = "5";
            } else if (at == '5') {
                tmpRef = "2";
            }
            answer += tmpRef;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution3 T = new Solution3();
        Scanner sc = new Scanner(System.in);
        System.out.println("가위바위보횟수를 입력하세요 : ");
        int count = sc.nextInt();

        if (count <= 0 || count > 100) {
            System.exit(-1);
        }

        String arr = "";
        System.out.println("가위바위보에 해당하는 숫자를 각자 한번씩 입력해주세요 : 가위:2, 바위:0, 보:5");
        System.out.println();
        int ref = 0;
        for (int i = 0; i < count; i++) {
            ref = sc.nextInt();
            arr += ref;

        }

        System.out.println(T.solution(arr));

    }

}
