package runs;

import java.util.ArrayList;
import java.util.Scanner;

public class Main19 {

  public int solution(int n, int k) {
    int answer = 0;
    ArrayList<Integer> nList = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      nList.add(i);
    }
    int idx = 0;
    while (nList.size() > 1) {
      idx = idx +k - 1;
      if (idx > nList.size()) idx = idx % nList.size();
      else if (idx == nList.size()) idx = 0;
      nList.remove(idx);
    }
    if (nList.size() == 1) answer = nList.get(0);
    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main19 T = new Main19();
    int n = sc.nextInt();
    int k = sc.nextInt();
    System.out.println(T.solution(n, k));
  }
}
