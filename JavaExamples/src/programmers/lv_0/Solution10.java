package programmers.lv_0;

import java.util.Scanner;
import java.util.regex.Pattern;

// 배열의 유사도
public class Solution10 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(int i = 0; i< s1.length; i++) {
            for (int j = 0 ; j < s2.length; j++) {
                if (s1[i].equals(s2[j])) {
                    answer++;
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution10 T= new Solution10();
        System.out.println("첫번째 배열 크기를 입력하세요.");
        int size1 = sc.nextInt();
        if(size1 <1 || size1 > 100) {
            System.out.println("배열크기는 1에서 100사이로 입력해주세요");
            System.exit(-1);
        }

        System.out.println("배열을입력해주세요.");
        String[] arr1 = new String[size1];
        sc.nextLine();
        for(int i = 0 ; i < arr1.length; i++) {
            arr1[i] = sc.nextLine();
            if (arr1[i].length() <1 || arr1[i].length() > 10) {
                System.out.println("문자열길이는 1~10자 사이로 입력하세요.");
                System.exit(-1);
            }
            if (!Pattern.matches("^[a-z]*$", arr1[i] )) {
                System.out.println("영어소문자만 허용!");
                System.exit(-1);
            }
        }


        System.out.println("두번째 배열 크기를 입력하세요.");
        int size2 = sc.nextInt();

        if(size2 <1 || size2 > 100) {
            System.out.println("배열크기는 1에서 100사이로 입력해주세요");
            System.exit(-1);
        }

        System.out.println("배열을입력해주세요.");
        String[] arr2 = new String[size2];
        sc.nextLine();
        for(int i = 0 ; i < arr2.length; i++) {
            arr2[i] = sc.nextLine();
            if (arr2[i].length() <1 || arr2[i].length() > 10) {
                System.out.println("문자열길이는 1~10자 사이로 입력하세요.");
                System.exit(-1);
            }
            if (!Pattern.matches("^[a-z]*$", arr2[i] )) {
                System.out.println("영어소문자만 허용!");
                System.exit(-1);
            }
        }

        int answer = T.solution(arr1, arr2);
        System.out.printf("%d " , answer);

    }
}
