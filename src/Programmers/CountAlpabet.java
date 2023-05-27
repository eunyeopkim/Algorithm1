package Programmers;

public class CountAlpabet {
    public static boolean solution(String s) {
        boolean answer = true;
        int cnt = 0;
        int cnt2 = 0;
        String [] str = s.split("");
        for(int i=0; i<str.length; i++) {
            if(str[i].toUpperCase().equals("P")) {
                cnt++;
            } else if(str[i].toUpperCase().equals("Y")) {
                cnt2++;
            }
        }
        if(cnt == cnt2) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("pYY"));

    }
}
