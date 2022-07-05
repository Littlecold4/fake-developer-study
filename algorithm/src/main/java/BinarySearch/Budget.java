package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Budget {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] budgets = new int[num];
        String[] budgetStr = br.readLine().split(" ");
        for (int i = 0; i < num; i++) {
            budgets[i] = Integer.parseInt(budgetStr[i]);
        }
        int budgetLimit = Integer.parseInt(br.readLine());
        Arrays.sort(budgets);
        System.out.println(binarySearch(budgets,budgetLimit));
    }
    public static int binarySearch(int[] budgets,int budget){
        int end = budget;
        int start =0;
        int mid;
        int sum;
        int no=0;
        for(int i=0; i<budgets.length; i++){
            no+=budgets[i];
        }
        if(no<=budget) return budgets[budgets.length-1];
        while(true){
            sum=0;
            mid = (start+end)/2;
            if(start>end) break;
            for(int i=0; i<budgets.length; i++){
                if(budgets[i]>mid) sum +=mid;
                else sum +=budgets[i];
            }
            if(sum>budget) end = mid -1;
            else if (sum<budget) start =mid+1;
            else return mid;
        }
        return end;
    }
}
