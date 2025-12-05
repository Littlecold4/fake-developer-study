package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class JewelThief {
    public static void main(String[] args)throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] NnKStr = br.readLine().split(" ");
        int N = Integer.parseInt(NnKStr[0]);
        int K = Integer.parseInt(NnKStr[1]);
        ArrayList<Jewel> jewels = new ArrayList<>();
        for(int i =0 ; i<N; i++){
            String[] input = br.readLine().split(" ");
            for(int j = 0; j<jewels.size(); j++){

            }
        }
        int[] bags = new int[K];
        for(int i =0 ;i<K; i++){
            bags[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(bags);
    }

    static class Jewel{
        int value;
        int weight;

        public Jewel(int value,int weight){
            this.value = value;
            this.weight = weight;
        }

        public int compare(Jewel j){
            if(this.weight== j.weight)
                return j.value - this.value;
            return this.weight - j.weight;
        }
    }
}
