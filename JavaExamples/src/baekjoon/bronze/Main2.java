package baekjoon.bronze;

import java.util.Scanner;

// x 보다 작은 수
// https://www.acmicpc.net/problem/10871
public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] arr = new int[N];
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            int temp = sc.nextInt();
            if (temp < X) {
                System.out.print(temp + " ");
            }
        }
    }
}
