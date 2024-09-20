package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 성 지키기
// https://www.acmicpc.net/problem/1236
public class Main3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int answer = 0;
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[][] arr= new String[N][M];
        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = String.valueOf(temp.charAt(j));
            }
        }

        int rowCount = 0;
        int colCount = 0;
        for (int i = 0; i < N; i++) {
            boolean flag = false;
            for (int j = 0; j < M; j++) {
                if (arr[i][j].equals("X")) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                rowCount++;
            }
        }

        for (int j = 0; j < M; j++) {
            boolean flag = false;
            for (int i = 0; i < N; i++) {
                if (arr[i][j].equals("X")) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                colCount++;
            }
        }

        answer = Math.max(rowCount, colCount);
        System.out.println(answer);
    }
}
