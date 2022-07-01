package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CountScore {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<num; i++){
            String[] numStr = br.readLine().split(" ");
            int[] nums = new int[5];
            for(int j=0; j<5; j++){
                nums[j] = Integer.parseInt(numStr[j]);
            }
            Arrays.sort(nums);
            if(nums[3]-nums[1]>=4) sb.append("KIN").append("\n");
            else sb.append(nums[1] + nums[2] + nums[3]).append("\n");
        }
        System.out.println(sb);
    }
}
