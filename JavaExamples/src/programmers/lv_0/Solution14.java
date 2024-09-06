package programmers.lv_0;

import java.util.Scanner;

// 배열의 길이를 2의 거듭제곱으로 만들기 - https://school.programmers.co.kr 코딩 기초트레이닝
public class Solution14 {

//    먼저 arr의 길이를 인트 ll로 선언한다.
//    인트 ll이 짝수일 경우 계속 2로 나눴을때 ll == 1이 된다면 이것은 이미 길이가 2의 거듭제곱이니 arr을 그대로 리턴해준다.
//    그 이후로는 실수 x를 선언하고 인트 y를 선언한다. 그리고 다시 배열의 길이를 int len으로 초기화한다.
//    와일문을 돌려서 x가 arr의 길이보다 길어질때까지 x를 2의 거듭제곱으로 증가시킨다.
//    x가 나오는 순간 바로 x만큼의 인트 배열을 선언해주고
//    반복문을 돌려서 arr의 값을 인트배열에 넣어주면 나머지는 다 0으로 초기화 되어있으므로 이 배열을 리턴해준다. 끝.


    public int[] solution(int[] array){
        int len1 = array.length;
        boolean of2 = false; // 2의 거듭제곱인지

        // 1개이거나 2개일경우 2의 거듭제곱이므로 그대로 출력
        if(len1 == 1 || len1 == 2) {
            return array;
        } else {
            // 2로나누면서 나누려는 배열길이 len1이 1이될경우 2의 거듭제곱이므로 true 반환
            while (len1 > 0 ) {
                len1 = len1 / 2;
                if (len1 % 2 == 0) {
                    continue;
                }
                // 거듭제곱이 아님
                if (len1 % 2 == 1) {
                    break;
                }
                // 거듭제곱
                if (len1 == 1) {
                    of2 = true;
                    break;
                }

            }
            if (of2) {
                return array;
            }
        }

        int len2 = array.length;
        double x= 0;
        int y = 0;
        while (len2 > x) {
            x = Math.pow(2, y++);
        }
        int[] answer = new int[(int)x];
        for (int i = 0; i< array.length; i++) {
            answer[i] = array[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution14 T = new Solution14();
        System.out.println("원소 개수를 입력하세요.");

        int count = sc.nextInt();
        if (count < 1 || count > 1000) {
            System.out.println("원소의개수는 1개이상 100개 이하여야 합니다.");
            System.exit(-1);
        }

        int[] array = new int[count];
        System.out.println("배열의 숫자를 입력해주세요.");
        for (int i =0; i < count; i++) {
            array[i] = sc.nextInt();
            if (array[i] < 0 || array[i] > 1000) {
                System.out.println("잘못된 숫자를입력하였습니다. 시스템을 종료합니다.");
                System.exit(-1);
            }
        }
        int[] answer = T.solution(array);
        for (int i : answer) {
            System.out.print(i + " ");
        }

    }
}
