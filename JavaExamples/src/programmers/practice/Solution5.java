package programmers.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Solution5 {

  public List<String> solution(String[] orders) {
    HashMap<String, Set<String>> userOrders = new HashMap<>();
    Set<String> allFoods = new HashSet<>();

    for (String order : orders) {
      String[] orderParts = order.split(" ");
      String user = orderParts[0];
      Set<String> foodSet = new HashSet<>(Arrays.asList(orderParts).subList(1, orderParts.length));

      userOrders.put(user, foodSet);
      allFoods.addAll(foodSet);
    }

    int maxFoodCount = 0;
    List<String> answer = new ArrayList<>();

    for (String user : userOrders.keySet()) {
      Set<String> foodSet = userOrders.get(user);
      int foodCount = foodSet.size();

      if (foodCount > maxFoodCount) {
        maxFoodCount = foodCount;
        answer.clear();
        answer.add(user);
      } else if (foodCount == maxFoodCount) {
        answer.add(user);
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution5 T = new Solution5();
    int len = sc.nextInt();
    sc.nextLine();
    String[] orders = new String[len];
    for (int i = 0; i < len; i++) {
      orders[i] = sc.nextLine();
    }
    System.out.println(T.solution(orders).toString());
  }
}
