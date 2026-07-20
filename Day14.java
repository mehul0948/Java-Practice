// 2D array

public class Day14 {
    public static void main(String[] args) {
        System.out.println("here is your 2d array" );
        int [][] x= new int [2] [3];
        x[0][0]=1;
        x[0][1]=2;
        x[0][2]=3;
        x[1][0]=4;
        x[1][1]=5;
        x[1][2]=6;
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
            System.out.println(x[i][j]);
            }
        }
      }
}
