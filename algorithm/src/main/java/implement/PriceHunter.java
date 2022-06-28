package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PriceHunter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nums = Integer.parseInt(br.readLine());
        int[][] rankings = new int[nums][2];
        for(int i=0; i<nums; i++){
            String[] ranking = br.readLine().split(" ");
            rankings[i][0] = Integer.parseInt(ranking[0]);
            rankings[i][1] = Integer.parseInt(ranking[1]);
        }

        for(int i=0; i<nums; i++){
            int ranking2017 = rankings[i][0];
            int ranking2018 = rankings[i][1];
            int price2017=0;
            int price2018=0;
            if(ranking2017==1){
                price2017=500;
            }else if(ranking2017>1&&ranking2017<=3){
                price2017=300;
            }else if(ranking2017>3&&ranking2017<=6){
                price2017=200;
            }else if(ranking2017>6&&ranking2017<=10){
                price2017=50;
            }else if(ranking2017>10&&ranking2017<=15){
                price2017=30;
            }else if(ranking2017>15&&ranking2017<=21){
                price2017=10;
            }
            if(ranking2018==1){
                price2018=512;
            }else if(ranking2018>1&&ranking2018<=3){
                price2018=256;
            }else if(ranking2018>3&&ranking2018<=7){
                price2018=128;
            }else if(ranking2018>7&&ranking2018<=15){
                price2018=64;
            }else if(ranking2018>15&&ranking2018<=31){
                price2018=32;
            }
            System.out.println((price2017+price2018)*10000);
        }
    }
}
