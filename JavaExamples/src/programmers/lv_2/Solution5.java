package programmers.lv_2;

import java.util.Arrays;
import java.util.Scanner;

//https://school.programmers.co.kr/learn/courses/30/lessons/135807
// 숫자 카드 나누기
public class Solution5 {

    public int solution(int[] arrayA, int[] arrayB) {
     int answer =0;

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        int gcdA = arrayA[0];
        int gcdB = arrayB[0];
        // 최대 공약수 구하기
        for (int i = 1; i <arrayA.length; i ++) {
            gcdA = gcd(arrayA[i], gcdA);
            gcdB = gcd(arrayB[i], gcdB);
        }

        // 나눌 수 없는지 확인 , ex) a로는 나눠 지고 b로는 나눠 지면 안된다.
        if (!canDivide(arrayB, gcdA)) {
            answer = gcdA;
        }
        if (!canDivide(arrayA, gcdB)) {
            answer = Math.max(answer, gcdB);
        }


     return answer;
    }

    public static int gcd(int a, int b) {
         if (b == 0) return a;
         else return gcd(b, a%b);
    }

    public static boolean canDivide(int[] array, int gcd) {
        for (int num : array) {
            if (num%gcd ==0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution5 T = new Solution5();
        int n = sc.nextInt();
        int[] arrayA = new int[n];
        for (int i =0; i <n; i++) {
            arrayA[i] = sc.nextInt();
        }
        System.out.println();
        int m = sc.nextInt();
        int[] arrayB = new int[m];
        for (int j =0; j < m; j++) {
            arrayB[j] = sc.nextInt();
        }

        System.out.println(T.solution(arrayA, arrayB));
    }
}
