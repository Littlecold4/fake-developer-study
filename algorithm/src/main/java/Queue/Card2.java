package Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Card2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=num; i++){
            queue.offer(i);
        }
        while(true){
            queue.poll();
            if(queue.size()==1){
                System.out.println(queue.poll());
                break;
            }
            queue.add(queue.poll());
        }
        br.close();
    }
}
