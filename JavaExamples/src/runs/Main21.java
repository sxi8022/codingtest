package runs;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
  int id;
  int order;

  public Person(int id, int order) {
    this.id = id;
    this.order = order;
  }
}

// 응급실 큐
//https://cote.inflearn.com/contest/10/problem/05-08
public class Main21 {
 public int solution(int n, int m, int[] nums) {
   int answer = 0;
   Queue<Person> queue = new LinkedList<>();
   for (int i = 0; i < n; i++) {
     queue.offer(new Person(i, nums[i]));
   }
   while (!queue.isEmpty()) {
     Person tmp = queue.poll();
     for (Person x : queue) {
       if (x.order > tmp.order) {
         queue.offer(tmp);
         tmp = null;
         break;
       }
     }
     if (tmp != null) {
       answer++;
       if (tmp.id == m) return answer;
     }
   }
   return answer;
 }

 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   Main21 T = new Main21();
   int n = sc.nextInt();
   int m = sc.nextInt();
   int[] nums = new int[n];
   for (int i = 0; i < n; i++) {
     nums[i] = sc.nextInt();
   }
   System.out.println(T.solution(n, m, nums));
 }
}
