package programmers.lv_0;

import java.util.Scanner;

public class Solution26 {
    public int solution (String[] order) {
        int answer = 0;

        for (int i = 0 ; i < order.length; i++) {
            if(order[i].contains("americano")) {
                answer+= 4500;
            } else if (order[i].contains("cafelatte")) {
                answer+= 5000;
            } else if (order[i].equals("anything")) {
                answer+= 4500;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution26 T = new Solution26();
        System.out.println("팀원들의 인원을 입력하세요");
        int teamCount = sc.nextInt();
        if (teamCount < 1 || teamCount > 1000) {
            System.exit(-1);
        }
        sc.nextLine();
        String[] order = new String[teamCount];
        for (int i=0; i <teamCount; i++) {
            order[i] = sc.nextLine();
        }
        System.out.println(T.solution(order));

    }
}
