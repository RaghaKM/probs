package ik.sorting.homework;

//https://www.hackerrank.com/tests/87er8nf9inb/questions/b14r3273
import java.io.*;
import java.util.*;

public class GroupNumbers_H {
    /*
     * Complete the function below.
     */
    static int[] groupNumbers(int[] intArr) {
        int pos=0;
        int temp;
        for(int i=0;i<intArr.length;i++){
            if(intArr[i]%2==0){
                temp = intArr[i];
                intArr[i] = intArr[pos];
                intArr[pos] = temp;
                pos++;
            }
        }
        return intArr;
    }

 public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }
        int[] res;
        int intArr_size = 0;
        intArr_size = Integer.parseInt(in.nextLine().trim());
        int[] intArr = new int[intArr_size];
        for(int i = 0; i < intArr_size; i++) {
            int intArr_item;
            intArr_item = Integer.parseInt(in.nextLine().trim());
            intArr[i] = intArr_item;
        }
        res = groupNumbers(intArr);
        for(int res_i = 0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }
        bw.close();
    }
}