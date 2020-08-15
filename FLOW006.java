/*
 * Title   : ATM
 * Time    : 0.16 sec
 * Status  : ACCEPTED
 * Problem : http://www.codechef.com/problems/HS08TEST
 */

import java.util.Scanner;

class FLOW006{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0;i<t;i++){
            int n = sc.nextInt();
            String num = String.valueOf(n);
            char a[] = num.toCharArray();
            int sum = 0;
            for(int j=0;j<a.length;j++){
                sum+=Integer.parseInt(String.valueOf(a[j]));
            }
            System.out.println(sum);
        }
    }
}
