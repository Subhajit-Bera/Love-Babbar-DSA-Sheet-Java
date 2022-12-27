import java.util.Arrays;

public class Q28_TripletSumInArray {

    //Approach 1:
    //TC:0(nlogn+n^2) SC:0(1)
    public static boolean find3Numbers(int A[], int n, int X){
        Arrays.sort(A);
        for(int i=0;i<n-2;i++){
            int start=i+1;
            int end=n-1;

            while(start<end){
                if(A[i]+A[start]+A[end]==X){
                    return true;
                }else if(A[i]+A[start]+A[end]<X){
                    start++;
                }else{
                    end--;
                }
            }
        }
        return false;
    }

    //Approach 2: Using HashSet
    //TC:O(n+n^2) SC:0(n)


}
