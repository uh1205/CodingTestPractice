package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 3460번 이진수 : 내가 생각한 코드
public class Binary {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String binary = Integer.toBinaryString(n);
            for (int j = binary.length() - 1; j >= 0; j--) {
                if (binary.charAt(j) == '1') {    // 0 2 3 // 1101
                    sb.append(binary.length()-j-1).append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}