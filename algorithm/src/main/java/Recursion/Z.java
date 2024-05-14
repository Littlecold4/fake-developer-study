package Recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Z {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int r = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        System.out.println(FindAnw(N,r,c));
    }
    private static int FindAnw(int N, int r, int  c){
        if(N == 0) return 0;
        return 2*(r%2)+(c%2) + 4*FindAnw(N-1, r/2, c/2);
    }
}