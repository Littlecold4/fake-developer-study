package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NthLargest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N * N];

        for(int i =0; i<N; i++){
            String[] input = br.readLine().split(" ");
            for(int j=0; j<N; j++){
                arr[N*i+j] = Integer.parseInt(input[j]);
            }
        }

        Arrays.sort(arr);
        System.out.println(arr[N*N -N]);
    }
}
