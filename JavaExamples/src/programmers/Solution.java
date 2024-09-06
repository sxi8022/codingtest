package programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution {

  public int solution(String[][] arr) {
    int answer = 0;
    Arrays.sort(arr, new Comparator<String[]>() {
      @Override
      public int compare(String[] o1, String[] o2) {
        if (o1[0].equals(o2[0])) {
          return o1[1].compareTo(o2[1]);
        } else {
          return o1[0].compareTo(o2[0]);
        }
      }
    });
    int[][] time = new int[arr.length][2];

    for (int i = 0; i < arr.length; i++) {
     int startTime = Integer.parseInt(arr[i][0].replace(":", ""));
     int endTime = Integer.parseInt(arr[i][1].replace(":", ""));
      endTime += 10;
      time[i][0] = startTime;
      if (endTime % 100 >= 60) {
        endTime += 40;
      }

      time[i][1] = endTime;
    }
    PriorityQueue<Integer> rooms = new PriorityQueue<>();

    for (int[] timeDesc : time) {
      if (rooms.size() == 0) {
        rooms.add(timeDesc[1]);
        continue;
      }

      int earlyRoom = rooms.peek();
      if (timeDesc[0] >= earlyRoom) {
        rooms.poll();
        rooms.add(timeDesc[1]);
      } else {
        rooms.add(timeDesc[1]);
      }

    }
    return rooms.size();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution T = new Solution();
    int n = sc.nextInt();
    String[][] arr = new String[n][2];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < 2; j++) {
        arr[i][j] = sc.next();
      }
    }
    System.out.println(T.solution(arr));
  }
}

// [["15:00", "17:00"], ["16:40", "18:20"], ["14:20", "15:20"], ["14:10", "19:20"], ["18:20", "21:20"]]
// 5
// 15:00 17:00 16:40 18:20 14:20 15:20 14:10 19:20 18:20 21:20
// 15:50 16:50 16:40 18:20 14:20 15:20 14:10 19:20 18:20 21:20