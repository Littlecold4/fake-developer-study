package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class SortCard {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[] cards = new int[num];
        PriorityQueue<Integer> p = new PriorityQueue<>();

        for(int i=0; i<num; i++){
            cards[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(cards);

        for(int i=0; i<num; i++){
            p.add(cards[i]);
        }
        int ans =0;
        while (p.size()>1) {
            int num1 = p.poll();
            int num2 = p.poll();
            ans += num1+num2;
            p.add(num1+num2);
        }
        if(num == 1){
            System.out.println(0);
            return;
        }
        System.out.println(ans);
    }
}
