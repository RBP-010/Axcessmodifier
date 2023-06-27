package com.basicjava;

public class Multidi {
    public static void main(String[] args) {
char[][] matrixform = {{'x','o','x'},{'o','x','o'},{'x','o','x'}};
        Multidi object = new Multidi();
        object.matrixmethod(matrixform);
    }
    public void matrixmethod(char[][]matrixform){
        for (int i=0;i<matrixform.length;i++){
            for (int j=0;j<matrixform[i].length;j++){
                System.out.print(" "+matrixform[i][j]);
            }
            System.out.println();
        }
    }
}
