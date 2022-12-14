
//Kadane's Algo [V.V.V.V.V IMP]
//This question is same as Q8(find Largest sum contiguousSub array)

//Problem Link:
//https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1


//TC: 0(n)
//SC:0(1)
public class Q13_KadaneAlgorithm {
    long maxSubarraySum(int arr[], int n){

        // Your code here
        long maxSum=Long.MIN_VALUE;

        long curSum=0;

        for(int i=0;i<n;i++){
            curSum=Math.max(curSum+arr[i],arr[i]);
            maxSum=Math.max(curSum,maxSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

    }
}
