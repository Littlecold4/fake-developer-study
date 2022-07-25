package DFS;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CalculateVillager {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nums= Integer.parseInt(br.readLine());
        String[] personStr = br.readLine().split(" ");
        int fromPerson = Integer.parseInt(personStr[0]);
        int toPerson = Integer.parseInt(personStr[1]);
        int cases = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();
        Queue<int[]> queue = new LinkedList<>();
        int[][] villager = new int[cases][2];
        for(int i=0; i<cases; i++){
            String[] villageStr = br.readLine().split(" ");
            villager[i][0] = Integer.parseInt(villageStr[0]);
            villager[i][1] = Integer.parseInt(villageStr[1]);
        }
//        System.out.println(toPerson);
        int[] temp1 = {fromPerson,0};
        set.add(fromPerson);
        queue.add(temp1);
        int result =0;
        while(queue.size()!=0){
            int[] temp = queue.poll();
            set.add(temp[0]);
            if(temp[0] == toPerson){
                System.out.println(temp[1]);
                return;
            }
            for(int i=0; i<cases; i++){
                if(villager[i][0] == temp[0] &&!set.contains(villager[i][1])){
                    int[] temp2 = {villager[i][1],temp[1]+1};
                    queue.add(temp2);
                }
                if(villager[i][1]==temp[0] && !set.contains(villager[i][0])){
                    int[] temp2 = {villager[i][0],temp[1]+1};
                    queue.add(temp2);
                }
            }
//            System.out.println(Arrays.toString(set.toArray()));
        }
        System.out.println(queue.size()-1);
    }
}
