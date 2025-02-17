package ninetynine;

import java.util.Scanner;

public class Day11 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m =  arr[arr.length -1];
        int cnt = 1;
        for (int i = arr.length -2; i >= 0; i--) {
            if ( m < arr[i] ) {
                cnt++;
                m = arr[i];
            }
        }

        System.out.println(cnt);
    }
}
