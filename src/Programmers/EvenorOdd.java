package Programmers;

import java.util.Scanner;

class EvenorOdd {
    public static String solution(int num) {
        String answer = num % 2 == 0 ? "Even" : "Odd";
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(solution(num));
    }
}
