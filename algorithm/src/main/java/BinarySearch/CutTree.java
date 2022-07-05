package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CutTree {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        int trees = Integer.parseInt(nums[0]);
        int neededLength = Integer.parseInt(nums[1]);
        String[] lengthStr = br.readLine().split(" ");
        long[] treeHeights  = new long[trees];
        for(int i=0; i<trees; i++){
            treeHeights[i] = Long.parseLong(lengthStr[i]);
        }
        Arrays.sort(treeHeights);
        System.out.println(binarySearch(treeHeights,neededLength));
    }

    public static long binarySearch(long[] treeHeights,int neededLines){
        long mid=0;
        long start =0;
        long end =treeHeights[treeHeights.length-1];
        long howLongs;
        while (true) {
            if(start>=end) break;;
            howLongs=0;
            mid = (start + end)/2;
            for(int i=0; i<treeHeights.length; i++){
                if(treeHeights[i]>mid)  howLongs += (treeHeights[i]-mid);
            }
            if(howLongs<neededLines){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start-1;
    }
}
