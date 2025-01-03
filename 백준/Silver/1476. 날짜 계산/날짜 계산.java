import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int earth = sc.nextInt();
        int sun = sc.nextInt();
        int moon = sc.nextInt();
        
        long year = 0;
        int[] esm = new int[3];
        while (true) {
            for (int i = 0; i < 3; i++) {
                esm[i]++;
            }
            
            year++;
            
            if (esm[0] > 15) {
                esm[0] = 1;
            }
            
            if (esm[1] > 28) {
                esm[1] = 1;
            }
            
            if (esm[2] > 19) {
                esm[2] = 1;
            }
            
            if (esm[0] == earth && esm[1] == sun && esm[2] == moon) {
                break;
            }
        }
        
        System.out.println(year);
        sc.close();
    }
}