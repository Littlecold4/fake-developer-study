import java.io.*;
import java.util.HashMap;

public class FashionKing {
    public static void main(String[] args)throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int t=0; t<T; t++){
            int n = Integer.parseInt(br.readLine());
            if(n==0){
                System.out.println(0);
                continue;
            }
            HashMap<String,Integer> clothes = new HashMap<>();
            for(int i =0; i<n; i++){
                String[] input = br.readLine().split(" ");
                if (clothes.containsKey(input[1]))
                    clothes.put(input[1],clothes.get(input[1])+1);
                else
                    clothes.put(input[1],1);


            }
            int answer = 1;

            for(String cloth : clothes.keySet()){
                answer *=(clothes.get(cloth)+1);
            }

            System.out.println(answer-1);
        }
    }
}
