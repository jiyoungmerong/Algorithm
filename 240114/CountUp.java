/*
[문제 설명]
정수 start_num와 end_num가 주어질 때,
start_num부터 end_num까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
*/

import java.util.stream.IntStream;

public class CountUp {
    public int[] solution(int start, int end) {
        return IntStream.rangeClosed(start, end).toArray();
    }
}