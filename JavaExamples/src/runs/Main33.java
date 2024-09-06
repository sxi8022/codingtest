package runs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


//tree 말단 노드까지의 가장 짧은 경로


class Node {
  int data;
  Node lt, rt;
  public Node(int val) {
    data = val;
    lt=rt=null;
  }
}


public class Main33 {
  Node root;

  public int solution(Node root) {
    Queue<Node> que = new LinkedList<>();
    que.offer(root);
    int level = 0;
    while(!que.isEmpty()) {
      int len = que.size();
      for(int i =0; i<len; i++) {
        Node cur = que.poll();
        if (cur.lt==null && cur.rt == null) {
          return level;
        }
        if(cur.lt != null) {
          que.offer(cur.lt);
        }
        if(cur.rt != null) {
          que.offer(cur.rt);
        }

      }
      level++;
    }
    return level;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main33 T = new Main33();
    T.root = new Node(1);
    T.root.lt = new Node(2);
    T.root.rt = new Node(3);
    T.root.lt.lt = new Node(4);
    T.root.lt.rt = new Node(5);
    System.out.println(T.solution(T.root));
  }
}
