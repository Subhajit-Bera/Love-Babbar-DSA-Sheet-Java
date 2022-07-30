//Minimise the maximum difference between heights [V.IMP]


//Problem Link:
//Minimize Height: II -> https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1#
//Minimize the Heights I -> https://practice.geeksforgeeks.org/problems/minimize-the-heights-i/1/#submission

import java.util.Arrays;

public class Q9_MinimiseMaxDifference {

    //Minimize Height: II
    //TC:0(nlogn)  //SC: 0(1);
    static int getMinDiff(int[] arr, int n, int k){
        Arrays.sort(arr);
        int ans=arr[n-1]-arr[0];
        int smallest=arr[0]+k;
        int largest=arr[n-1]-k;

        for(int i=0;i<n-1;i++){
            int min=Math.min(smallest,arr[i+1]-k);
            int max=Math.max(largest,arr[i]+k);
            if(min<0){
                continue;
            }
            ans=Math.min(ans,max-min);
        }

        return ans;
    }


    //Minimize the Heights:I
    //TC:0(nlogn)+O(n)  SC:0(1)
    static int getMinDiff1(int[] arr,int n,int k){
        Arrays.sort(arr);
        int smallest=arr[0]+k;
        int largest=arr[n-1]-k;
        int ans=arr[n-1]-arr[0];

        for(int i=0;i<n-1;i++){
            int min=Math.min(smallest,arr[i+1]-k);
            int max=Math.max(largest,arr[i]+k);

            ans=Math.min(ans,max-min);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={3, 9, 12, 16, 20};

        int Arr[] = {1, 5, 8, 10};
        System.out.println(getMinDiff(arr,arr.length,3));
        System.out.println(getMinDiff1(Arr,Arr.length,2));
    }
}
