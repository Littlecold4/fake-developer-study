package Failed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class StackSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> PnM = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        Integer[] nums = new Integer[n];
        for(int i=n-1; i>=0; i--){
            nums[i] = Integer.parseInt(br.readLine());
        }
        List<Integer> numList = Arrays.asList(nums);
        int x = 0;
        int[] temp = new int[n];
        for(int i=n; i>0; i++){
            for(int j=0; j<n; j++){
                q.add(nums[j]);
                PnM.add("+");
                if (nums[j] == i){
                    PnM.add("-");
                    q.poll();
                }
            }
        }
    }
}
