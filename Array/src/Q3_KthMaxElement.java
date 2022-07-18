import java.util.PriorityQueue;

//https://leetcode.com/problems/kth-largest-element-in-an-array/

//TC: 0(nlogk)
public class Q3_KthMaxElement {
    public static int findKthLargest(int[] nums, int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for (int num : nums) {
            pq.offer(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        return pq.peek();
    }

    public static void main(String[] args) {
        int[] nums={3,2,1,5,6,4};
        System.out.println(findKthLargest(nums,2));
    }
}
