package AdHoc_ArrayProgs;

public class LeftMostOccuranceOfX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int findLeftMostX(int[] arr, int num){
		
		BinTree binTreeRoot = getBinTree(arr);
		
		while(binTreeRoot.left!=null){
			if(binTreeRoot.val == num && binTreeRoot.left.val == num)
				return binTreeRoot.left.index;
			
			if(binTreeRoot.val>num) 
				binTreeRoot = binTreeRoot.left;
			
			if(binTreeRoot.val < num)
				binTreeRoot = binTreeRoot.right;
				
		}
		return 0;
	}
	
public BinTree getBinTree(int[] arr){
	return null;
		
	}	

	class BinTree{
		BinTree left;
		BinTree right;
		int val = 0;
		int index = 0;
		
	}
	
}