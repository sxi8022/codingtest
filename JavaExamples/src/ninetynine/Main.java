package ninetynine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 행(x)와 열(y) 입력
        int x = sc.nextInt(); // 행 개수
        int y = sc.nextInt(); // 열 개수

        if (x == 0 || y == 0) {
            sc.close();
            return; // 더 이상 입력을 받지 않고 종료
        }
        sc.nextLine(); // 버퍼 비우기

        // 2차원 배열 선언
        char[][] arr = new char[x][y];

        // 입력 받아 2차원 배열에 저장
        for (int i = 0; i < x; i++) {
            String line = sc.nextLine(); // 한 줄 입력받기
            for (int j = 0; j < line.length(); j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        // 좌우 반전하여 출력
        for (int i = 0; i < x; i++) {
            for (int j = y - 1; j >= 0; j--) { // 역순으로 출력
                if(arr[i][j] == '\0') continue;
                System.out.print(arr[i][j]);
            }
            System.out.println(); // 각 행 출력 후 줄바꿈
        }

        sc.close();
    }
}