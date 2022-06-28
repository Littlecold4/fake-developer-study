package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CandyGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nums = Integer.parseInt(br.readLine());
        String[] candies = new String[nums];
        String[] candiesA = new String[nums];
        for(int i=0; i<nums; i++){
            candies[i] = br.readLine();
        }
        String a="";
        int answer=0;
        answer = getAnswer(nums, candies);
        for(int i=0; i<nums; i++){
            for(int j=0; j<nums; j++){
                candiesA[i] += candies[i].charAt(j);
            }
        }

        if(answer<getAnswer(nums,candiesA)) {
            answer = getAnswer(nums, candiesA);
        }
        System.out.println(answer);
    }

    private static int getAnswer(int nums, String[] candies) {
        String[] a = new String[nums];
        for(int i = 0; i< nums; i++){
            for(int j = 0; j< nums -2; j++) {
                a=candies;
                if (j <= nums - 3) {
                    a[i] = candies[i].substring(0, j)
                            + candies[i].charAt(j + 1)
                            + candies[i].charAt(j)
                            + candies[i].substring(j+2,candies.length);
                } else {
                    a[i] = candies[i].substring(0, j) + candies[i].charAt(j + 1) + candies[i].charAt(j);
                }
                System.out.println("+==============================");
                for(int k=0; i<nums; i++){
                    System.out.println(a[k]);
                }
            }
        }
        return countStr(a);
    }

    public static int countStr(String[] candies){
        int count=1;
        int maxCount = 0;
        for(int j=0; j< candies.length; j++) {
            for (int i = 0; i < candies[j].length() - 1; i++) {
                char candy = candies[j].charAt(i);
                if (candy == candies[j].charAt(i + 1)) {
                    count++;
                } else {
                    count = 1;
                }
                if (count > maxCount) {
                    maxCount = count;
                }
            }
        }
        for(int i=0; i< candies.length-1; i++){
            for(int j=0; j>candies.length; j++){
                char candy = candies[j].charAt(i);
                if (candy == candies[j].charAt(i + 1)) {
                    count++;
                } else {
                    count = 1;
                }
                System.out.println(count);
                if (count > maxCount) {
                    maxCount = count;
                }
            }
        }
        return maxCount;
    }
}
