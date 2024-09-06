package programmers.lv_0;

import java.util.*;
import java.util.stream.Collectors;

public class Solution21 {
    public int solution(String[] strArr) {
       return Arrays.stream(strArr).collect(Collectors.groupingBy(String::length)).values().stream().max(Comparator.comparingInt(List::size)).orElse(Collections.emptyList()).size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution21 T= new Solution21();
        System.out.println("배열 크기를 입력하세요.");
        int listSize = sc.nextInt();
        if(listSize < 1 || listSize > 100000) {
            System.out.println("배열크기는 1에서 100000사이로 입력해주세요");
            System.exit(-1);
        }

        System.out.println("배열을입력해주세요.");
        String[] strArr = new String[listSize];
        sc.nextLine();
        for(int i = 0 ; i < strArr.length; i++) {
            strArr[i] = sc.nextLine();
            if (strArr[i].length() < 1 || strArr[i].length() > 30) {
                System.out.println("문자열길이는 1~30자 사이로 입력하세요.");
                System.exit(-1);
            }
        }

        int answer = T.solution(strArr);
        System.out.println(answer);
    }
}
