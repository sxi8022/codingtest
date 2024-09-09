package runs.day5;

// 뒤집은 소수

import java.util.ArrayList;
import java.util.Scanner;

//https://cote.inflearn.com/contest/10/problem/02-06
public class Main1 {

    public ArrayList<Integer> solution(int n, int[] arr) {
     ArrayList<Integer> answer = new ArrayList<>();
     for (int i = 0; i < arr.length; i++) {
         int tmp = arr[i];
         int res  = 0;
         while (tmp > 0) {
            res = res * 10 + (tmp % 10);
            tmp = tmp / 10;
         }
         if (isPrime(res)) {
             answer.add(res);
         }
     }

     return answer;
    }

    private boolean isPrime(int res) {
        if (res == 1) return false;
        for (int i = 2; i < res; i++) {
            if (res % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Main1 T = new Main1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        };
    }
}
