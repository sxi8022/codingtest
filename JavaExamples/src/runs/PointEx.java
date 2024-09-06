package runs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class PointTwo implements Comparable<PointTwo> {
  public int x;
  public int y;

  public PointTwo(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public int compareTo(PointTwo o) {
    if (this.x == o.x) {
      return this.y - o.y;
    } else {
      return this.x - o.x;
    }
  }
}

public class PointEx {

  public List<PointTwo> solution(List<PointTwo> points) {
    Collections.sort(points);
    return points;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PointEx T = new PointEx();
    int n = sc.nextInt();
    List<PointTwo> arr = new ArrayList<>();

    for (int j = 0; j < n; j++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      arr.add(new PointTwo(x, y));
    }

    for (PointTwo o : T.solution(arr)) {
      System.out.println(o.x + " " + o.y);
    }
  }
}
