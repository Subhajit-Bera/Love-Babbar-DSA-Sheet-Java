

//Problem Link: https://practice.geeksforgeeks.org/problems/array-subset-of-another-array2317/1

import java.util.*;
public class Q27_ArraySubsetOfAnotherArray {
//    public static String isSubset( long a1[], long a2[], long n, long m){
//        Arrays.sort(a1);
//        Arrays.sort(a2);
//
//        int i=0;
//        int j=0;
//        int count=0;
//        while(i<n && j<m){
//            if(a1[i]==a2[j]){
//                i++;
//                j++;
//                count++;
//            }else if(a1[i]<a2[j]){
//                i++;
//            }else if(a1[i]>a2[j]){
//                j++;
//            }
//        }
//
//        if(count==n || count==m){
//            return "Yes";
//        }else {
//            return "No";
//        }

//    }


    //Optimal Approach : Using Array
    //TC:0(n)
    //SC:0(n)
    public static String isSubset( long a1[], long a2[], long n, long m){
        List<Long> list=new ArrayList<>();
        for(Long i: a1){
            list.add(i);
        }

        for(Long j: a2){
            if(list.contains(j)){
                list.remove(j);
            }else{
                return "No";
            }
        }

        return "Yes";
    }
    public static void main(String[] args){
        long[] arr1={1, 2, 3, 4, 5, 6};
        long[] arr2={1, 2, 4, 1};

        System.out.println(isSubset(arr1,arr2,arr1.length,arr2.length));
    }
}
