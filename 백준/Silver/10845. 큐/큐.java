import java.util.*;
class Main {
    private static int[] queue = new int[10000];
    private static int first = 0;
    private static int last = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int N = sc.nextInt();
        for(int n = 0; n < N; n++){
            String command = sc.next();
            switch(command) {
                case "push":
                    queue[last] = sc.nextInt();
                    last++;
                    break;
                case "pop":
                    if((last - first) == 0){
                        sb.append(-1).append('\n');
                        break;
                    }
                    sb.append(queue[first]).append('\n');
                    first++;
                    break;
                case "size":
                    sb.append(last - first).append('\n');
                    break;
                case "empty":
                    if(last - first == 0){
                        sb.append(1).append('\n');
                    } else {
                        sb.append(0).append('\n');
                    }
                    break;
                case "back":
                    if(last - first == 0){
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(queue[last - 1]).append('\n');
                    }
                    break;
                case "front":
                    if(last - first == 0){
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(queue[first]).append('\n');
                    }
                    break;
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }
}