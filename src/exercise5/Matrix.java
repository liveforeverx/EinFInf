package exercise5;

public class Matrix {
	int matrix[][];
	
	public Matrix(int[][] matrix){
		this.matrix = matrix;
	}
	
	public static boolean isTriangularMatrix(Matrix m){
		return m.isTriangularMatrix();
	}

	public boolean isTriangularMatrix(){
		for(int i=0; i<matrix.length; i++){
			for(int j=i+1; j<matrix[i].length; j++){
				if(matrix[j][i] != 0){ return false; }
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[][] array = new int[10][10];
		for(int i=0; i<10; i++)
			for(int j=0; j<10; j++)
				if(j>=i)array[i][j] = (int)(8*Math.random()) + 1;
		Matrix newmatrix = new Matrix(array);
		System.out.println(newmatrix.toString());
		System.out.println(newmatrix.isTriangularMatrix());
		System.out.println(isTriangularMatrix(newmatrix));
		array[6][3] = 5;
		System.out.println(newmatrix.toString());
		System.out.println(newmatrix.isTriangularMatrix());
		System.out.println(isTriangularMatrix(newmatrix));
	}

	public String toString() {
		String news = "";
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[i].length; j++)
				news += Integer.toString(matrix[i][j]) + " ";
			news += "\n";
		}
		return news;
	}
}