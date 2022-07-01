package Queue;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Queue2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        List<Integer> numbers = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<num; i++){
            java.lang.String[] words = br.readLine().split(" ");
            if(words[0].equals("push")){
                numbers.add(Integer.parseInt(words[1]));
            }else if(words[0].equals("pop")){
                if(!numbers.isEmpty()) {
                    System.out.println(numbers.get(0));
                    sb.append(numbers.get(0)).append("\n");
                    numbers.remove(0);
                }else sb.append(-1).append("\n");
            }else if(words[0].equals("size")){
                sb.append(numbers.size()).append("\n");
            }else if(words[0].equals("empty")){
                if(numbers.isEmpty()){
                    sb.append(numbers.get(1)).append("\n");
                }else{
                    sb.append(numbers.get(0)).append("\n");

                }
            }else if(words[0].equals("front")){
                if(!numbers.isEmpty()) {
                    sb.append(numbers.get(numbers.get(0))).append("\n");
                }else {
                    sb.append(numbers.get(-1)).append("\n");
                }
            }else if(words[0].equals("back")){
                if(!numbers.isEmpty()) {
                    sb.append(numbers.get(numbers.size() - 1)).append("\n");
                }else {
                    sb.append(-1).append("\n");
                }
            }
        }
        System.out.println(sb.toString());
    }
}

