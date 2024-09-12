package baekjoon.columbus;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// n과 m
// https://www.acmicpc.net/problem/15649
public class Main7 {
    private static boolean[] visit;
    private static int[] arr;

    private static StringBuilder result = new StringBuilder();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        visit = new boolean[N];
        arr = new int[M];
        dfs(N, M, 0);
        System.out.println(result);


    }

    private static void dfs(int N, int M, int depth) {
        // 재귀 깊이가 M과 같아지면 탐색과정에서 담았던 배열을 출력
        if (depth == M) {
            for (int val : arr) {
                result.append(val).append(' ');
            }
            result.append('\n');
            return;
        }
        for (int i =0; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i+1;
                dfs(N, M, depth+1);

                // 자식노드 방문이 끝나고 돌아오면 방문노드를 방문하지않은 상태로 변경
                visit[i] = false;
            }
        }
    }
}
