package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ShareSnack {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        int cousinNum = Integer.parseInt(nums[0]);
        int snackNum = Integer.parseInt(nums[1]);
        int[] snackLength = new int[snackNum];
        String[] snackLengthStr = br.readLine().split(" ");
        for(int i=0; i<snackNum; i++){
            snackLength[i] = Integer.parseInt(snackLengthStr[i]);
        }
        System.out.println(binarySearch(snackLength,cousinNum));
    }

    private static int howMany(int[] snackLength, int length){
        int result = 0;
        for(int i=0; i<snackLength.length; i++){
            result += snackLength[i]/length;
        }
        return result;
    }

    public static long binarySearch(int[] snackLength,int cousinNum){
        int mid=0;
        int start = 1;
        int end =1_000_000_000;
        int howManySnacks;
        while (true) {
            if(start>=end) break;;
            mid = (start+end)/2;
            howManySnacks = howMany(snackLength,mid);
//            System.out.println("start = " + start);
//            System.out.println("end = " + end);
//            System.out.println("mid = " + mid);
//            System.out.println("howManySnacks = " + howManySnacks);
            if(howManySnacks<cousinNum){
                end = mid;
            }else{
                start=mid+1;
            }
        }
        return start-1;
    }
}
