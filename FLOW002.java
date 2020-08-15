/*
 * Title   : Find Remainder 
 * Time    : 0.16 sec
 * Status  : ACCEPTED
 * Problem : https://www.codechef.com/problems/FLOW002
 */

import java.util.Scanner;

class FLOW002{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i=0;i<t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int rem = a%b;
            System.out.println(rem);
        }
        sc.close();
    }
}
