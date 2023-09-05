package org.example;

import java.io.*;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n;
        n = Integer.parseInt(br.readLine());
        String s;
        String[] ans = new String[n];
        for(int i = 0; i < n; i++) {
            int leng = Integer.parseInt(br.readLine());
            s = br.readLine();
            String[] arr = s.split(" ");
            int sum = 0;
            for (String val : arr) {
                sum += Integer.parseInt(val);
            }
            ans[i] = (sum % 2 == 0) ? "YES" : "NO";
        }
        bw.write(String.join("\n", ans));
        bw.flush();
        bw.close();
    }
}