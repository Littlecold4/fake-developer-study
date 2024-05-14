import java.io.BufferedReader;
import java.io.InputStreamReader;

class remoteController {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int channel = Integer.parseInt(br.readLine());
        int wrongBtnNumber = Integer.parseInt(br.readLine());
        int answer  = Integer.MAX_VALUE;
        String[] wrongBtnStr  = br.readLine().split(" ");
        int[] wrongBtn = new int[wrongBtnNumber];
        for(int i=0; i<wrongBtnNumber; i++){
            wrongBtn[i] = Integer.parseInt(wrongBtnStr[i]);
        }
        int length, channel2;
        loop1:
        for(int i=0; i<1000000; i++){
            length=1;
            channel2=i;
            int channelGap = Math.abs(i - channel);
            loop2:
            while(channel2>=10){
//                System.out.println(channel2);
//                System.out.println(length);
                length++;
                loop3:
                for(int j=0; j<wrongBtnNumber; j++){
                    if(channel2%10 == wrongBtn[j]) break loop2;
                }
                channel2 = channel2/10;
            }
            if(answer>length+channelGap &&channel2<10) {
                System.out.println("i="+i);
                System.out.println("length ="+length);
                System.out.println("channelGap="+channelGap);
                System.out.println(" ");
                answer = length+channelGap;


            }
        }
        System.out.println("answer="+answer);
    }
}
