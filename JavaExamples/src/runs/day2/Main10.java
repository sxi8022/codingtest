package runs.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time> {

  public int s, e;

  Time(int s, int e) {
    this.s = s;
    this.e = e;
  }

  @Override
  public int compareTo(Time o) {
    if (this.e == o.e) {
      return this.s - o.s; //this에서 매개변수를 뺀다. 오름차순
    } else {
      return this.e - o.e;
    }
  }
}

public class Main10 {

  public int solution(ArrayList<Time> arr, int n) {
    int answer = 0;
    Collections.sort(arr);
    int endTime = 0;
    for (Time ob : arr) {
      if (ob.s >= endTime) {
        answer++;
        endTime = ob.e;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main10 T = new Main10();

    int n = sc.nextInt();
    ArrayList<Time> arr = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      arr.add(new Time(x, y));
    }
    System.out.println(T.solution(arr, n));
  }
}
