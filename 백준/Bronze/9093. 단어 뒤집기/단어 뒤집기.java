import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        
        for (int t = 0; t < tc; t++) {
            String input = br.readLine();
            String[] pieces = input.split(" ");
            
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < pieces.length; j++) {
                for (int i = pieces[j].length() - 1; i >= 0; i--) {
                    sb.append(pieces[j].charAt(i));
                }
                sb.append(" ");
            }
            System.out.println(sb.toString());
        }
        
        br.close();
    }
}