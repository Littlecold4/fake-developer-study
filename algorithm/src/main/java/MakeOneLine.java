import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;

public class MakeOneLine {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] order = br.readLine().split(" ");
        Stack<Integer> orderInt = new Stack<Integer>();

        for(String o : order) orderInt.push(Integer.parseInt(o));

        LinkedList<Integer> orderList = new LinkedList<Integer>();
        while(!orderInt.isEmpty()){
            int leftSide = orderInt.pop();
            orderList.add(leftSide,N--);
        }

        while(orderList.stream().count()!=1) {
            System.out.print(orderList.pop());
            System.out.print(" ");
        }
        System.out.print(orderList.pop());
    }
}
