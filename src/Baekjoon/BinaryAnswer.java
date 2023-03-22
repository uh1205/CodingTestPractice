package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 3460번 이진수 : 모범 코드
public class BinaryAnswer {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            StringBuilder binaryTemp = new StringBuilder(Integer.toBinaryString(n));
            binaryTemp.reverse();

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < binaryTemp.length(); j++) {
                if(binaryTemp.charAt(j) == '1') {
                    sb.append(j).append(" ");
                }
            }
            System.out.println(sb);
        }
    }
}
