import java.util.Stack;

class Solution {
    public int[] solution(int[] numbers) {
        int n = numbers.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            // 현재 숫자가 스택 top 인덱스의 값보다 크면, 뒤큰수 확정
            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                int idx = stack.pop();
                answer[idx] = numbers[i];
            }
            stack.push(i);
        }

        // 스택에 남은 인덱스는 뒤큰수가 없음
        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        return answer;
    }
}