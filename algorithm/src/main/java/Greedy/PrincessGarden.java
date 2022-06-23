package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrincessGarden {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nums = Integer.parseInt(br.readLine());
        final int first =301;   //3월 1일
        final int last = 1201;  // 11월 30일 (12월 1일 전까지)
        int[][] days = new int[nums][2];
        for (int i = 0; i < nums; i++) {
            String a = br.readLine();
            String[] b = a.split(" ");
            int startMonth = Integer.parseInt(b[0]);
            int startDay = Integer.parseInt(b[1]);
            int endMonth = Integer.parseInt(b[2]);
            int endDay = Integer.parseInt(b[3]);
            days[i][0] = 100*startMonth + startDay;
            days[i][1] = 100*endMonth + endDay;
        }

        int max = 0,answer=0,temp =first;
        //max : 직전 꽃이 지는 날 보다 빨리 피는 것중 가장 늦게 지는 꽃의 지는 날짜
        //temp : 직전 꽃이 지는 날짜
        while (max < last) {
            for (int i = 0; i < nums; i++) {
                if (temp >= days[i][0]) {      //직전 꽃이 지는 날보다 빨리 피는 꽃 중
                    if (max < days[i][1]) {
                        max = days[i][1];      //max에 가장 늦게 지는 날짜 대입입
                        days[i][0] =9999;
                   }
                }
            }
            if(temp==max){
                answer=0;
                break;
            }
            temp=max;  //가장 늦게 지는 날짜가 직전 꽃이 지는 날짜가 됨
            answer++;
        }
        System.out.println(answer);
    }
}