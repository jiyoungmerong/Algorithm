/*
[문제 설명]
정수가 담긴 리스트 num_list가 주어질 때,
모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.
*/

public class MultiplicationAndSumOfElements {
    public int solution(int[] num_list) {
        int answer = 0;
        int multiplication = 1;
        int addition = 0;

        for(int i : num_list){
            multiplication *= i;
            addition += i;
        }

        return (multiplication < (addition*addition)) ? 1 : 0;
    }
}
