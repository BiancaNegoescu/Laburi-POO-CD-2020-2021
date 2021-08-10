package task2;

import java.util.Random;

public class MyMatrix implements Sumabil {

    private int[][] matrix;

    MyMatrix() {
        matrix = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = new Random().nextInt(7 - 1) + 1;
            }
        }
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public void addValue(Sumabil value) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] += ((MyMatrix)value).getMatrix()[i][j];
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < 4; i++) {
            System.out.println(matrix[i][0] + " " + matrix[i][1] + " " + matrix[i][2] + " " + matrix[i][3]);
        }
        System.out.println();
    }

    public MyMatrix copyMatrix() {
        MyMatrix newMatrix = new MyMatrix();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                newMatrix.matrix[i][j] = this.matrix[i][j];
            }
        }
        return newMatrix;
    }
}