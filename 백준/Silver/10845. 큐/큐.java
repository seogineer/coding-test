import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        LinkedList<Integer> q = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int tc = Integer.parseInt(br.readLine());
        for (int t = 0; t < tc; t++) {
            String[] input = br.readLine().split(" ");
            
            if ("push".equals(input[0])) {
                q.add(Integer.parseInt(input[1]));
            } else if ("front".equals(input[0])) {
                if (q.size() > 0) {
                    sb.append(q.get(0)).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            } else if ("pop".equals(input[0])) {
                if (q.size() > 0) {
                    sb.append(q.get(0)).append("\n");
                    q.remove(0);
                } else {
                    sb.append(-1).append("\n");
                }
            } else if ("size".equals(input[0])) {
                sb.append(q.size()).append("\n");
            } else if ("empty".equals(input[0])) {
                if (q.size() > 0) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(1).append("\n");
                }
            } else if ("back".equals(input[0])) {
                if (q.size() > 0) {
                    sb.append(q.get(q.size() - 1)).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            }
        }
        
        System.out.println(sb);
        br.close();
    }
}