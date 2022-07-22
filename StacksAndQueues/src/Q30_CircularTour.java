
//Minimum time required to rot all oranges


//Problem link:
//https://leetcode.com/problems/gas-station/
//https://practice.geeksforgeeks.org/problems/circular-tour-1587115620/1


public class Q30_CircularTour {
    //TC:O(n) SC:O(1)
    public int canCompleteCircuit(int[] gas, int[] cost){
        int deficit=0;
        int balance=0;
        int start=0;
        for(int i=0;i<gas.length;i++){
            balance+=gas[i]-cost[i];
            if(balance<0){
                start=i+1;
                deficit+=balance;
                balance=0;
            }
        }


        if(balance+deficit>=0){
            return start;
        }else{
            return -1;
        }
    }


    //Code 2:  TC:O(n) SC:O(1)
//    public int canCompleteCircuit(int[] gas, int[] cost) {
//        int tank = 0;
//        for(int i = 0; i < gas.length; i++)
//            tank += gas[i] - cost[i];
//        if(tank < 0)
//            return - 1;
//
//        int start = 0;
//        int accumulate = 0;
//        for(int i = 0; i < gas.length; i++){
//            int curGain = gas[i] - cost[i];
//            if(accumulate + curGain < 0){
//                start = i + 1;
//                accumulate = 0;
//            }
//            else accumulate += curGain;
//        }
//
//        return start;
//    }


    public static void main(String[] args) {

    }
}