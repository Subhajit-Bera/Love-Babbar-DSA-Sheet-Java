
//Merge 2 sorted arrays without using Extra space.


import java.util.Arrays;

public class Q12_Merge2SortedArrays {
    //Approach 1: Brute Force
    //TC:0(n)+0(n)+0(nlogn)+0(n)+0(n)
    //SC: 0(2n);
//    public static void merge(int[] nums1, int m, int[] nums2, int n){
//        if(n==0 || m==0){
//            return;
//        }
//        int [] arr1=new int[m+n];
//        for(int i=0;i<m;i++){
//            arr1[i]=nums1[i];
//        }
//        int x=0;
//        for(int i=m;i<m+n;i++){
//            arr1[i]=nums2[x];
//            x++;
//        }
//
//        Arrays.sort(arr1);
//        for(int i=0;i<m;i++){
//            nums1[i]=arr1[i];
//        }
//        int k=0;
//        for(int j=m;j<m+n;j++){
//            nums2[k]=arr1[j];
//            k++;
//        }
//
//    }



    //Approach 2: 3 pointer method
    //TC: 0(n)+0(nlogn)+0(nlogn) -> 0(nlogn)
    //SC:0(1)
    public static void swap(int [] nums1,int[] nums2,int k,int j){
        int temp=nums1[k];
        nums1[k]=nums2[j];
        nums2[j]=temp;
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n){
        if(n==0 || m==0){
            return;
        }

        int i=0; //Starting index of first array(nums1)
        int j=0; //Starting index of second array(nums2)
        int k=m-1; //Ending index of first array(nums1)

        while(i<=k && j<n){ // n= length of 2nd array
            if(nums1[i]>nums2[j]){
                swap(nums1,nums2,k,j);
                j++;
                k--;
            }else{
                i++;
            }
        }

        Arrays.sort(nums1);
        Arrays.sort(nums2);
    }
    public static void main(String[] args){
        int[]ar1= {1, 5, 9, 10, 15, 20};
        int[]ar2 = {2, 3, 8, 13};
        merge(ar1,ar1.length,ar2,ar2.length);

        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));
    }

}
