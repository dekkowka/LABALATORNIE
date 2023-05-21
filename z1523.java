package Timus2;

import java.util.*;
import java.io.*;

public class z1523 {

    static final int MOD = (int) 1e9;

    static class FenwickTree {


        int tree[];
        int len;

        FenwickTree(int len) {
            this.len = len;
            tree = new int[len + 10];
        }

        void update(int idx, int val) {
            if (idx == 0)
                throw new IndexOutOfBoundsException("BIT IS NOT ZERO INDEXED");
            for (; idx <= len; idx += (idx & -idx))
                tree[idx] = (tree[idx] + val) % MOD;
        }

        int query(int idx) {
            int sum = 0;
            for (; idx > 0; idx -= (idx & -idx))
                sum = (sum + tree[idx]) % MOD;

            return sum;
        }

        int query(int L, int R) {
            return (query(R) - query(L - 1) + MOD) % MOD;
        }

    }


    private static void solve() {


        int n = nextInt();
        int k = nextInt() - 1;

        int arr[] = nextIntArrayOneBased(n);
        int DP[] = new int[n + 1]; /* DP_k[j] := number of subsequences of length k with starting element as j */
        Arrays.fill(DP, 1); // Base case is subsequence of length 1 and every element satisfies that

        while(k-->0) {
            FenwickTree BIT = new FenwickTree(n);
            for(int i = n; i >= 1; i--) {
                int prev = DP[arr[i]]; // DP_k-1
                DP[arr[i]] = BIT.query(arr[i]); // DP_k[arr[i]] := sum(DP_k-1[arr[j]]) s.t. j > i and arr[j] < arr[i]
                BIT.update(arr[i], prev); // update DP_k-1 which are only visited
            }
        }

        int totalWays = 0;
        for(int i = 1; i <= n; i++)
            totalWays = (totalWays + DP[i]) % MOD;

        println(totalWays);
    }



    public static void main(String[] args) throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)), false);
        st     = null;
        solve();
        reader.close();
        writer.close();
    }

    static BufferedReader reader;
    static PrintWriter    writer;
    static StringTokenizer st;

    static String next()
    {while(st == null || !st.hasMoreTokens()){try{String line = reader.readLine();if(line == null){return null;}
        st = new StringTokenizer(line);}catch (Exception e){throw new RuntimeException();}}return st.nextToken();}
    static String nextLine()  {String s=null;try{s=reader.readLine();}catch(IOException e){e.printStackTrace();}return s;}
    static int    nextInt()   {return Integer.parseInt(next());}
    static long   nextLong()  {return Long.parseLong(next());}
    static double nextDouble(){return Double.parseDouble(next());}
    static char   nextChar()  {return next().charAt(0);}
    static int[]  nextIntArray(int n)         {int[] a= new int[n];   int i=0;while(i<n){a[i++]=nextInt();}  return a;}
    static long[] nextLongArray(int n)        {long[]a= new long[n];  int i=0;while(i<n){a[i++]=nextLong();} return a;}
    static int[]  nextIntArrayOneBased(int n) {int[] a= new int[n+1]; int i=1;while(i<=n){a[i++]=nextInt();} return a;}
    static long[] nextLongArrayOneBased(int n){long[]a= new long[n+1];int i=1;while(i<=n){a[i++]=nextLong();}return a;}
    static void   print(Object o)  { writer.print(o);  }
    static void   println(Object o){ writer.println(o);}



}

