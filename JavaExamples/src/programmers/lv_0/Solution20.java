package programmers.lv_0;

import java.util.HashMap;
import java.util.Scanner;

// 문자열 묶기
// https://school.programmers.co.kr/learn/courses/30/lessons/181855
public class Solution20 {
    public int solution(String[] strArr) {
        HashMap<Integer, Integer> countList = new HashMap<>();
        for (int i = 0 ; i <strArr.length; i ++) {
           if(!countList.containsKey(strArr[i].length())) {
               countList.put((strArr[i].length()), 0);
           }


        }

        for (int key : countList.keySet()) {
            for (int i  = 0; i < strArr.length; i++) {
                if(strArr[i].length() == key ) {
                    countList.put(key, countList.get(key) + 1);
                }
            }
        }
        int max = 0;
        for (int key : countList.keySet()) {
            if (max < countList.get(key)) {
                max = countList.get(key);
            }
        }


        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution20 T= new Solution20();
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
