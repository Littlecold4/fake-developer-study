package DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PostApartNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =Integer.parseInt(br.readLine());
        String[][] house = new String[N][N];
        List<Integer> answerList = new ArrayList<>();

        for(int i=0; i<N; i++){
            house[i] = br.readLine().split("");
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(house[i][j].equals("0")) continue;
                answerList.add(dfs(house,i,j,0,N));
            }
        }
        Collections.sort(answerList);
        System.out.println(answerList.size());
        for(int i=0; i< answerList.size(); i++){
            System.out.println(answerList.get(i));
        }
    }
    private static int dfs(String[][] house,int x, int y,int houseNum,int N){
        house[x][y] = "0";
        houseNum++;
        if(!(x+1>=N))
            if(house[x+1][y].equals("1")) houseNum= dfs(house,x+1,y,houseNum,N);
        if(!(y+1>=N))
            if(house[x][y+1].equals("1")) houseNum= dfs(house,x,y+1,houseNum,N);
        if(!(x-1<0))
            if(house[x-1][y].equals("1")) houseNum= dfs(house,x-1,y,houseNum,N);
        if(!(y-1<0))
            if(house[x][y-1].equals("1")) houseNum= dfs(house,x,y-1,houseNum,N);
        return houseNum;

    }

}
