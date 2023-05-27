package Programmers;


class ReverseNaturalArray {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        int cnt = 0;
        int[] answer = new int[s.length()];
        while(n>0) {
            answer[cnt] = (int)(n%10);
            n/=10;
            cnt++;
        }
        return answer;
    }
}
