//Write a program to cyclically rotate an array by one.


//Problem Link:
//https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1

import java.util.Arrays;

//TC:O(n)
public class Q7_OneCyclicallyRotate {
    public static void rotate(int arr[], int n)
    {
        int last=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;

    }
    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4, 5};
        rotate(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
