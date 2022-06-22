package Greedy;

import java.util.Scanner;
class Coin0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int answer = 0;
        String nums = scan.nextLine();
        int number = Integer.parseInt(nums.split(" ")[0]);
        int money = Integer.parseInt(nums.split(" ")[1]);
        int[] moneys = new int[number];
        for(int i=0; i<number; i++){
            moneys[i] = Integer.parseInt(scan.nextLine());
        }
        int i;
        for(i=number-1;i>=0;i--){
            answer+=money/moneys[i];
            money%=moneys[i];
        }
        System.out.println(answer);
    }
}