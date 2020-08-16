import java.util.Scanner;
import java.util.Stack;

public class stack {
    static int push(Stack stack,  int item){
        stack.push(item);
        System.out.println("Pushed :" +item);
        System.out.println("Stack elements are :" +stack);
        return 0;
    }
    static int pop(Stack stack){
        System.out.println("pop->");
        int poppedData = (int) stack.pop();
        System.out.println(poppedData);
        System.out.println("Stacked elements are: " +stack);
        return 0;
    }

   public static void main(String args[]) {
        Stack stack = new Stack();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1 for push 2 for pop");
        int option =  s.nextInt();
        if(option == 1){
            System.out.println("Enter");
            int ele = s.nextInt();
            push(stack, ele);
        }
        if(option == 2){
            int ele = s.nextInt();
            pop(stack );
        }
    }
}
