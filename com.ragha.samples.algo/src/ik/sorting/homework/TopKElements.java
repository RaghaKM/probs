package ik.sorting.homework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.Scanner;

public class TopKElements {

/*	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(10);
		queue.poll();
		queue.peek();
		queue.size();
	}*/


    /*
     * Complete the function below.
     */
    static int[] topK(int[] iStream, int iK){
    	PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		//Added first K elements to the queue. 
		for(int i=0; i<iK; i++){
			queue.add(iStream[i]);
		}
		
		//Now, I will try to compare and add those that are greater than the heap element which is the min. So that I retain only K elements whicha are max
		for(int j= iK; j < iStream.length; j++){
			if(iStream[j]>queue.peek()){
				queue.poll();
				queue.add(iStream[j]);
			}
		}
		
		int[] returnArr = new int[iK];
		for(int i=iK-1; i>=0; i--){
			returnArr[i] = queue.poll();
		}
		
		return returnArr;
    }

   public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        /* if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }
        int[] res;
        int iStream_size = 0;
        iStream_size = Integer.parseInt(in.nextLine().trim());
        int[] iStream = new int[iStream_size];
        for(int i = 0; i < iStream_size; i++) {
            int iStream_item;
            iStream_item = Integer.parseInt(in.nextLine().trim());
            iStream[i] = iStream_item;
        }
        int iK;
        iK = Integer.parseInt(in.nextLine().trim());*/
       // res = topK(iStream, iK);

        int[] ip = {3,4,7,1,34,65,23,12,6,7,0,32,44,2,5,4,77,222,12,18,19,91};
        int[] res = topK(ip, 10);
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int res_i = 0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }
        bw.close();
    }//End of Main
}