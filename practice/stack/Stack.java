package practice.stack;

public class Stack {

    int [] array;
    int top;
    int size;
    public Stack(){
        this.top=-1;
        this.array=new int[5];
        this.size=array.length;
    }

    public void push( int data){
        top++;
        array[top]=data;
    }

    public int pop(){
        return array[top--];
    }
    public void printStack(){
        for (int i: array){
            System.out.println(i+"  ");
        }
        System.out.println();
    }
}
