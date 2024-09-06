package programmers.lv_0;

import java.util.Scanner;

//230614
// 꼬리 문자열
// https://school.programmers.co.kr/learn/courses/30/lessons/181841
public class Solution16 {

    public String solution(String[] str_list, String ex) {
        String answer = "";

        for(int i = 0; i < str_list.length; i++) {
            if (!str_list[i].contains(ex)) {
                answer += str_list[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Solution16 T= new Solution16();
        System.out.println("배열 크기를 입력하세요.");
        int listSize = sc.nextInt();
        if(listSize < 2 || listSize > 10) {
            System.out.println("배열크기는 2에서 10사이로 입력해주세요");
            System.exit(-1);
        }

        System.out.println("배열을입력해주세요.");
        String[] str_list = new String[listSize];
        sc.nextLine();
        for(int i = 0 ; i < str_list.length; i++) {
            str_list[i] = sc.nextLine();
            if (str_list[i].length() <1 || str_list[i].length() > 10) {
                System.out.println("문자열길이는 1~10자 사이로 입력하세요.");
                System.exit(-1);
            }
        }
        System.out.println("제외할문자열을 입력해주세요.");
        String ex = sc.nextLine();
        String answer = T.solution(str_list, ex);
        System.out.println(answer);

    }
}
