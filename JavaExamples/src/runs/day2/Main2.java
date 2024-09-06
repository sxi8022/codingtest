package runs.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//https://cote.inflearn.com/contest/10/problem/09-01
// 씨름선수 구하기

class Body implements  Comparable<Body> {
  public int h, w;

  public Body(int h, int w) {
    this.h = h;
    this.w = w;
  }

  @Override
  public int compareTo(Body o) {
    return o.h-this.h;
  }
}

public class Main2 {

  public int solution(ArrayList<Body> list, int n) {
    int answer = 0;
    Collections.sort(list);
    int max = Integer.MIN_VALUE;
    for (Body od : list) {
      if (od.w > max) {
        max = od.w;
        answer++;
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main2 T = new Main2();
    int n = sc.nextInt();
    ArrayList<Body> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      int h = sc.nextInt();
      int w = sc.nextInt();
      list.add(new Body(h, w));
    }


    System.out.println(T.solution(list, n));
  }
}

