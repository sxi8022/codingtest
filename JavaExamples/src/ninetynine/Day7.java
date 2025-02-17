package ninetynine;

import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {
        final int r = 31;  // 31
        final int M = 1234567891;  // 1234567891

        // 변수 선언
        int len;
        String str;
        int alphaIndex;
        long powValue;
        long sum = 0;

        // 입력받기
        Scanner sc = new Scanner(System.in);
        len = sc.nextInt();     // 길이
        str = sc.next();        // 알파벳 string

        String[] strArray = str.split("");      // 입력받은 알파벳 String을 한글자씩 쪼개줘서 담아놓기

        powValue = (long) Math.pow(r, 0);   // == 1

        for(int i=0; i<len; i++) {
            alphaIndex = (int)(strArray[i].charAt(0))-96;   // 알파벳의 순서 번호
            sum += alphaIndex * powValue % M;
            powValue = (powValue * r) % M;  // 이전 r의 0승 값에다가 31을 계속 누적으로 곱해줘서 저장 (M을 나누는건 범위 안에 들어오게하기 위해)
        }

        sum = sum % M;      // 모든 계산 이후 mod M 수행까지 해야 진짜 정답
        System.out.println(sum);
    }
}
