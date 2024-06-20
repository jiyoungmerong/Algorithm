/*
[문제 설명]
길이가 같은 두 문자열 str1과 str2가 주어집니다.

두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.
*/

class ShuffleStrings {
    public String solution(String str1, String str2) {
        char[] chr1 = str1.toCharArray();
        char[] chr2 = str2.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<chr1.length; i++) {
            sb.append(chr1[i]).append(chr2[i]);
        }

        return sb.toString();
    }
}
