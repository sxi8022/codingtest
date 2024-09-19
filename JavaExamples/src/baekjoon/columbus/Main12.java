package baekjoon.columbus;


import java.io.*;
import java.util.*;

// 최단 경로


class Node2 implements Comparable<Node2> {
    int end, weight;

    public Node2(int end, int weight){
        this.end = end;
        this.weight = weight;
    }

    @Override
    public int compareTo(Node2 o) {
        return this.weight - o.weight;
    }
}

public class Main12 {
    static int V,E,K;
    static List<Node2>[] list;
    static int[] dist;

    private static final int INF = Integer.MAX_VALUE;

    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());
        list = new ArrayList[V + 1];
        dist = new int[V + 1];
        Arrays.fill(dist, INF);


        for (int i = 1; i <= V; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i =0 ; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            list[start].add(new Node2(end, weight));
        }
        StringBuilder sb = new StringBuilder();
        // 다익스트라 알고리즘
        dijkstra(K);
        for (int i = 1; i<= V; i++) {
            if (dist[i] == INF) sb.append("INF \n");
            else sb.append(dist[i] + "\n");
        }
        bw.write(sb.toString());
        bw.close();
        br.close();


    }


    private static void dijkstra(int start) {
        PriorityQueue<Node2> queue = new PriorityQueue<>();
        boolean[] check = new boolean[V + 1];
        queue.add(new Node2(start, 0));
        dist[start] = 0;
        while(!queue.isEmpty()){
            Node2 curNode = queue.poll();
            int cur = curNode.end;
            if(check[cur]) continue;
            check[cur] = true;
            for(Node2 node : list[cur]){
                if(dist[node.end] > dist[cur] + node.weight){
                    dist[node.end] = dist[cur] + node.weight;
                    queue.add(new Node2(node.end, dist[node.end]));
                }
            }
        }

    }
}
