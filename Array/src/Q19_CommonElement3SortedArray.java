
import java.util.*;

public class Q19_CommonElement3SortedArray {

    //Approach 1: Using 3 pass and Extra Space
    //TC: O(n+nn) [We also can consider 0(logn) cause every operation in TreeSet takes 0(logn) time]
    //SC:0(n+n+n) -> 0(3n)  [We also can consider 0(n) for returned ArrayList]

//    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
//    {
//        HashSet<Integer> hs1=new HashSet<>();
//        HashSet<Integer> hs2= new HashSet<>();
//        TreeSet<Integer> ts=new TreeSet<>();  //We are using TreeSet because of that we don't have to sort the result at the end
//
//        for(int i=0;i<n1;i++){
//            hs1.add(A[i]);
//        }
//
//        for(int i=0;i<n2;i++){
//            if(hs1.contains(B[i])){
//                hs2.add(B[i]);
//            }
//        }
//
//        for(int i=0;i<n3;i++){
//            if(hs2.contains(C[i])){
//                ts.add(C[i]);
//            }
//        }
//
//        if(ts.size()==0){
//            return new ArrayList<>(List.of(-1));
//        }
//
//        return new ArrayList<>(ts);
//    }

    //Approach 2: Using 3 Pointer
    //TC: 0(n+n+n)
    //SC: 0(1)
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        ArrayList<Integer> ans=new ArrayList<>();

        int i=0; //Starting index of array A[]
        int j=0; //Starting index of array B[]
        int k=0; //Starting index of array C[]

        while(i<n1 && j<n2 && k<n3){
            if(A[i]==B[j] && B[j]==C[k]){
                if(! ans.contains(A[i])){  //If given arrays contain duplicate common elements, it will take care of it
                    ans.add(A[i]);
                }
                i++;
                j++;
                k++;
            }else if(A[i]<B[j]){
                i++;
            }else if(B[j]< C[k]){
                j++;
            }else{
                k++;
            }
        }

        if(ans.size()==0) return new ArrayList<>(List.of(-1));

        return ans;
    }


}
