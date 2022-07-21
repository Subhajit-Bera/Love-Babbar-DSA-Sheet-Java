
//Custom Stack Exception
class StackException extends Exception{
    public StackException(String message){
        super(message);
    }
}

//Custom stack implementation
class CustomStack{
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int top=-1;

    public CustomStack(){
        this(DEFAULT_SIZE); //Call below the constructor
    }

    public CustomStack(int size){
        data=new int[size];
    }

    public void push(int value) throws StackException{
        if(isFull()){
            throw new StackException("Stack is full!!");
        }
        top++;
        data[top]=value;
    }

    public int pop() throws StackException {
        if(isEmpty()){
            throw new StackException("Stack is Empty!!");
        }
        int popped=data[top];
        top--;
        return popped;

    }


    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Can't peek from an empty stack");
        }
        return data[top];
    }


    public boolean isFull(){
        if(top== data.length-1){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }

    public void printStack(){
        if(top==-1){
            System.out.println("Stack is empty");
        }else{
            int i=top;
            while(i>=0){
                System.out.println(data[i]);
                i--;
            }
        }

    }

    public int size(){
        return top+1;
    }

}


public class Q1_StackImplementation {
    public static void main(String[] args) throws StackException{
        CustomStack stack1=new CustomStack(5);

        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);
        stack1.push(50);

        stack1.printStack();

        stack1.pop();
        stack1.printStack();
    }
}
