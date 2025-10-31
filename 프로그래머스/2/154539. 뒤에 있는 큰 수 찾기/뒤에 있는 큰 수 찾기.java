import java.util.*;//java에 내장된 모든 패키지 가져오기
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer,-1);
        
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        
        
        for(int i=1;i<numbers.length;i++){
            while(!stack.isEmpty()){//스택이 비어있을 때까지
                int idx = stack.pop();
                if(numbers[idx]<numbers[i]){//뒤가 더 클 때
                    answer[idx] = numbers[i];
                }else{//앞이 더 크거나 같을 때
                    stack.push(idx);
                    break;
                    
                }
        }//while문 끝
        stack.push(i);
    }//for문 끝
            
        return answer;
    }
}
//뒷큰수를 못찾은 원소의 인덱스 번호를 스택에 넣는다.
//스택의 특징:후입선출LIFO,단방향 입출력 구조,데이터를 하나씩 넣고 뺄 수 있다.
//1.numbers.length의 길이만큼 answer배열 길이 조정
//2.answer 배열 -1 모두 초기화
//3.stack선언->처음 인덱스 0을 넣는다