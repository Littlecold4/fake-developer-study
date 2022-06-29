package Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Queue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        List<Integer> numbers = new ArrayList<>();
        for(int i=0; i<num; i++){
            String[] words = br.readLine().split(" ");
            if(words[0].equals("push")){
                numbers.add(Integer.parseInt(words[1]));
            }else if(words[0].equals("pop")){
                if(!numbers.isEmpty()) {
                    System.out.println(numbers.get(0));
                    numbers.remove(0);
                }else System.out.println(-1);
            }else if(words[0].equals("size")){
                System.out.println(numbers.size());
            }else if(words[0].equals("empty")){
                if(numbers.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else if(words[0].equals("front")){
                if(!numbers.isEmpty()) {
                    System.out.println(numbers.get(0));
                }else {
                    System.out.println(-1);
                }
            }else if(words[0].equals("back")){
                if(!numbers.isEmpty()) {
                    System.out.println(numbers.get(numbers.size() - 1));
                }else {
                    System.out.println(-1);
                }
            }
        }
    }
}