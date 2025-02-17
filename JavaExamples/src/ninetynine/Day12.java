package ninetynine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Day12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Queue<Integer> que = new LinkedList<>();
        int lastVal = 0 ;

        for (int i = 0; i <n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            switch(s) {
                case "push":
                    lastVal = Integer.parseInt(st.nextToken());
                    que.offer(lastVal);
                    break;
                case "pop" :
                    if (que.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(que.poll()).append("\n");
                    break;
                case "size" :
                    sb.append(que.size()).append("\n");
                    break;
                case "empty" :
                    if(que.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case "front" :
                    if (que.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(que.peek()).append("\n");
                    break;
                case "back" :
                    if (que.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(lastVal).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
