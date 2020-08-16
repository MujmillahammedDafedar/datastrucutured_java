import java.util.Scanner;

public class searching {
    public static void main(String args[]){
        int arr[] = new int[400];
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i =0; i< n; i++){
            int element =  s.nextInt();
            arr[i] = element;
        }
        System.out.print("Enter the seached element");
        int sec = s.nextInt();
        for(int i= 0; i< n; i++){
            if(arr[i] == sec){
                System.out.println("Element found at"+ i+" position is "+arr[i]);
                System.exit(0);
            }

        }

    }


}
