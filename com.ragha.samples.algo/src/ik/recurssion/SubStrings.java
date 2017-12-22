package ik.recurssion;

public class SubStrings {

	//One way of generating it is to generate binary representation and print the substrings that represent it...
	//for i = 0 to 2powern, take the binary representation and print the respective values.
	
	//height is n
	//Degree is 2
	// so Leaves = 2 power n
	//n X n power n  Time complexity
	// Space is n
	
	void printSubsets(char[] a,int i,char[] r,int r_size){
		if(i==a.length){
			printRes(r,r_size);
			return; // ????
		}
		
		printSubsets(a,i+1,r,r_size); // print everything to left of the tree
		r[r_size] = a[i];
		printSubsets(a, i+1, r, r_size+1);
	}
	
	void printRes(char[] r,int r_size){
		for (int i = 0; i < r_size; i++) {
			System.out.print( r[i] );
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubStrings substrings = new SubStrings();
		char[] input = {'a','b','c','d'};
		char[] res = new char[4];
		substrings.printSubsets(input, 0, res, 0);
	}
}