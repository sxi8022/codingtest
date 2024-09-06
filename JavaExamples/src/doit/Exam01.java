package doit;

import java.util.Scanner;

public class Exam01 {

    public int solution(int[] arr, int n ){

        int answer = 0;
        int max = 0;
        int sum = 0;
        for (int i = 0; i < n ; i++) {
            sum += arr[i];
            if (max < arr[i]) max = arr[i];
        }

        answer = sum / max * 100 / n;
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exam01 T = new Exam01();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i ++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(arr, n));

    }
}
