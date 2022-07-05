package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ManageMoney {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        int N = Integer.parseInt(nums[0]);
        int M = Integer.parseInt(nums[1]);
        int[] dailyMoney =new int[N];
        for(int i=0; i<N; i++){
            dailyMoney[i] = Integer.parseInt(br.readLine());
        }
//        System.out.println(times(dailyMoney,594));
        if(N==M) {
            System.out.println(Arrays.stream(dailyMoney).max().getAsInt());
            return;
        }
        System.out.println(binarySearch(dailyMoney,M));
    }
    public static int times(int[] dailyMoney, int K){
        int result=0;
        int money = 0;
        for(int i=0; i<dailyMoney.length; i++){
            if(money<dailyMoney[i]){
                money=K;
                result++;
            }
//            System.out.println("money "+money);
//            System.out.println("d "+dailyMoney[i]);
            money-=dailyMoney[i];
        }
        return result;
    }

    public static long binarySearch(int[] dailyMoney,int M){
        int mid=0;
        int start = Arrays.stream(dailyMoney).max().getAsInt();
        int end =10000 * 100000;
        int howManyTimes;
        while (true) {
            if(start>end) break;;
            mid = (start+end)/2;
            howManyTimes = times(dailyMoney,mid);
//            System.out.println("mid " +mid);
//            System.out.println("M:"+howManyTimes);
//            System.out.println("start : "+ start);
//            System.out.println("end : "+ end);
            if(howManyTimes<=M){
                end = mid-1;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
}
