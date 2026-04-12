import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int[] deque = new int[10001];
        int front = 5000;
        int back = 5000;
        int size = 0;
        
        int tc = Integer.parseInt(br.readLine());
        for (int t = 0; t < tc; t++) {
            String[] command = br.readLine().split(" ");
            
            if ("push_front".equals(command[0])) {
                deque[front] = Integer.parseInt(command[1]);
                front++;
                size++;
            } else if ("push_back".equals(command[0])) {
                back--;
                size++;
                deque[back] = Integer.parseInt(command[1]);
            } else if ("pop_front".equals(command[0])) {
                if (size == 0) {
                    sb.append(-1).append("\n");
                    continue;
                }
                front--;
                size--;
                sb.append(deque[front]).append("\n");
            } else if ("pop_back".equals(command[0])) {
                if (size == 0) {
                    sb.append(-1).append("\n");
                    continue;
                }
                sb.append(deque[back]).append("\n");
                back++;
                size--;
            } else if ("size".equals(command[0])) {
                sb.append(size).append("\n");
            } else if ("empty".equals(command[0])) {
                if (size == 0) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if ("front".equals(command[0])) {
                if (size == 0) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deque[front - 1]).append("\n");
                }
            } else if ("back".equals(command[0])) {
                if (size == 0) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deque[back]).append("\n");
                }
            }
        }
        
        System.out.println(sb);
        br.close();
    }
}