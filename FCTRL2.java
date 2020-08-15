/*
 * Title   : Small factorials
 * Time    : 0.09 sec
 * Status  : ACCEPTED
 * Problem : http://www.codechef.com/problems/FCTRL2
 */
 
import java.util.Scanner;
import java.math.BigInteger;

class Main
{
    public static BigInteger fact(int num){
        if(num==1){
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(num).multiply(fact(num-1));
    }
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
		    System.out.println(fact(sc.nextInt()));
		}
	}
}
