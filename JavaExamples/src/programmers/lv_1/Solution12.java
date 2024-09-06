package programmers.lv_1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

// https://school.programmers.co.kr/learn/courses/30/lessons/12932
// 자연수 뒤집어 배열로 만들기
public class Solution12 {
  public long[] solution(long n) {
    long answer[];

    String s = String.valueOf(n);
    StringBuilder sb = new StringBuilder(s);
    sb = sb.reverse();

    answer = Stream.of(String.valueOf(sb.toString())
        .split(""))
        .mapToLong(Long::parseLong).toArray();

    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution12 T = new Solution12();

    System.out.println("자연수 n입력");
    long n = sc.nextLong();

    if (n < 1) {
      System.out.println("자연수만입력하세요.");
      System.exit(-1);
    }

    System.out.println(Arrays.toString(T.solution(n)));
  }
}

   /* String str = String.valueOf(n);
    String reverse = "";

    for (int i = 0; i < str.length(); i++) {
      reverse =  reverse + (str.charAt(str.length() -1 - i) - '0');
    }
    이방식으로 걸린 시간
    테스트 1 〉	통과 (29.42ms, 67MB)
테스트 2 〉	통과 (20.41ms, 79.9MB)
테스트 3 〉	통과 (44.53ms, 91.3MB)
테스트 4 〉	통과 (25.62ms, 77.6MB)
테스트 5 〉	통과 (20.16ms, 73.9MB)
테스트 6 〉	통과 (16.88ms, 70.9MB)
테스트 7 〉	통과 (19.62ms, 79MB)
테스트 8 〉	통과 (17.42ms, 79.8MB)
테스트 9 〉	통과 (23.40ms, 85MB)
테스트 10 〉	통과 (18.74ms, 84.1MB)
테스트 11 〉	통과 (17.20ms, 79.6MB)
테스트 12 〉	통과 (20.04ms, 71.3MB)
테스트 13 〉	통과 (17.69ms, 75.9MB)

solution 함수내에서 실행 시 
테스트 1 〉	통과 (3.63ms, 87.6MB)
테스트 2 〉	통과 (6.55ms, 72.8MB)
테스트 3 〉	통과 (6.09ms, 69.9MB)
테스트 4 〉	통과 (6.62ms, 79.7MB)
테스트 5 〉	통과 (2.63ms, 71.6MB)
테스트 6 〉	통과 (9.59ms, 75.2MB)
테스트 7 〉	통과 (3.06ms, 79.9MB)
테스트 8 〉	통과 (3.06ms, 74.5MB)
테스트 9 〉	통과 (3.56ms, 77.8MB)
테스트 10 〉	통과 (2.57ms, 75.8MB)
테스트 11 〉	통과 (6.66ms, 84.9MB)
테스트 12 〉	통과 (17.12ms, 77.9MB)
테스트 13 〉	통과 (4.22ms, 77.1MB)


    */