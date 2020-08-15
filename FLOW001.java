/*
 * Title   : Add Two Numbers
 * Status  : ACCEPTED
 * Time    : 0.17 sec
 * Problem : https://www.codechef.com/problems/FLOW001
 */
 
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
        }
        sc.close();
    }
}
