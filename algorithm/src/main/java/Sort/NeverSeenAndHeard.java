package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NeverSeenAndHeard {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        int neverSeenNum = Integer.parseInt(nums[0]);
        int neverHeardNum = Integer.parseInt(nums[1]);
        HashSet<String> set = new HashSet<>();
        for(int i=0; i< neverSeenNum; i++){
            String neverSeen = br.readLine();
            set.add(neverSeen);
        }
        List<String> neverSeenAndHeard = new ArrayList<>();
        for(int i=0; i<neverHeardNum; i++){
            String neverHeard = br.readLine();
            if(set.contains(neverHeard)){
                neverSeenAndHeard.add(neverHeard);
            }
        }
        Collections.sort(neverSeenAndHeard);
        StringBuffer sb = new StringBuffer();
        sb.append(neverSeenAndHeard.size()).append("\n");
        for(int i=0; i<neverSeenAndHeard.size(); i++){
            sb.append(neverSeenAndHeard.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}
