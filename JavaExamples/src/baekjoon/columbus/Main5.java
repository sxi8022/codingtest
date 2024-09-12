package baekjoon.columbus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2075
// n 번째 큰 수
public class Main5 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());


        for (int i = 0 ; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j =0; j < N; j++) {
                pq.add(Integer.valueOf(st.nextToken()));
            }
        }

        for (int i =0; i < N-1; i++) {
            pq.poll();
        }
        System.out.println(pq.poll());

    }
}
