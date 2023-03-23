package Baekjoon;

import java.io.IOException;

// 10818번 최소, 최대 : 모범 코드
public class MaxMinAnswer {

    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        int n = readInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = readInt();
            min = Math.min(num, min);
            max = Math.max(num, max);
        }
        sb.append(min).append(" ").append(max);
        System.out.println(sb);
    }

    public static int readInt() throws IOException {

        boolean numSign = false;
        int value = 0;  // 리턴 시킬 숫자 합계

        while(true) {   // 123 456
            int num = System.in.read();     // 입력한 줄을 한 문자씩 입력받음(아스키 코드로)

            if (num == '-') {       // 음수일 때
                numSign = true;
            } else if (num == ' ' || num == '\n') {    // 숫자 끝나는 지점일 때
                return numSign ? (-1 * value) : value;
            } else {
                value = (value * 10) + (num - '0');   // 기존의 일의 자리를 다음 자리로 승격
            }   // 1 // 10+2=12 // 12*10+3=123
        }
    }
}