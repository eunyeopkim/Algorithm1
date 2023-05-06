package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
        첫째 줄에는 영수증에 적힌 총 금액
            $X$가 주어진다.

            둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수
            $N$이 주어진다.

            이후
            $N$개의 줄에는 각 물건의 가격
            $a$와 개수
            $b$가 공백을 사이에 두고 주어진다.
*/
public class N_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int tot = 0;
        for(int i = 0; i< N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(st.nextToken());
            int num =  Integer.parseInt(st.nextToken());
            tot += price * num;
        }
        if(X == tot) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}