import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyList {
    public void list(int[] L, int i){
    int j = 0;
    int curr = L[j];
    int cnt=0;
    int inx;
    int rep;
    while (cnt<L.length-1){
        inx = (i+j)%(L.length);
        rep = L[inx];
        System.out.println("j: "+j+" curr: "+curr+" inx: "+inx+" rep: "+rep);
        L[0]=rep;
        L[inx]=curr;
        j=inx;
        curr=rep;
        cnt++;
        for (int num:L) {
            System.out.print(num+",");
        }
    }

}}
