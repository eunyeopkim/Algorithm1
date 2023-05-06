package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
        총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
*/
public class N_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int [] array = new int[size];
        int cnt = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i < size; i++) {
            int a = Integer.parseInt(st.nextToken());
            array[i] = a;
        }
        int chk = Integer.parseInt(br.readLine());
        for(int i=0; i < size; i++) {
            if(array[i] == chk) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}