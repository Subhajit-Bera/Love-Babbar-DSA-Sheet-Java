
//Problem Link:
//https://www.geeksforgeeks.org/move-negative-numbers-beginning-positive-end-constant-extra-space/

import java.util.Arrays;

public class Q5_MoveNegativeElements {
    public static void swap(int[] arr,int low,int high){
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
    }
    public static void moveNegative(int[] arr){
        int low=0;
        int high= arr.length-1;

        while(low<=high){
            if(arr[low]<0){
                low++;
            }else{
                swap(arr,low,high);
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={-3,5,8,9,-2,-3,-1,-11};
        moveNegative(arr);
        System.out.println(Arrays.toString(arr));
    }
}
