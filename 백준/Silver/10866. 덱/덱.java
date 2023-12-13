import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] dequeue = new int[10001];
        int front = 5000;
        int back = 5000;
        int size = 0;

        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        for(int n = 0; n < N; n++){
            String command = sc.next();
            if("push_front".equals(command)) {
                dequeue[front] = Integer.parseInt(sc.next());
                front++;
                size++;
            } else if("push_back".equals(command)) {
                back--;
                size++;
                dequeue[back] = Integer.parseInt(sc.next());
            } else if("pop_front".equals(command)) {
                if(size == 0){
                    sb.append(-1).append('\n');
                    continue;
                }
                sb.append(dequeue[front - 1]).append('\n');
                front--;
                size--;
            } else if("pop_back".equals(command)) {
                if(size == 0){
                    sb.append(-1).append('\n');
                    continue;
                }
                sb.append(dequeue[back]).append('\n');
                back++;
                size--;
            } else if("size".equals(command)) {
                sb.append(size).append('\n');
            } else if("empty".equals(command)) {
                if(size == 0){
                    sb.append(1).append('\n');
                } else {
                    sb.append(0).append('\n');
                }
            } else if("front".equals(command)) {
                if(size == 0){
                    sb.append(-1).append('\n');
                    continue;
                }
                sb.append(dequeue[front - 1]).append('\n');
            } else if("back".equals(command)) {
                if(size == 0){
                    sb.append(-1).append('\n');
                    continue;
                }
                sb.append(dequeue[back]).append('\n');
            }
        }

        System.out.println(sb.toString());
        sc.close();
    }
}