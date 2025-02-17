package ninetynine;

import java.io.*;
import java.util.*;

public class Day10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read N and M
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int answer = 0;

        // Map to store the courses and the list of student IDs with their attendance count
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            // Read the number of students in the i-th course
            int k = Integer.parseInt(br.readLine());

            // Read the student IDs for the i-th course
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < k; j++) {
                String studentId = st.nextToken();
                map.put(studentId, map.getOrDefault(studentId, 0) +1);
            }
        }

        for (int count : map.values()) {
            if (count >= m) {
                answer++;
            }
        }

        // Output the result
        System.out.println(answer);
        br.close();
    }
}
