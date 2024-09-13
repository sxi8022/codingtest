package baekjoon.columbus;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/16987
// 계란으로 계란치기
public class Main10 {

    static int n;

    static ArrayList<Egg> arr;

    static int max;

    public static class Egg {
        int s;
        int w;

        Egg(int s, int w) {
            this.s = s;
            this.w = w;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine()); // 계란 개수
        arr = new ArrayList<>();
        max = Integer.MIN_VALUE; // 깨진 계란 수 최대값 찾기
        StringTokenizer st;
        for (int i = 0 ; i < n ; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            arr.add(new Egg(s, w));
        }

        find(0, 0);
        bw.write(max + "\n");
        bw.flush();
        bw.close();
    }

    private static void find(int cur, int cnt) {
        if (max < cnt) max = cnt ; //최대값 갱신
        if (cur == n) return ;
        if (arr.get(cur).s <= 0) find(cur + 1, cnt);
        else {
            for (int i =0; i <n; i++) {
                if (cur == i || arr.get(i).s <= 0) continue;
                arr.get(cur).s -= arr.get(i).w;
                arr.get(i).s -= arr.get(cur).w;
                // 계란으로 계란치기 시도

                int new_cnt = cnt; // 깨진 계란 세기 위한 변수

                if (arr.get(cur).s <= 0) new_cnt++;
                if (arr.get(i).s <= 0) new_cnt++;
                // 깨진 계란이 있다면 개수 증가

                find(cur + 1, new_cnt);

                arr.get(cur).s += arr.get(i).w;
                arr.get(i).s += arr.get(cur).w;
                // 다음 계란 치기를 위해 계란 복구
            }
        }
    }


}
