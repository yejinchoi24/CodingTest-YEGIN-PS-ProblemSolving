// 문제가 개편되었습니다. 이로 인해 함수 구성이나 테스트케이스가 변경되어, 과거의 코드는 동작하지 않을 수 있습니다.
// 새로운 함수 구성을 적용하려면 [코드 초기화] 버튼을 누르세요. 단, [코드 초기화] 버튼을 누르면 작성 중인 코드는 사라집니다.
import java.util.*;

class Solution {
// enqueue(Object data)==offer() : 데이터를 넣는 함수
// dequeue()=poll() : 데이터를 꺼내는 함수
// peek() : 앞으로 꺼낼 데이터가 무엇인지 확인하는 함수
// isEmpty() : 큐가 비었는지 확인하는 함수
// isFull() : 큐가 꽉 찼는지 확인하는 함수
// clear():큐를 비움
// size():개수확인

    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < speeds.length; i++) {
            double remain = (100 - progresses[i]) / (double) speeds[i];
            int date = (int) Math.ceil(remain);

            if (!q.isEmpty() && q.peek() < date) {//큐가 비지 않았고,
                answerList.add(q.size());
                q.clear();
            }

            q.offer(date);
        }

        answerList.add(q.size());

        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}