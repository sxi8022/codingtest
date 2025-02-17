package ninetynine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Function;

public class Day14 {
    private static final int MAX_SIZE = 200_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Function<String,Integer> stoi = Integer::parseInt;
        int n = stoi.apply(st.nextToken());
        int m = stoi.apply(st.nextToken());
        List<Queue<Integer>> q = new ArrayList<>(MAX_SIZE + 1);
        for(int i = 0 ; i <= MAX_SIZE ; i++){
            q.add(new LinkedList<>());
        }
        for(int i = 0 ; i < n ; i++){
            st = new StringTokenizer(br.readLine());
            int cnt = stoi.apply(st.nextToken());
            for(int j = 0 ; j < cnt ; j++){
                int num = stoi.apply(st.nextToken());
                q.get(num).add(i);
            }
        }
        st = new StringTokenizer(br.readLine());
        int[] cnt = new int[n];
        for(int i = 0 ; i < m ; i++){
            int sushi = stoi.apply(st.nextToken());
            Queue<Integer> tmpQueue = q.get(sushi);
            if(!tmpQueue.isEmpty()){
                cnt[tmpQueue.poll()]++;
            }
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print(cnt[i]+" ");
        }

    }
}
