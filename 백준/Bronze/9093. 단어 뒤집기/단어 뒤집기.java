import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        sc.nextLine();
        for(int t = 0; t < T; t++){
            String[] input = sc.nextLine().split(" ");
            for(int repeat = 0; repeat < input.length; repeat++){
                StringBuilder sb = new StringBuilder();
                Stack<String> stack = new Stack<>();
                stack.push(" ");
                for(int i = 0; i < input[repeat].length(); i++){
                    stack.push(input[repeat].charAt(i) + "");
                }
                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }
                System.out.print(sb.toString());
            }
        }
        sc.close();
    }
}