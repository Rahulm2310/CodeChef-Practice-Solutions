/*
 * Title   : First and Last Digit 
 * Time    : 0.16 sec
 * Status  : ACCEPTED
 * Problem : https://www.codechef.com/problems/FLOW004
 */
 
import java.util.Scanner;

class FLOW004{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int num = sc.nextInt();
            String str = String.valueOf(num);
            int sum = Integer.parseInt(str.substring(0,1)) + Integer.parseInt(str.substring(str.length()-1));
            System.out.println(sum);
        }
        sc.close();
    }
}
