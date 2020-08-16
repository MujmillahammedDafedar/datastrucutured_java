import java.util.*;

public class twoarray {
    public static void main(String args[]){
        int two[][] = {{1,2,3,9},{4,5,6,7}};
        Scanner get =new Scanner(System.in);
//        System.out.println("Enter size of row");
//        int row = get.nextInt();
//        System.out.println("Enter the size of ");
//        int colum = get.nextInt();
//        for(int i=0; i < row;i++){
//            two[i][i] = get.nextInt();
//            for(int j =0;j<colum;j++){
//                two[j][j] = get.nextInt();
//            }
//
//        }
        System.out.println("Elements are");

        for(int i=0; i < two.length;i++){
            for(int j =0;j<two[i].length;j++){
               // two[i][j] =  + j;
                System.out.print(two[i][j] + " ");

            }
            System.out.println("");


        }

    }

}
