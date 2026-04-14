import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Deck2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        int num = 0;
        while(N-->0){
            String[] input = br.readLine().split(" ");
            switch (Integer.parseInt(input[0])){
                case 1:
                    list.add(0,Integer.parseInt(input[1]));
                    num++;
                    break;
                case 2:
                    list.add(Integer.parseInt(input[1]));
                    num++;
                    break;
                case 3:
                    if(!list.isEmpty()){
                        System.out.println(list.get(0));
                        list.remove(0);
                        num--;
                    }else
                        System.out.println(-1);
                    break;

                case 4:
                    if(!list.isEmpty()){
                        System.out.println(list.get(num-1));
                        list.remove(num-1);
                        num--;
                    }else
                        System.out.println(-1);
                    break;

                case 5:
                    System.out.println(num);
                    break;

                case 6:
                    if(!list.isEmpty())
                        System.out.println(0);
                    else
                        System.out.println(1);
                    break;

                case 7:
                    if(!list.isEmpty())
                        System.out.println(list.get(0));
                    else
                        System.out.println(-1);
                    break;

                case 8:
                    if(!list.isEmpty())
                        System.out.println(list.get(num-1));
                    else
                        System.out.println(-1);
                    break;

            }
        }
    }
}
