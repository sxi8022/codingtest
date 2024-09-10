package skills;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 다익스트라 알고리즘 개념 파악
// https://skillazit.tistory.com/243
public class Dijkstra {

    static ArrayList<Node>[] graph;


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // 정점의 개수, 간선의 개수
        int n = Integer.parseInt(bf.readLine());
        int m = Integer.parseInt(bf.readLine());

        graph = new ArrayList[n+1];
        for (int i = 0; i <=n; i++) graph[i] = new ArrayList<>();

        StringTokenizer st;
        for (int i = 0; i <m; i++) {
            st = new StringTokenizer(bf.readLine());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken()); // 정정 번호
            int cost = Integer.parseInt(st.nextToken()); // 거리
            graph[v].add(new Node(w, cost));
        }
        int start = Integer.parseInt(bf.readLine());

        Act(n, start);


    }

    private static void Act(int n, int start) {
        boolean[] check = new boolean[n +1];
        int[] dist = new int[n+1];
        int num_pointer = Integer.MAX_VALUE;
        Arrays.fill(dist, num_pointer);
        dist[start] = 0; // 시작 위치로부터의 거리 0

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));
        while (!pq.isEmpty()) {
            int nowVertex = pq.poll().index;
            if (check[nowVertex]) continue;
            check[nowVertex] = true;

            // index 의 연결된 정점 비교
            for (Node next : graph[nowVertex]) {
                if (dist[next.index] > dist[nowVertex] + next.cost) {
                    dist[next.index] = dist[nowVertex] + next.cost;

                    pq.offer(new Node(next.index, dist[next.index]));
                }
            }
        }
        // 최소 거리 출력
        for (int i : dist) {
            if (i == num_pointer) System.out.print(0 + " ");
            else System.out.print(i + " ");
        }
    }
}

// 입력 샘플

/*
5
9
1 2 10
1 3 5
2 3 2
3 1 1
3 2 13
4 1 8
4 5 3
5 4 9
5 2 31
4

*
*
* */

