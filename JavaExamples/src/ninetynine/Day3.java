package ninetynine;

import java.util.Scanner;

public class Day3 {

    public String[] solution(int t, int[] cntArr, String[] strArr) {
        String[] answer = new String[t];
        for (int i = 0 ; i < t; i ++) {
            int repeatCount = cntArr[i];
            String inputStr = strArr[i];
            StringBuilder sb = new StringBuilder();

            for (char c : inputStr.toCharArray()) {
                sb.append(String.valueOf(c).repeat(Math.max(0, repeatCount)));
            }
            answer[i] = sb.toString();
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Day3 day3 = new Day3();
        int t = sc.nextInt();
        int[] cntArr = new int[t];
        String[] strArr = new String[t];

        for (int i =0; i < t; i++) {
            cntArr[i] = sc.nextInt();
            strArr[i] = sc.next();
        }
        String[] answer = day3.solution(t, cntArr, strArr);
        for (String str : answer) {
            System.out.println(str);
        }

    }
}
