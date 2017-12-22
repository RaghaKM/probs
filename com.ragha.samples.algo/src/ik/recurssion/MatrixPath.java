package ik.recurssion;

public class MatrixPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][] grid = {{'a','*','c','d'},{'e','f','g','h'},{'i','j','k','l'},{'m','n','0','p'}};
		//char[][] grid = {{'a','*','c'},{'e','f','g'},{'i','j','k'}};
		
		System.out.println("Paths : "+countPath(grid, 0,0));
		System.out.println("Path without '*' : "+countPathOnlyIf(grid, 0,0));
		printPath( grid, 0,0);
	}
	
	static int countPath(char[][] charGrid, int row, int col){
		int n = charGrid.length;
		int m = charGrid[0].length;
		
		//Right bottom column
		if(row==n-1 && col==m-1)
			return 1;
		
		if(row>n-1||col>n-1) return 0;
		
		int right =0;
		int down = 0;
		
		if(row < n-1 ) down = countPath(charGrid, row+1, col);

		if(col < m-1) right = countPath(charGrid, row, col+1);
		
		return down + right;
	}
	
	
	static int countPathOnlyIf(char[][] charGrid, int row, int col){
		int n = charGrid.length;
		int m = charGrid[0].length;
		
		//Right bottom column
		if(row==n-1 && col==m-1) return 1;
		if(row>n-1 || col>n-1) return 0;

		
		int right =0;
		int down = 0;
		
		if(row < n-1) {
			if(charGrid[row+1][col]!='*')				
				down = countPathOnlyIf(charGrid, row+1, col);
		}
		
		if(col < m-1){
			if(charGrid[row][col+1]!='*')
				right = countPathOnlyIf(charGrid, row, col+1);
		}
		
		return down + right;
	}
	
	static void printPath(char[][] charGrid, int row, int col){
		
		/*
		{'a','b','c','d'},
		{'e','f','g','h'},
		{'i','j','k','l'},
		{'m','n','o','p'}
		*/
		int n = charGrid.length;
		int m = charGrid[0].length;
		
		//Right bottom column
		//if(row==n-1 && col==m-1) return 1;
		//Changed the logic to ||
		
		if(row==n-1 || col==m-1) System.out.println(charGrid[row][col]);
		if(row>=n-1 || col>=m-1) return;
		
		 printPath(charGrid, row+1, col);
				printPath(charGrid, row, col+1);
				
				System.out.print(charGrid[row][col]);
		
	}
	
	static int countPath_1(char[][] charGrid, int row, int col){
		int n = charGrid.length;
		int m = charGrid[0].length;
		
		//Right bottom column
		//if(row==n-1 && col==m-1) return 1;
		//Changed the logic to ||
		
		if(row==n-1 || col==m-1) return 1;
		if(row>n-1 || col>m-1) return 0;

		return( countPath(charGrid, row+1, col) + 
				countPath(charGrid, row, col+1));
		
	}

}
