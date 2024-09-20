package baekjoon.bronze;

import java.util.Scanner;


// 팩토리얼 2
// https://www.acmicpc.net/submit/27433
public class Main4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N < 0 || N > 20) return;
        System.out.println(factorial(N));

    }

    public static long factorial(int n) {
        if (n==0 || n == 1) {
            return 1;
        } else {
           return n * factorial(n -1);
        }
    }
}
