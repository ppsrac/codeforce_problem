package org.example;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;



public class E {

    public static long[] solve(long n, long[] tar){
        Pair[] arr = new Pair[(int)n];
        long[] result = new long[(int)n];
        for(long i = 0; i < tar.length; i++){
            arr[(int) i] = new Pair(tar[(int)i], i);
        }

        Arrays.sort(arr);

        long total = 0;
        long minVal = arr[0].val;
        for(Pair ele: arr){
            total += (Math.abs(ele.val - minVal) + 1);
        }

        result[(int)arr[0].idx] = total;

        long a = 1; long b = n - 1;
        for(long i = 1; i < n; i++){
            long dval = arr[(int) i].val - arr[(int) i - 1].val;
            long idx = arr[(int) i].idx;
            total += (a - b) * dval; a++; b--;
            result[(int)idx] = total;
        }
        return result;
    }

    public static String sout(long[] target){
        String s = Arrays.toString(target).replaceAll(",", "");
        s = s.substring(1, s.length() - 1);
        return s;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] answer = new String[n];
        String[] input;
        for(int i = 0; i < n; i++){
            long len = Long.parseLong(br.readLine());
            input = br.readLine().split(" ");
            long[] a = Stream.of(input).mapToLong(Long::parseLong).toArray();
            answer[i] = sout(solve(len, a));
        }
        bw.write(String.join("\n", answer));
        bw.flush();
        bw.close();
    }
}

class Pair implements Comparable<Pair>{
    long val;
    long idx;

    public Pair(long val, long idx) {
        this.val = val;
        this.idx = idx;
    }

    @Override
    public int compareTo(Pair o){
        if(Long.compare(this.val, o.val) == 0){
            return Long.compare(this.idx, o.idx);
        }
        else return Long.compare(this.val, o.val);
    }
}