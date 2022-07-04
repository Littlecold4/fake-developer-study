package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Antenna {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num  = Integer.parseInt(br.readLine());
        String[] positionsStr = br.readLine().split(" ");
        int[] positions = new int[num];
        for(int i=0; i<num; i++){
            positions[i] = Integer.parseInt(positionsStr[i]);
        }
        Arrays.sort(positions);
        if(num%2==0) System.out.println(positions[num/2 -1]);
        else System.out.println(positions[num/2]);
    }
}
