package runs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


class Point implements Comparable<Point> {
  public int x;
  public int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public int compareTo(Point o) {
    // 오름차순
    if (this.x == o.x) return this.y - o.y;
    else return this.x - o.x;
    // 내림차순
    /*if (this.x == o.x) return o.y - this.y;
    else return o.x - this.x;*/
  }
}


public class Main27 {


  public List<Point> solution(List<Point> points) {
    Collections.sort(points);
    return points;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main27 T = new Main27();
    int n = sc.nextInt();
    List<Point> arr = new ArrayList<>();

    for (int j = 0; j < n; j++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      arr.add(new Point(x, y));
    }

    for (Point o : T.solution(arr)) {
      System.out.println(o.x + " " + o.y);
    }
  }
}
