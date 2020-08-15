/*
 * Title   : Turbo Sort
 * Time    : 4.1 sec
 * Status  : ACCEPTED
 * Problem : https://www.codechef.com/problems/TSORT
 */
 
import java.util.*;

class TSORT{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<t;i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        Iterator<Integer> i = list.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        sc.close();
    }
}
