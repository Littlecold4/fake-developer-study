package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Minecraft {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        int column = Integer.parseInt(a.split(" ")[0]);
        int row = Integer.parseInt(a.split(" ")[1]);
        int inventory = Integer.parseInt(a.split(" ")[2]);
        int[][] map = new int[column][row];
        int max=0;
        int min =2147483647;
        for(int i=0; i<column; i++){
            String[] b = br.readLine().split(" ");
            for(int j=0; j<row; j++){
                map[i][j]=Integer.parseInt(b[j]);
                if(max<map[i][j]){
                    max = map[i][j];
                }else if(min>map[i][j]){
                    min = map[i][j];
                }
            }
        }
//        System.out.println(Arrays.deepToString(map));
//        int min=findMin(column, row, map);
//        System.out.println("min = " + min);
//        int max = findMax(column,row,map);
//        System.out.println("max = " + max);

        int minTime=2147483647;
        int height = 0;
        int nowInventory;
        for(int i=min; i<=max; i++){
            int time =0;
            nowInventory=inventory;
            for(int j=0; j<row; j++){
                for(int k=0; k<column; k++){
                    if(i<map[k][j]){
                        time +=2*(map[k][j]-i);
                        nowInventory +=map[k][j]-i;
                    }else if(i>map[k][j]){
                        time += (i-map[k][j]);
                        nowInventory +=map[k][j]-i;
                    }
                }
            }
            if(minTime>time&&nowInventory>=0){
                minTime=time;
                height= i;
            }
        }
        System.out.println(minTime+" "+ height);
    }
}
