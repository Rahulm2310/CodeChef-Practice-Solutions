  
/*
 * Title   : Enormous Input Test
 * Status  : ACCEPTED
 * Time    : 1.59 sec
 * Problem : https://www.codechef.com/problems/INTEST
 */
 
import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        
        for(int i=0;i<n;i++){
            int t = sc.nextInt();
            if(t%k == 0){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
