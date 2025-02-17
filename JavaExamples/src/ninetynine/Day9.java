package ninetynine;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Day9 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, String> map = new HashMap<>();
        while (n-- > 0) {
            String[] arr = br.readLine().split(" ", 3);
            String key = arr[2].substring(0,5);
            map.put(key, map.containsKey(key) ? "?\n" : arr[1]  + "\n");
        }

        while (n-- > 0) sb.append(map.getOrDefault(br.readLine(), "!\n"));

        bw.write(sb.toString());
        bw.flush();
    }
}
