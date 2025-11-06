// //int형 priorityQueue 선언 (우선순위가 낮은 숫자 순)
// PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

// //int형 priorityQueue 선언 (우선순위가 높은 숫자 순)
// PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

// //String형 priorityQueue 선언 (우선순위가 낮은 숫자 순)
// PriorityQueue<String> priorityQueue = new PriorityQueue<>(); 

// //String형 priorityQueue 선언 (우선순위가 높은 숫자 순)
// PriorityQueue<String> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());


///1 1 9 1 1
import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        PriorityQueue p = new PriorityQueue<>(Collections.reverseOrder());;
        //우선순위 큐 new PriorityQueue<>(Collections.reverseOrder) =>우선순위 높은대로
        
        for(int i=0; i<priorities.length; i++){
            p.add(priorities[i]);
            System.out.println(p);
        }//우선순위 큐에 배열 요소 넣기
        System.out.println(p);
        
        
        while(!p.isEmpty()){//큐가 빌때까지
            for(int i=0; i<priorities.length; i++){
                if(priorities[i] == (int)p.peek()){
                    if(i == location){
                        return answer;
                    }
                    p.poll();
                    answer++;//몇번째로 출력되는지 하나씩 실행될떄마다 +1
                }//if문 끝
            }//for문 끝
        }

      

        return answer;
    }
}