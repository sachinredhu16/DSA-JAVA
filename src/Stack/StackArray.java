package Stack;

public class StackArray {
    static  int top =0;

    public static void push(int[] stack,int elemnent){
        if(top==stack.length){
            System.out.println("Stack is full");
            return;
        }
        stack[top] = elemnent;
        top++;
        System.out.println("Pushed");
    }
    public static void pop(int[] stack){
        if(top==0){
            System.out.println("Stack is Empty");
            return;
        }
        stack[top] = 0;
        top--;
        System.out.println("Poped");
    }

    public static void isEmpty(){
        if(top==0)
            System.out.println("Stack is Empty");
    }
    public static void topElement(int[] stack){
        System.out.println("Top element is : "+stack[top]);
    }

    public static void print(int[] stack){
        System.out.print("Stack is: ");
        for (int i=0;i<top;i++){
            System.out.print(stack[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] stack = new int[10];

        push(stack,10);
        push(stack,20);
        push(stack,30);

        pop(stack);
        print(stack);



    }
}
