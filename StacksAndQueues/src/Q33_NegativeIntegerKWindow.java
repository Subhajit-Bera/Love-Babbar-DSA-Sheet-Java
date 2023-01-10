
//First negative integer in every window of size “k”


import java.util.ArrayList;
import java.util.Arrays;


//Problem Link :
//https://practice.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1


public class Q33_NegativeIntegerKWindow {

    //TC:O(n)  SC:O(n + n/k + n/k)
    public static long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        ArrayList<Long> list=new ArrayList<>();
        ArrayList<Long> ans=new ArrayList<>();

        int start=0;
        int end=0;

        while(end<N){
            if(A[end]<0){
                list.add(A[end]);
            }

            if(end-start+1<K){
                end++;
            }else if(end-start+1==K){
                if(list.size()==0){  //If list empty no -ve Integer present in this k sized window
                    ans.add((long)0);
                }else{
                    ans.add(list.get(0));   //If list not empty then 1st value in the list will be an answer
                    if(A[start]==list.get(0)){ //if the 1st value of the list is same as the 1st value of window
                        list.remove(0);    //then pop the element from the list
                    }
                }

                start++;  //sliding the window
                end++;
            }
        }

        long[] arr=new long[ans.size()];

        for(int i=0;i<ans.size();i++){
            arr[i]=ans.get(i);
        }

        return arr;

    }

    public static void main(String[] args) {
        long[] arr={-8, 2, 3, -6, 10};
        System.out.println(Arrays.toString(printFirstNegativeInteger(arr,arr.length,2)));
    }
}
