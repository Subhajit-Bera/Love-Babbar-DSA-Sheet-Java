
//Question :  https://practice.geeksforgeeks.org/problems/max-min/1

//TC: 0(n)  SC:0(1)

class Pair{
    int max,min;
    public Pair(int max,int min){
        this.max=max;
        this.min=min;
    }

}

public class Q2_MaxAndMinElementArray {

    public static int findSum(int A[],int N)
    {
        //code here
        Pair p=new Pair(A[0],A[0]);

        for(int i=1;i<N;i++){
            if(A[i]>p.max){
                p.max=A[i];
            }

            if(A[i]<p.min){
                p.min=A[i];
            }
        }

        return p.max+p.min;
    }

    public static void main(String[] args) {
        int [] A={-2, 1, -4, 5, 3};
        System.out.println(findSum(A,A.length));
    }
}
