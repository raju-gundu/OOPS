package pkg1;

import java.util.Stack;

public class myStack<E> {
    private int arr[];
    private int top;
    private int size;
    myStack(int size){
        arr = new int[size];
        top = -1;
        this.size = size;
    }
    public void push(int x){
        if(isFull()){
            System.out.println("Stack is full");
            System.exit(1);
        }
        arr[++top] = x;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            System.exit(1);
        }
        return arr[top--];
    }
    public int size(){
        return top+1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public Boolean isFull(){
        return top==size-1;
    }
    public void printStack(){
        for(int i=top; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        myStack stack = new myStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.printStack();
        stack.pop();
        stack.printStack();

    }
}
