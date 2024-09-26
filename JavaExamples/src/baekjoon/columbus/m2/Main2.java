package baekjoon.columbus.m2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 음식물 피하기
// https://www.acmicpc.net/problem/1743
public class Main2 {
    static int N,M,K,ans,temp;
    static int dx[]= {-1,1,0,0};
    static int dy[]= {0,0,-1,1};
    static boolean[][] map;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        map = new boolean[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            map[r-1][c-1]=true;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(!visited[i][j] && map[i][j]) {
                    temp=0;
                    dfs(i,j);
                    ans = Math.max(ans, temp);
                }
            }
        }
        System.out.println(ans);

    }

    private static void dfs(int x, int y) {
        temp++;
        visited[x][y]=true;
        for (int k = 0; k < 4; k++) {
            int xx = x+dx[k];
            int yy = y+dy[k];

            if(xx<0 || yy<0 || xx>=N || yy>=M)continue;
            if(!visited[xx][yy]&& map[xx][yy]) {
                dfs(xx,yy);
            }
        }
    }
}
