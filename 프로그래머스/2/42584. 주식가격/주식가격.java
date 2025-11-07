import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Queue<Integer> q = new LinkedList<>();

        for (int i : prices) {
            q.offer(i);
        }

        int i_count = 0;
        while (!q.isEmpty()) {
            int poll = q.poll();
            int number = 0;

            // 현재 시점 이후의 prices 비교
            for (int i = i_count + 1; i < prices.length; i++) {
                number++;
                if (poll > prices[i]) { // 가격이 떨어지면 멈춤
                    break;
                }
            }

            answer[i_count] = number;
            i_count++;
        }

        return answer;
    }
}
