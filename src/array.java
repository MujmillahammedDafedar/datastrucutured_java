import java.util.*;
public class array {
    public static void main(String args[]){
        int arr[] = new int[100];
        Scanner get =new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = get.nextInt();
        System.out.println("Enter total " +n + "elements");
        for(int i =0 ; i <  n ;i++){
            int element = get.nextInt();
            arr[i] = element;
        }
        System.out.println("Elements of array are: ");
        for(int i =0; i<n ;i++){
            System.out.println(arr[i]+"\n");

        }


    }
}
