package ninetynine;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        Map<String, Boolean> map  = new HashMap<>();
        String s;

        for (int i =0 ; i < N; i++) {
            s = sc.next();
            map.put(s, true);
        }

        for (int j = 0; j < (N -1); j++) {
            s = sc.next();
            if (!map.containsKey(s)) {
                continue;
            }
            map.remove(s);
        }

        for (String cont : map.keySet()) {
            System.out.println(cont);
        }
        sc.close();

    }
}
