import java.util.Arrays;

//Problem Link
//https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
//https://leetcode.com/problems/sort-colors/submissions/

public class Q4_Sort012 {

    //Using 2Pass:
    //TC:O(2n)  SC:O(1)
    public static void sort2Pass(int[] arr) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (count0 > 0) {
                arr[i] = 0;
                count0--;
            } else if (count1 > 0) {
                arr[i] = 1;
                count1--;
            } else {
                arr[i] = 2;
                count2--;
            }
        }
    }


    //Using 1Pass:
    //TC:O(n)  SC:O(1)
    public static void sort1Pass(int[] arr,int n){
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            switch(arr[mid]){
                case 0:
                    int temp=arr[mid];
                    arr[mid]=arr[low];
                    arr[low]=temp;
                    mid++;
                    low++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    int tmp=arr[high];
                    arr[high]=arr[mid];
                    arr[mid]=tmp;
                    high--;
                    break;
            }
        }
    }



    public static void main(String[] args) {
        int[] arr={0,1,1,0,1,1,2,2,2,0,0,0,0,0};
//        sort2Pass(arr);
        sort1Pass(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
