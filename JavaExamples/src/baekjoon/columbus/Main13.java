package baekjoon.columbus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 마법사 상어와 파이어볼
// https://www.acmicpc.net/problem/20056
public class Main13 {

    //파이어볼 정보 클래스
    static class meteor{
        int r, c, m, s, d;
        // r, c : x,y 좌표
        // m : 질량
        // d : 방향
        // s : 속도

        public meteor(int r, int c, int m, int s, int d){
            this.r = r;
            this.c = c;
            this.m = m;
            this.s = s;
            this.d = d;
        }
    }

    static int N, M, K;
    /*
    * N : 격자 크기
    * M : 파이어볼 갯수
    * K : 이동 횟수
    * */
    static int[] dr = {-1, -1, 0, 1, 1, 1, 0, -1};	//방향 r값 변경값
    static int[] dc = {0, 1, 1, 1, 0, -1, -1, -1};	//방향 c값 변경값

    static ArrayList<meteor>[][] map;	//파이어볼 이동했을 때 정보
    static ArrayList<meteor> meteors = new ArrayList<>();	//모든 파이어볼 정보

    /*
    7(-1, -1)	0(-1, 0)	1(-1, 1)
    6(0, -1)	파이어볼	    2(0, 1)
    5(1, -1)	4(1, 0)	    3(1, 1)
    */
    /*
    1. 모든 파이어볼 속도(s)와 방향(d)에 맞게 이동합니다.
    2. 파이어볼 2개 이상있는 칸 조건에 맞게 분열 진행!
    1) 나눠질 때 질량 : 질량의 합 / 5
    2) 나눠질 때 속도 : 속도의 합 / 파이어볼 개수
    3) 나눠질 때 방향 : 모든 방향이 홀수이거나 짝수일 때 {0, 2, 4, 6}, 아닐 때 {1, 3, 5, 7}
     */


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new ArrayList[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = new ArrayList<>();
            }
        }
        // 입력되는 파이어볼 정보 저장
        for (int i = 0; i < M ; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken()) - 1;
            int c = Integer.parseInt(st.nextToken()) - 1;
            int m = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            meteors.add(new meteor(r,c,m,s,d));
        }

        // k 번 이동명령 진행
        for (int i = 0; i < K; i++) {
            meteorMove();
            meteorFire();
        }

        System.out.println(meteorCal());
        br.close();

    }

    //파이어볼 질량의 합 구하는 함수
    private static int meteorCal() {
        int result = 0;
        for (meteor cur : meteors) {
            result += cur.m;
        }
        return result;
    }

    //파이어볼 분열 진행
    private static void meteorFire() {
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                // 파이어볼 개수가 2개 미만일 때
                if (map[r][c].size() < 2) {
                    map[r][c].clear();
                    continue;
                }
                // 파이어볼 2개 이상일 때
                int mSum = 0, sSum = 0, oddCount =0, evenCount = 0;
                int size = map[r][c].size();
                // 분열 진행
                for (meteor cur : map[r][c]) {
                    mSum += cur.m;
                    sSum += cur.s;
                    if (cur.d % 2 == 1) {
                        oddCount++;
                    } else {
                        evenCount++;
                    }
                    meteors.remove(cur);
                }
                map[r][c].clear();
                mSum /= 5; // 분열된 질량 구하기
                if (mSum == 0) continue; // 분열된 질량이 0이면 분열 실패
                sSum /= size; // 분열된 속도 구하기
                // 모든 파이어볼 방향이 짝수이거나 홀수일 때
                if (oddCount == size || evenCount == size) {
                    for (int i = 0 ; i < 8; i+= 2) {
                        meteors.add(new meteor(r, c , mSum, sSum, i)); //{0, 2, 4, 6} 방향 분열
                    }
                } else {
                    for (int i = 1; i < 8; i+=2) {
                        meteors.add(new meteor(r, c, mSum, sSum, i));
                    }
                }

            }
        }

    }

    //파이어볼 이동시키는 함수
    private static void meteorMove() {
        for (meteor cur : meteors) {
            int tempR = (cur.r + N + dr[cur.d] * (cur.s % N)) % N;
            int tempC = (cur.c + N + dc[cur.d] * (cur.s % N)) % N;
            cur.r = tempR;
            cur.c = tempC;
            map[cur.r][cur.c].add(cur);
        }
    }
}
