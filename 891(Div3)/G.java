package org.example;

import java.io.*;
import java.util.Arrays;


public class G {
    static long mod = 998244353L;

    static long pow(long a, long b){
        if(b == 0) return 1L;
        long res = 1L;
        while(b != 0){
            if((b & 1L) != 0) res = (res * a) % mod;
            a = (a * a) % mod; b >>= 1;
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tc;
        tc = Integer.parseInt(br.readLine());
        String[] answer = new String[tc];
        for(int i = 0; i < tc; i++){
            String[] fiLine = br.readLine().split(" ");
            int n, s;
            n = Integer.parseInt(fiLine[0]); s = Integer.parseInt(fiLine[1]);
            Pair[] edges = new Pair[n - 1];
            Graph g = new Graph(n);
            for(int j = 0; j < n - 1; j++){
                String[] seLine = br.readLine().split(" ");
                int u, v, w;
                u = Integer.parseInt(seLine[0]);
                v = Integer.parseInt(seLine[1]);
                w = Integer.parseInt(seLine[2]);
                edges[j] = new Pair(u, v, w);
            }
            Arrays.sort(edges);
            int u, v, w;
            int su, sv;
            long res = 1;
            for(int j = 0; j < n - 1; j++){
                u = edges[j].u;
                v = edges[j].v;
                w = edges[j].w;
                long a = s - w + 1;
                su = g.takeCount(u);
                sv = g.takeCount(v);
                long exp = (long) su * (long) sv - 1L;
                res = (res * pow(a, exp)) % mod;
                g.union(u, v);
            }
            answer[i] = Long.valueOf(res).toString();
        }
        bw.write(String.join("\n", answer));
        bw.flush();
        bw.close();
    }
}

class Pair implements Comparable<Pair>{
    int u; int v; int w;
    Pair(int u, int v, int w){
        this.u = u;
        this.v = v;
        this.w = w;
    }
    @Override
    public int compareTo(Pair o){
        if(Integer.valueOf(this.w).equals(o.w)){
            if(Integer.valueOf(this.u).equals(o.u)){
                return Integer.compare(this.v, o.v);
            }
            return Integer.compare(this.u, o.u);
        }
        return Integer.compare(this.w, o.w);
    }
}

class Graph{
    int n;
    int[] par;
    int[] count;
    Graph(int n){
        this.n = n;
        this.par = new int[n + 1];
        this.count = new int[n + 1];
        for(int i = 1; i <= n; i++){
            this.par[i] = i;
            this.count[i] = 1;
        }
    }

    int find_par(int node){
        if(par[node] == node) return node;
        return par[node] = find_par(par[node]);
    }

    int union(int a, int b){
        a = find_par(a);
        b = find_par(b);
        if(a > b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        else if(a == b) return a;
        par[b] = a;
        count[a] += count[b]; count[b] = 0;
        return a;
    }

    int takeCount(int a){
        return count[find_par(a)];
    }
}