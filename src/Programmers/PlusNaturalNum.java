package Programmers;

import java.util.Scanner;

class PlusNaturalNum {
    public static int solution(int n) {
        int answer = 0;
        String [] str = String.valueOf(n).split("");
        for(String s : str) {
            answer += Integer.parseInt(s);
        }
        return answer;
    }
    public static int solution2(int n) {
        int answer = 0;
        while(n > 0) {
            answer += n % 10;
            n /= 10;
        }
        n = answer ;
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(solution2(num));
    }
}