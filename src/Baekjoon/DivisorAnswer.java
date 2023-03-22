package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2501번 약수 구하기 문제 모범 답안
public class DivisorAnswer {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int count = 0;
        int result = 0;

        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                count++;
                if(count == k) {
                    result = i;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
