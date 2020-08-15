/*
 * Title   : ATM
 * Status  : ACCEPTED
 * Time    : 0.09 sec
 * Problem : http://www.codechef.com/problems/HS08TEST
 */
 
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		double y = sc.nextDouble();
		
		if((x+0.50)>y){
		    System.out.format("%.2f",y);
		}else if(x%5!=0){
		    System.out.format("%.2f",y);
		}else {
		    System.out.format("%.2f",y-x-0.50);
		}
		sc.close();
	}
}
