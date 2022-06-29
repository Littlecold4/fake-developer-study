package Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Congressman {
    public static void main(String[] args)throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int meCount = Integer.parseInt(br.readLine());
        Integer[] membersCount = new Integer[num-1];
        for(int i=0; i<num-1;i++){
            membersCount[i] = Integer.parseInt(br.readLine())-meCount;
        }
        if(num==1){
            System.out.println(0);
            return;
        }
        int answer =0;
        while(true){
            Arrays.sort(membersCount,Collections.reverseOrder());
            if(membersCount[0] <0) break;
            membersCount[0]-=2;
            for(int i=1;i<num-1;i++){
                membersCount[i]--;
            }
            answer++;
        }
        System.out.println(answer);
//        for(int i=0; i<num; i++){
//            queue.offer(Integer.parseInt(br.readLine()));
//        }
//        while(true){
//
//        }
    }
}
