package org.example;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class C {

    public static int[] solve(int[] tar){
        Arrays.sort(tar);
        int n = (int)(Math.sqrt((tar.length * 8 + 1)) + 1) >> 1;
        int[] arr = new int[n];
        int cur = 0;
        for(int i = 0; i < n - 1; i++){
            arr[i] = tar[cur];
            cur += (n - 1 - i);
        }
        arr[n - 1] = arr[n - 2];
        return arr;
    }

    public static String sout(int[] tar){
        String s = Arrays.toString(tar).replaceAll(",", "");
        int k = s.length();
        return s.substring(1, k - 1);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] answer = new String[n];
        String[] input;
        for(int i = 0; i < n; i++){
            int nn = Integer.parseInt(br.readLine());
            input = br.readLine().split(" ");
            int[] newArr = Stream.of(input).mapToInt(Integer::parseInt).toArray();
            answer[i] = sout(solve(newArr));
        }
        bw.write(String.join("\n", answer));
        bw.flush();
        bw.close();
    }
}