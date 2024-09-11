package baekjoon.columbus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// 최소 힙
// https://www.acmicpc.net/problem/1927
public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x == 0) {
                if (pq.isEmpty()) sb.append(0).append("\n");
                else {
                    sb.append(pq.poll()).append("\n");
                }
            } else {
                pq.offer(x);
            }

        }
        System.out.println(sb);

    }
}
