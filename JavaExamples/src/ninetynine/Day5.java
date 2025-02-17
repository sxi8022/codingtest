package ninetynine;

import java.util.Scanner;

public class Day5 {

    public String solution (int max, char[][] arr) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0 ; i < max; i++) {
            for (int j = 0 ; j < 5 ; j++) {
                if(arr[j][i] == '\0') continue;
                answer.append(arr[j][i]);
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        int n = 5;
        Day5 day5 = new Day5();
        char[][] arr = new char[5][15];
        Scanner sc = new Scanner(System.in);
        int max = 0;
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine(); // 한 줄 입력받기
            if(max < line.length()) max = line.length();
            for (int j = 0; j < line.length(); j++) {
                arr[i][j] = line.charAt(j); // 입력된 줄에서 한 글자씩 배열에 담기
            }
        }
        System.out.println(day5.solution(max, arr));

    }
}
