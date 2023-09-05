package org.example;
import java.io.*;

public class B {

    public static String solve(String target){
        char[] arr = new char[target.length() + 1];
        arr[0] = '0';
        for(int i = 0; i < target.length(); i++){
            arr[i + 1] = target.charAt(i);
        }

        int cur = target.length();
        int location = cur;
        for(int i = cur; i >= 0;){
            if(arr[i] >= '5'){
                arr[i] = '0'; i--;
                while(arr[i] == '9'){
                    arr[i] = '0'; i--;
                }
                arr[i]++; location = i;
            }
            else{
                i--;
            }
        }
        for(int i = location + 1; i <= target.length(); i++){
            arr[i] = '0';
        }
        String answer = new String(arr);
        return answer;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String input;
        String[] ans = new String[n];
        for(int i = 0; i < n; i++){
            input = br.readLine();
            ans[i] = solve(input);
            if(ans[i].charAt(0) == '0'){
                ans[i] = ans[i].substring(1);
            }
        }
        bw.write(String.join("\n", ans));
        bw.flush();
        bw.close();
    }
}