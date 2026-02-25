import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Deque {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<String> deque = new ArrayList<>();
        for(int i=0; i<N; i++){
            String[] input = br.readLine().split(" ");
            if(input[0].equals("push_front")){
                deque.add(0,input[1]);
            }else if (input[0].equals("push_back")){
                deque.add(input[1]);
            }else if(input[0].equals("pop_front")){
                if(deque.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(deque.remove(0));
            }else if(input[0].equals("pop_back")){
                if(deque.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(deque.remove(deque.size()-1));
            } else if (input[0].equals("size")) {
                System.out.println(deque.size());
            } else if (input[0].equals("empty")) {
                if(deque.isEmpty()) System.out.println(1);
                else System.out.println(0);
            } else if (input[0].equals("front")) {
                if(deque.isEmpty()) System.out.println(-1);
                else System.out.println(deque.get(0));
            } else if (input[0].equals("back")) {
                if(deque.isEmpty()) System.out.println(-1);
                else System.out.println(deque.get(deque.size()-1));
            }
        }
    }
}
