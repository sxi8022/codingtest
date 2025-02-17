package ninetynine;

import java.util.Scanner;

public class Day1 {

    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        int p = 0;
        int y = 0;
        for (int i = 0 ; i < s.length(); i++) {
            if (s.charAt(i) == 'p') {
                p++;
            }
            if (s.charAt(i) == 'y') {
                y++;
            }
        }
        if (p == 0 && y == 0) {
            return true;
        } else return p == y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Day1 day1 = new Day1();
        String s = sc.nextLine();
        System.out.println(day1.solution(s));
    }
}
