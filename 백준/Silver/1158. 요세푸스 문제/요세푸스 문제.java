import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        for(int n = 1; n <= N; n++){
            q.add(n);
        }

        List<Integer> list = new ArrayList<>();
        while(!q.isEmpty()){
            for(int i = 1; i < K; i++){
                q.add(q.poll());    
            }
            list.add(q.poll());
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for(int i = 0; i < list.size(); i++){
            if(i == list.size() - 1){
                sb.append(list.get(i));
                continue;
            }
            sb.append(list.get(i)).append(", ");
        }
        sb.append(">");
        
        System.out.println(sb.toString());
        sc.close();
    }
}