package telran.homework;import java.lang.reflect.Array;

public class MatricesInt {
	public static int[][] multiplyConstant(int[][] matrix, int constant) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] *= constant;
			}
		}
		return matrix;
	}

	public static int[] getColumn(int[][] matrix, int column) {
		int[] newMatrix = new int[matrix.length];
		for (int i = 0; i < matrix.length; i++) {
				newMatrix[i] = matrix[i][column];
		}
		return newMatrix;
	}

	public static int[][] transpMatrix(int[][] matrix) {
		int rows = matrix.length;
		int column = matrix[0].length;
		int[][] newMatrix = new int[column][rows];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				newMatrix[j][i] = matrix[i][j];
			}
		}
		return newMatrix;
	}
}
