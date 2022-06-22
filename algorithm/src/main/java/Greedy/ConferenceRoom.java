package Greedy;

import java.util.*;
import java.io.*;
class ConferenceRoom {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nums = Integer.parseInt(br.readLine());
        int[][] times = new int[nums][2];
        for(int i=0; i<nums; i++){
            String numStr = br.readLine();
            times[i][0] = Integer.parseInt(numStr.split(" ")[0]);
            times[i][1] = Integer.parseInt(numStr.split(" ")[1]);
        }
        Arrays.sort(times, new Comparator<int[]>()
        {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }else {
                    return o1[1] - o2[1];
                }
            }
        });
        int answer =0;
        int endTime=0;
        int i=0;
        while(i!=nums){
            if(times[i][0]>=endTime){
                endTime = times[i][1];
                answer++;
            }
            i++;
        }
        System.out.println(answer);
    }
}