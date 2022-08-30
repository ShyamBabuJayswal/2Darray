import java.util.Scanner;
public class declartion_input_print {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int column=sc.nextInt();
        //decartion
        //Data type[] [] array=new int[][];
        int[][] arr = new int[rows][column];
        //input
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //output
        for(int i=0;i<rows;i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }



    }
}