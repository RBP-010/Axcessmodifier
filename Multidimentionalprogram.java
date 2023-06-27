package com.basicjava;

public class Multidimentionalprogram {
    public static void main(String[] args) {
        int[][] matrixform = {{1, 2, 4}, {4, 5, 6}, {7, 8, 9}};
        Multidimentionalprogram object =new Multidimentionalprogram();
        object.matrixmethod(matrixform);
    }
    public void matrixmethod(int[][]matrixform){
        for (int i=0;i<matrixform.length;i++){
            for (int j=0;j<matrixform[i].length;j++){
                System.out.print(" "+matrixform[i][j]);
            }
            System.out.println();
        }

    }
}
