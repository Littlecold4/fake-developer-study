package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;

public class RoomNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nums = br.readLine();
        HashMap<Character, Float> map = new HashMap<>();
        char num;
        for (int i = 0; i < nums.length(); i++) {
            if (nums.charAt(i) == '9' ||nums.charAt(i)=='6') {
                num = '6';
                map.put(num, map.getOrDefault(num, 0F) + 0.5F);
            } else {
                num = nums.charAt(i);
                map.put(num, map.getOrDefault(num, 0F) + 1);
            }
        }
        float maxValue = Collections.max(map.values());
        System.out.println(Math.round(maxValue));
    }
}

