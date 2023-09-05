package org.example;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;



public class D {
    public static class pair{
        int x; int y;
        public pair(int _x, int _y){
            x = _x; y = _y;
        }
    }

    public static List<Integer> solve(int n, int[] a, int[] b){
        pair[] arr = new pair[n];
        for(int i = 0; i < n; i++){
            a[i] -= b[i];
            arr[i] = new pair(a[i], i);
        }
        List<Integer> result = new ArrayList<Integer>();
        Arrays.sort(arr, (o1, o2) -> {
            return (Integer.valueOf(o1.x).equals(o2.x)) ? Integer.compare(o1.y, o2.y) : Integer.compare(o2.x, o1.x);
        });
        int maxVal;
        maxVal = arr[0].x;
        for(int i = 0; i < n; i++){
            if(maxVal != arr[i].x) break;
            result.add(arr[i].y + 1);
        }
        return result;
    }

    public static String sout(List<Integer> arr){
        Integer n = arr.size();
        String s = arr.toString().replaceAll(",", "");
        int k = s.length();
        return n.toString() + "\n" + s.substring(1, k - 1);
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
            int[] a = Stream.of(input).mapToInt(Integer::parseInt).toArray();
            input = br.readLine().split(" ");
            int[] b = Stream.of(input).mapToInt(Integer::parseInt).toArray();
            answer[i] = sout(solve(len, a, b));
        }
        bw.write(String.join("\n", answer));
        bw.flush();
        bw.close();
    }
}