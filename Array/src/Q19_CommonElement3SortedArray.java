
import java.util.*;

public class Q19_CommonElement3SortedArray {

    //Approach 1: Using 3 pass and Extra Space
    //TC: O(n)+0(n)+0(n) [We also can consider 0(logn) cause every operation in TreeSet takes 0(logn) time]
    //SC:0(n+n+n) -> 0(3n)  [We also can consider 0(n) for returned ArrayList]
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        HashSet<Integer> hs1=new HashSet<>();
        HashSet<Integer> hs2= new HashSet<>();
        TreeSet<Integer> ts=new TreeSet<>();  //We are using TreeSet because of that we don't have to sort the result at the end

        for(int i=0;i<n1;i++){
            hs1.add(A[i]);
        }

        for(int i=0;i<n2;i++){
            if(hs1.contains(B[i])){
                hs2.add(B[i]);
            }
        }

        for(int i=0;i<n3;i++){
            if(hs2.contains(C[i])){
                ts.add(C[i]);
            }
        }

        if(ts.size()==0){
            return new ArrayList<>(List.of(-1));
        }

        return new ArrayList<>(ts);
    }

    //Approach 3: Using 3 Pointer
}
