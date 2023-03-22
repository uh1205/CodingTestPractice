package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// 2501번 약수 구하기 문제
public class Divisor {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        int blank = line.indexOf(" ");
        int N = Integer.parseInt(line.substring(0, blank));
        int K = Integer.parseInt(line.substring(blank + 1));

        ArrayList<Integer> divisor = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                divisor.add(i);
            }
        }

        if (divisor.size() < K) {
            System.out.print("0");
        } else {
            System.out.print(divisor.get(K - 1));
        }
    }
}
