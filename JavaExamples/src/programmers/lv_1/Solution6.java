package programmers.lv_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

//https://school.programmers.co.kr/learn/courses/30/lessons/1845
// 폰켓몬
public class Solution6 {

  public int solution(int[] nums) {
    int answer = 0;
    int max = nums.length /2;
    HashSet<Integer> typeList = new HashSet<>(Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new)));
    if (typeList.size() > max) {
      answer = max;
    } else {
      answer = typeList.size();
    }


    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution6 T = new Solution6();
    System.out.println("총 포켓몬 개수를 입력");
    int n = sc.nextInt();
    int[] nums = new int[n];
    for (int i = 0; i < nums.length; i++) {
      System.out.println("종류번호 입력");
      nums[i] = sc.nextInt();
    }
    System.out.println(T.solution(nums));
  }

}
