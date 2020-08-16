import java.util.Scanner;

public class reversearray {
    public  static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = s.nextInt();
        int[] yourArray = new int[size];

        int a[] =;
        int[] b = new int[a.length];
        int j = a.length;

        for (int i = 0; i < a.length; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
        for(int k = 0; k < b.length; k++){
            System.out.println(b[k]);
        }


    }
}
