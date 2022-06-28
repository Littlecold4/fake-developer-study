package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class threeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] threeNumbers = new int[3];
        String[] nums = br.readLine().split(" ");
        threeNumbers[0] = Integer.parseInt(nums[0]);
        threeNumbers[1] = Integer.parseInt(nums[1]);
        threeNumbers[2] = Integer.parseInt(nums[2]);
        Arrays.sort(threeNumbers);
        System.out.println(threeNumbers[2]);
    }
}
