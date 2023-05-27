package Programmers;

public class FromStrToInt {
    public static int solution(String s) {
        String [] str = s.split("");
        int answer = 0;
        if("-".equals(str[0])) {
            String temp = "";
            for(int i=1; i< str.length; i++) {
                temp += str[i];
            }
            answer = 0 - Integer.parseInt(temp);
        } else  {
            answer = Integer.parseInt(s);
        }
        return answer;
    }
    public static int solution2(String s) {
        return Integer.valueOf(s);
    }

    public static void main(String[] args) {
        System.out.println(solution("-1234"));
    }
}
