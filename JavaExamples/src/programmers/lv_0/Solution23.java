package programmers.lv_0;

import java.util.ArrayList;
import java.util.Scanner;

// 무작위로 K개의 수 뽑기
// https://school.programmers.co.kr/learn/courses/30/lessons/181858
public class Solution23 {
    public ArrayList<Integer> solution(int[] array, int k) {
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (!temp.contains(array[i])) {
                temp.add(array[i]);
            }
        }
        if (temp.size() > k) {
            answer = new ArrayList<>(temp.subList(0, k));
        } else if (answer.size() < k){
            for (int i =0 ; i < temp.size(); i ++) {
                answer.add(temp.get(i));
            }
            int modSize = k - answer.size();
            for (int i =0 ; i < modSize; i ++) {
                answer.add(-1);
            }
        }


        return answer;
     }

    public static void main(String[] args) {
        Solution23 T = new Solution23();
        Scanner sc = new Scanner(System.in);
        System.out.println("배열의 크기를 입력해주세요.");
        int arrSize = sc.nextInt();
        if (arrSize < 1 || arrSize > 100000) {
            System.exit(-1);
        }
        int[] array = new int[arrSize];
        System.out.println("배열의 원소값을 입력해주세요." + arrSize + "번 입력");
        for (int i =0; i < arrSize; i++) {
            array[i] = sc.nextInt();
            if (array[i] < 0 || array[i] > 100000) {
                System.out.println("잘못된 숫자를입력하였습니다. 시스템을 종료합니다.");
                System.exit(-1);
            }
        }
        System.out.println("완성될 배열의 길이를 입력해주세요.");
        int k = sc.nextInt();
        if (k < 1 || k > 1000 || k > arrSize) {
            System.exit(-1);
        }

        System.out.println(T.solution(array, k).toString());
    }
}
