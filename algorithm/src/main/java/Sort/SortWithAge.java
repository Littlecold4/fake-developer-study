package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class SortWithAge {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Object[][] objects = new Object[num][2];
        for(int i=0; i<num; i++){
            String[] input = br.readLine().split(" ");
            objects[i][0] = Integer.parseInt(input[0]);
            objects[i][1] = input[1];
        }
        Arrays.sort(objects, new Comparator<Object[]>() {
            @Override
            public int compare(Object[] o1, Object[] o2) {
                return  (int)o1[0] - (int)o2[0];
            }
        });
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<num; i++){
            sb.append(objects[i][0] + " "+objects[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}
