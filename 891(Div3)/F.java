package org.example;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;



public class F {

    public static long solve(Problem p, long a, long b){
        long D = a * a - 4L * b;
        if(D < 0) return 0;
        long diff = (long)Math.sqrt(D);
        if(D != diff * diff) return 0;
        if((a + diff) != ((a + diff) / 2) * 2) return 0;
        long x, y;
        x = (a + diff) / 2;
        y = (a - diff) / 2;
        long cnt1 = p.count(x);
        if(diff == 0) return cnt1 * (cnt1 - 1L) / 2L;
        long cnt2 = p.count(y);
        return cnt1 * cnt2;
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
            int len = Integer.parseInt(br.readLine());
            input = br.readLine().split(" ");
            long[] a = Stream.of(input).mapToLong(Long::parseLong).toArray();
            Problem p = new Problem(len, a);
            int q = Integer.parseInt(br.readLine());
            long[] result = new long[q];
            for(int j = 0; j < q; j++){
                input = br.readLine().split(" ");
                long[] query = Stream.of(input).mapToLong(Long::parseLong).toArray();
                result[j] = solve(p, query[0], query[1]);
            }
            answer[i] = sout(result);
        }
        bw.write(String.join("\n", answer));
        bw.flush();
        bw.close();
    }
}

class Problem{
    int n;
    long[] arr;

    Problem(int n, long[] arr){
        this.n = n;
        this.arr = arr;
        Arrays.sort(this.arr);
    }

    long count(long val){
        int st, fi;
        if(this.arr[0] > val) return 0L;
        if(this.arr[this.arr.length - 1] < val) return 0L;

        int idx1 = 0;
        if(this.arr[idx1] != val){
            int l = 0;
            int r = this.arr.length - 1;
            int mid;
            while((r - l) != 1){
                mid = (l + r) / 2;
                if(this.arr[mid] < val) l = mid;
                else r = mid;
            }
            idx1 = r;
        }

        int idx2 = this.arr.length - 1;
        if(this.arr[idx2] != val){
            int l = 0; int r = this.arr.length - 1;
            int mid;
            while((r - l) != 1){
                mid = (l + r) / 2;
                if(this.arr[mid] > val) r = mid;
                else l = mid;
            }
            idx2 = l;
        }
        if(idx1 > idx2) return 0L;
        else return (long)(idx2 - idx1 + 1);
    }
}