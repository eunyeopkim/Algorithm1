package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
        코딩은 체육과목 입니다
*/
public class N_25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt = N / 4;
        for(int i=0; i<cnt; i++) {
            System.out.print("long ");
        }
        System.out.print("int");

    }
}