package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class AgeCard {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> set = new HashSet<>();
        int myNum = Integer.parseInt(br.readLine());
        String[] myCards = br.readLine().split(" ");
        for(int i=0; i<myNum; i++){
            set.add(myCards[i]);
        }
        int otherNum = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        String[] otherCards = br.readLine().split(" ");
        for(int i=0; i<otherNum; i++){
            if(set.contains(otherCards[i])){
                sb.append("1 ");
            }else{
                sb.append("0 ");
            }
        }
        System.out.println(sb);
    }
}
