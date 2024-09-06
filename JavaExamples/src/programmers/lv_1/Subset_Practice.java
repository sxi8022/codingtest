package programmers.lv_1;

// 부분집합 구하기 필수
public class Subset_Practice {

  static int[] src = { 1, 2, 3, 4, 5 };
  static boolean[] select = new boolean[src.length];

  public static void main(String[] args) {
    subset(0);
  }

  private static void subset(int i) {
    if (i == src.length) {
      print();
      return;
    }

    select[i] = true; // 선택
    subset(i + 1); // 재귀
    select[i] = false; // 선택 X
    subset(i + 1); // 재귀

  }

  private static void print() {
    for (int i = 0; i < select.length; i++) {
      if (select[i]) System.out.print(src[i] + " ");
    }
    System.out.println();
  }

}