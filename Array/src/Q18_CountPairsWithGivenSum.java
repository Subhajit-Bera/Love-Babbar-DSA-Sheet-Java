
//Find all pairs on integer array whose sum is equal to given number

//Problem Link:
//https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1

import java.util.*;

//Brute Force : Traverse through every n element n times using nested loop.
                //TC:0(n^2)


//Optimal Approach : Using HashMap
// Put array's element as Key and index no of the element as Value -> HashMap<Integer<Integer>
//Traverse through the array.
//Also put every element in the map with its frequency.If previously present in the map then update its frequency.
//Simultaneously check if(k-arr[i]) present in the map as key -> if(map.containsKey(k-arr[i]))
//If present then increment count with the frequency of previously present Key. -> count+=map.get(k-arr[i])

//TC: 0(n)
//SC: 0(n)
public class Q18_CountPairsWithGivenSum {
    //Optimal Approach:
    int getPairsCount(int[] arr, int n, int k) {

        int count=0;

        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            if(map.containsKey(k-arr[i])){
                count+=map.get(k-arr[i]);
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        return count;
    }
}
