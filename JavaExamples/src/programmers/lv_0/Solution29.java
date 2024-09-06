package programmers.lv_0;

import java.util.ArrayList;
import java.util.Scanner;

//https://school.programmers.co.kr/learn/courses/30/lessons/120894
//영어가 싫어요
public class Solution29 {

  public long solution(String numbers) {

    numbers = numbers.replace("zero", "0");
    numbers = numbers.replace("one", "1");
    numbers = numbers.replace("two", "2");
    numbers = numbers.replace("three", "3");
    numbers = numbers.replace("four", "4");
    numbers = numbers.replace("five", "5");
    numbers = numbers.replace("six", "6");
    numbers = numbers.replace("seven", "7");
    numbers = numbers.replace("eight", "8");
    numbers = numbers.replace("nine", "9");

    return Long.parseLong(numbers);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution29 T = new Solution29();


    System.out.println("문자열을 입력해주세요.");
    String numbers = sc.nextLine();

    if (numbers.startsWith("zero")) {
      System.out.println("0으로 시작할 수 없습니다.");
      System.exit(-1);
    }

    long answer = T.solution(numbers);

    System.out.println(answer);

    // System.out.println(convertRes.toString());

  }
}


    /*String[] numArray = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
        "nine"};

    System.out.println("숫자를 입력해주세요.");
    String input = sc.nextLine();
    ArrayList<String> convertRes = new ArrayList<>();
    try {
      int res = Integer.parseInt(input);
      for (int i = 0; i < input.length(); i++) {
        convertRes.add(numArray[(input.charAt(i) - '0')]);
      }
    } catch (NumberFormatException ne) {
      System.exit(-1);
    }*/
