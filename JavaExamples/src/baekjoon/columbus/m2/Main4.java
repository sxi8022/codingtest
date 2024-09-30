package baekjoon.columbus.m2;
import java.io.*;
import java.util.*;


// 공주님을 구해라
// https://www.acmicpc.net/problem/17836

public class Main4 {

    static int[][] board;
    static boolean[][][] visited;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int N;
    static int M;
    static int T;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

         N = Integer.parseInt(st.nextToken());
         M = Integer.parseInt(st.nextToken());
         T = Integer.parseInt(st.nextToken());
         board = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        visited = new boolean[N][M][2];// 0은 그람이 없을때, 1은 그람이 있을때
        int result = bfs(0, 0);
        if(result == -1) System.out.println("Fail");
        else System.out.println(result);
    }

    public static int bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x, y, 0, false));
        visited[x][y][0] = true;

        while(!q.isEmpty()) {
            Node current = q.poll();

            if(current.count > T) break;
            if(current.x == N - 1 && current.y == M - 1) return current.count;

            for(int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];
                if(nx >= 0 && ny >= 0 && nx < N && ny < M) {
                    if(!current.isGram) { //그람 없음
                        if(!visited[nx][ny][0] && board[nx][ny] == 0) {
                            q.offer(new Node(nx, ny, current.count + 1, current.isGram));
                            visited[nx][ny][0] = true;
                        } else if(!visited[nx][ny][0] && board[nx][ny] == 2) {
                            q.offer(new Node(nx, ny, current.count + 1, true));
                            visited[nx][ny][0] = true;
                        }
                    } else { //그람 있음
                        if(!visited[nx][ny][1]) {
                            q.offer(new Node(nx, ny, current.count + 1, current.isGram));
                            visited[nx][ny][1] = true;
                        }
                    }
                }
            }
        }
        return -1;
    }


    public static class Node {
        int x;
        int y;
        int count;
        boolean isGram;

        public Node(int x, int y, int count, boolean isGram) {
            this.x = x;
            this.y = y;
            this.count = count;
            this.isGram = isGram;
        }
    }
}